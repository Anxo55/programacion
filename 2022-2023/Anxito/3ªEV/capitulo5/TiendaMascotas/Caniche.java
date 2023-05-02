package capitulo5.TiendaMascotas;

public class Caniche extends Pequeños {
    public Caniche(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde, "Caniche");
    }

    @Override
    public String toString() {
        return super.toString() + "Caniche []";
    }


    
}
