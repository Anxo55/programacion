package capitulo5.Universidad;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList<Persona> clase= new ArrayList<Persona>(); 

        Persona pepe = new Persona("Pepe", "Calle Cebem");
        Estudiante angel = new Estudiante("Angel", "Hispanidad nº32", "ninguna", 1);
        Profesor antonio = new Profesor("Antonio", "Avenida de teis nº99", "BBDD", "experto");

        clase.add(pepe);
        clase.add(angel);
        clase.add(antonio);

        for(Persona persona: clase ){
            System.out.println(persona.toString());
           // System.out.println(i.calculaPrecio());               
        }
    }
    
}
