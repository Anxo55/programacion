package capitulo5.TiendaMascotas;

public class Gatos extends Mascota {
    private String raza;
    private String tipoPelo;
    private double alturaSalto;
    private double longitudSalto;

    public Gatos(String nombre, int edad, String color, String raza, String tipoPelo, double alturaSalto, double longitudSalto) {
        super(nombre, edad, color);
        this.raza = raza;
        this.tipoPelo = tipoPelo;
        this.alturaSalto = alturaSalto;
        this.longitudSalto = longitudSalto;
    }

    public String getRaza() {
        return raza;
    }

    public String getTipoPelo() {
        return tipoPelo;
    }

    public double getAlturaSalto() {
        return alturaSalto;
    }

    public double getLongitudSalto() {
        return longitudSalto;
    }

    public static void sonido() {
        System.out.println("Los gatos maúllan y ronronean");
    }

    @Override
    public String toString() {
        return "Gatos [raza=" + raza + ", tipoPelo=" + tipoPelo + ", alturaSalto=" + alturaSalto + ", longitudSalto="
                + longitudSalto + "]";
    }

    
}
