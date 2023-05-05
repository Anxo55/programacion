package capitulo5.ejemplo47;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Gato());
        animales.add(new Perro());
        animales.add(new Lobo());
        animales.add(new Leon());

        for(int i=0; i<animales.size(); i++) {
            if(animales.get(i) instanceof Canido)
                ((Canido) animales.get(i)).soyUnCanido();
            if(animales.get(i) instanceof Felino)
                ((Felino)animales.get(i)).soyUnFelino();
                
            System.out.println(animales.get(i).getCientifico());
            System.out.println("Sonido: "+animales.get(i).getSonido());
            System.out.println("Habitat: "+animales.get(i).getHabitat());
            System.out.println("Alimentos: "+animales.get(i).getAlimentos());
            System.out.println();
        }
    }
    
}
