import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Equipo {

    private String nombre;
    private double totalTiempo;
    private String pais;
    private ArrayList<Ciclista> lCiclistas;

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        lCiclistas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTotalTiempo() {
        return totalTiempo;
    }

    private void setTotalTiempo(double totalTiempo) {
        this.totalTiempo = totalTiempo;
    } 

    public String getPais() {
        return pais;
    }

    private void setPais(String pais) {
        this.pais = pais;
    }

    public void añadirCiclista(Ciclista ciclista) {
        lCiclistas.add(ciclista); 
    }

    public void listarEquipo() {

        for(int i=0; i<lCiclistas.size(); i++) {
            Ciclista c = (Ciclista) lCiclistas.get(i);
            c.imprimir();
        }

    }

    public void buscarCiclista() {
        boolean esta = false;
        Scanner sc = new Scanner(System.in);
        String nombreCiclista = sc.next();
        for(int i=0; i<lCiclistas.size(); i++) {
            Ciclista c = (Ciclista) lCiclistas.get(i);
            if(c.getNombre().equals(nombreCiclista)) {
                esta = true;
                System.out.println(c.getNombre());
            }
        }//fin for
        if(!esta)
        System.out.println("Nadie con ese nombre en el equipo");
    }

    public void calcularTotalTiempo() {
        for(int i=0; i<lCiclistas.size(); i++) {
            Ciclista c = (Ciclista) lCiclistas.get(i);
            totalTiempo += c.getTiempoAcumulado();
        }
    }

    public void imprimir() {
        System.out.println("Nombre del equipo = "+nombre);
        System.out.println("Pais = "+pais);
        System.out.println("Total tiempo del equipo = " +totalTiempo);
    }
    
    public void ordenaPosiciones() {
        
        //no me ordena la lista, no tengo Comparator
       Collections.sort(lCiclistas, new Comparator<Ciclista>() {
        @Override
        public int compare(Ciclista c1, Ciclista c2) {
            return c1.getTiempoAcumulado() - c2.getTiempoAcumulado();
        }

        }
       );
    //    //asignamos posiciones
    //    for(int i=0; i<lCiclistas.size(); i++) {
    //     //se recorre la lista
    //     lCiclistas.get(i).setTiempoAcumulado(i);
    //    }
        ListIterator<Ciclista> iter = lCiclistas.listIterator();
        while(iter.hasNext()) {
           
            iter.next().setPosicionGeneral(iter.nextIndex());
        }
    }

}
