package capitulo5.TiendaMascotas2;

public class gatoSinPelo extends Gatos{
    enum razas{
        ESFINGE, ELFO, DONSKOY
    }
    
    private  razas raza;

    public gatoSinPelo(String nombre, int edad, String color, float alturaSalto, float longitudSalto, razas raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }

    public razas getRaza() {
        return raza;
    }

    public void setRaza(razas raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "gatoSinPelo [raza=" + raza + "]";
    }

    

}
