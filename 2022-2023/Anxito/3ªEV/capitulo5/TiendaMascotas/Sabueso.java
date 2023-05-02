package capitulo5.TiendaMascotas;

public class Sabueso extends Medianos{

    public Sabueso(String nombre, int edad, String color, String raza, String tamaño, double peso, boolean muerde) {
        super(nombre, edad, color, raza, tamaño, peso, muerde);
        
    }

@Override
    public String toString() {
        return super.toString() + "Sabueso []";
    }

}