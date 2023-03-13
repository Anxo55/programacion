package poo23.ejemplo3;

import java.util.ArrayList;

public class Test3 {

    //ArrayList de objetos SeleccionFutbol. Independientemente de la clase hija a la que perteneza el objeto
    public static ArrayList<SeleccionFutbol> integrantes = new ArrayList<SeleccionFutbol>();

    public static void main(String[] args) {
        
        Entrenador cholo = new Entrenador(7, "Diego", "Simeone", 52, "XTR0016");
        Futbolista griezzman = new Futbolista(34, "Toño", "Grizman", 28, 12, "Media Punta");
        Masajista manolo = new Masajista(56, "Manuel", "Bombo", 44, "Licenciado en Sonido", 28);

        integrantes.add(cholo);
        integrantes.add(griezzman);
        integrantes.add(manolo);

        Entrenador delBosque = new Entrenador(1, "Vicente", "Del Bosque", 60, "284EZ89");
        Futbolista iniesta = new Futbolista(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
        Masajista raulMartinez = new Masajista(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

        integrantes.add(delBosque);
        integrantes.add(iniesta);
        integrantes.add(raulMartinez);

        for(SeleccionFutbol sf : integrantes) {
            System.out.println(sf.toString());
        }

        //bucle foreach donde cada objeto llame solo a sus metodos especificos
        for(SeleccionFutbol sf : integrantes) {
            System.out.println(sf.toString());
            //si es entrenador
            if(sf instanceof Entrenador) {
                ((Entrenador)sf).dirigirEntrenamiento();
                ((Entrenador)sf).dirigirPartido();
            }

            //si es futbolista
            if(sf instanceof Futbolista) {
                ((Futbolista)sf).jugarPartido();
                ((Futbolista)sf).entrenar();
            }

            //si es masajista
            if(sf instanceof Masajista) {
                ((Masajista)sf).darMasaje();
            }
        }
    
    }
}
