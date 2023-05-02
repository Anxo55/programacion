package capitulo5.TiendaMascotas;

public class Chihuahua extends Pequeños{

    public Chihuahua(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde, "Chihuahua");
    }

    @Override
    public String toString() {
        return super.toString() + "Chihuahua []";
    }
    

    
}
