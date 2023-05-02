package capitulo5.TiendaMascotas;

public class Schnauzer extends Pequeños {
    public Schnauzer(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde, "Schnauzer");
    }

    @Override
    public String toString() {
        return super.toString() + "Schnauzer []";
    }


    
}
