package poo23.ejemplo3;

import java.util.ArrayList;

public class Test2 {

    //ArrayList de objetos SeleccionFutbol. Independientemente de la clase hija a la que perteneza el objeto
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {
        
        Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        //CONCENTRACION
        System.out.println("Todos los integrantes comienzan una concentracion. (NO ejecutan el mismo método)");
        for(SeleccionFutbol integrante : integrantes) {
            System.out.println(integrante.toString()+" -> ");
            integrante.Concentrarse();
        }
        //VIAJE
        System.out.println("\nTodos los integrantes viajan para jugar un partido. (Todos ejecutan el mismo metodo)");
        for(SeleccionFutbol integrante : integrantes) {
            System.out.println(integrante.toString()+" -> ");
            integrante.Viajar();
        }

        /*ENTRENAMIENTO
        System.out.println("\nEntrenaiento: Solamente el entrenador y el futbolista tienen metodos para entrenar:");
        System.out.println(delBosque.toString()+" -> ");
        delBosque.dirigirEntrenamiento();
        System.out.println(iniesta.toString()+" -> ");
        iniesta.entrenar();

        //MASAJE
        System.out.println("\nMasaje: Solo el masajista tiene el metodo para dar un masaje");
        System.out.println(raulMartinez.toString()+" -> ");
        raulMartinez.darMasaje();

        //PARTIDO DE FUTBOL
        System.out.println("\nPartido de Futbol: Solo es entrenador y el futbolista tiene metodos para el partido de futbol");
        System.out.println(delBosque.toString()+" -> ");
        delBosque.dirigirPartido();
        System.out.println(iniesta.toString()+" -> ");
        iniesta.jugarPartido();
*/
    }
    
}
