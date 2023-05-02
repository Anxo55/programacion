package capitulo5.TiendaMascotas;

public class Gatos extends Mascota{

    protected float altura;
    protected float longitudSalto;
    protected static String sonido() {
        return "los gatos maúllan y ronronean";
    }
    
    public Gatos(String nombre, int edad, String color, float altura, float longitudSalto) {
        super(nombre, edad, color);
        this.altura = altura;
        this.longitudSalto = longitudSalto;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getLongitudSalto() {
        return longitudSalto;
    }

    public void setLongitudSalto(float longitudSalto) {
        this.longitudSalto = longitudSalto;
    }

    @Override
    public String toString() {
        return super.toString() + "Gatos [altura=" + altura + ", longitudSalto=" + longitudSalto + "]";
    }

    
    
}
