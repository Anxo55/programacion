package capitulo5.ejemplo42;

public class LocalComercial extends Local{

    protected double valorArea;
    protected String CentroComercial;
    public LocalComercial(int idTipo, int area, String direccion, double valorArea, String centroComercial) {
        super(idTipo, area, direccion);
        this.valorArea = valorArea;
        CentroComercial = centroComercial;
    }
    @Override
    public String toString() {
        return "LocalComercial [valorArea=" + valorArea + ", CentroComercial=" + CentroComercial + "]";
    }

    
    
}
