package capitulo5.TiendaMascotas2;

import java.util.ArrayList;

import capitulo5.TiendaMascotas.GatoSinPelo;
import capitulo5.TiendaMascotas2.PerroMediano.razas;

public class Test {
    public static void main(String[] args) {
        ArrayList<Mascota> lista= new ArrayList<Mascota>();
        Mascota alejandro = new Mascota("alejandro", 30, "amarillo");
        Perros perrunos = new Perros("Perruno", 7, "Marron", 20, true);
        Gatos gatunos = new Gatos("gatuno", 10, "blanco", 2, 3);
        PerroPequeño peque = new PerroPequeño("peque", 4, "negro", 17, false, PerroPequeño.razas.SCHNAUZER);
        PerroMediano medium = new PerroMediano("medium",10, "varios", 35, false, PerroMediano.razas.BULLDO);
        PerroGrande grande = new PerroGrande("covi", 3, "blue", 50, true, PerroGrande.razas.ROTWEILLER);
        GatoPeloCorto peludito = new GatoPeloCorto("peludito", 20, "negro", 2, 3, GatoPeloCorto.razas.AZUL_RUSO);
        GatoPeloLargo peludon = new GatoPeloLargo("peludon", 21, "ocre", 2, 3, GatoPeloLargo.razas.SOMALI);
        gatoSinPelo sinpe = new gatoSinPelo("sinpe", 10, "blanco", 2, 3, gatoSinPelo.razas.ESFINGE);

        lista.add(alejandro);
        lista.add(perrunos);
        lista.add(gatunos);
        lista.add(peque);
        lista.add(medium);
        lista.add(grande);
        lista.add(peludito);
        lista.add(peludon);
        lista.add(sinpe);

        for(Mascota m : lista) {
            System.out.println(m.toString());
            if(m instanceof Perros)
            Perros.sonido();
            if(m instanceof Gatos)
            Gatos.sonido();
            if(m instanceof Mascota)
            System.out.println("chaval aclarate");
        }
     }
    
    
}
