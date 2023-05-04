package capitulo5.TiendaMascotas;

public class Perros extends Mascota {
    private String raza;
    protected static String tamaño;
    private double peso;
    private boolean muerde;

    public Perros(String nombre, int edad, String color, String raza, String tamaño, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.raza = raza;
        this.tamaño = tamaño;
        this.peso = peso;
        this.muerde = muerde;
    }

    public String getRaza() {
        return raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public static void sonido() {
        System.out.println("Los perros ladran");
    }

    @Override
    public String toString() {
        return "Perros [raza=" + raza + ", peso=" + peso + ", muerde=" + muerde + "]";
    }

    
}