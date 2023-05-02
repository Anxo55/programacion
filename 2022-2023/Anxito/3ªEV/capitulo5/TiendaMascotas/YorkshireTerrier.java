package capitulo5.TiendaMascotas;

public class YorkshireTerrier extends Pequeños {
    public YorkshireTerrier(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color, peso, muerde, "Yorkshire Terrier");
    }

    @Override
    public String toString() {
        return super.toString() + "YorkshireTerrier []";
    }


    
}
