package capitulo5.TiendaMascotas;

public class Collie  extends Medianos{

    public Collie(String nombre, int edad, String color, String raza, String tamaño, double peso, boolean muerde) {
        super(nombre, edad, color, raza, tamaño, peso, muerde);
        
    }

    @Override
    public String toString() {
        return super.toString() + "Collie []";
    }
    
    
    
}
