package capitulo5.TiendaMascotas;

public class Bulldog extends Medianos{

    public Bulldog(String nombre, int edad, String color, String raza, String tamaño, double peso, boolean muerde) {
        super(nombre, edad, color, raza, tamaño, peso, muerde);
        
    }

    @Override
    public String toString() {
        return super.toString() + "Bulldog []";
    }
    

    
}
