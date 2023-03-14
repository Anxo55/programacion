package colecciones.mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GestionPersonal {

    static HasMap<Integer, String> gp = new HasMap<Integer, String>();

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opc=0;
        boolean seguir = true;

        do{

        System.out.println("Gestion de Personal");
        System.out.println("-------------------");
        System.out.println("Seleccione una opcion: ");
        System.out.println("1 - listar");
        System.out.println("2 - añadir");
        System.out.println("3 - modificar");
        System.out.println("4 - borrar");
        System.out.println("5 - salir");
        opc=Integer.parseInt(sc.nextLine());

        switch(opc) {

            case(1): //lista 
            for(Map.Entry pareja: gp.entrySet()){
            System.out.println(pareja);
            }
            break;

            case(2): //añadir
            System.out.println("Introduce una clave: ");
            int clave = Integer.parseInt(sc.nextLine());
            System.out.println("Introduce nombre persona: ");
            String nombre = sc.nextLine();
            gp.put(clave, nombre);
            break;
            case(3): //modificar
            System.out.println("Introduce una clave");
            int claveM = Integer parseInt(sc.nextLine());
            if(gp.containsKey(claveM)) {
                System.out.println("Valor actual: "+gp.get(claveM));
                System.out.println("introduce nuevo valor: ");
                String nombre = sc.nextLine();
                gp.put(claveM, nombre);
            }

            break;
            case(4): //borrar
            System.out.println("Introduce una clave");
            int num = Integer.parseInt(sc.nextLine());
            gp.remove(num); 
            break;
            case(5): //salir
                seguir=false;
            System.out.println("Gracias por usar gestion");
            break;
        }
    }
        while(seguir);

        
    }
}
