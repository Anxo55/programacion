package capitulo5.ejemplo42;

public class Oficina extends Local{

    public Oficina(int idTipo, int area, String direccion, double valorArea, boolean esGobierno) {
        super(idTipo, area, direccion);
        this.valorArea = valorArea;
        this.esGobierno = esGobierno;
    }
    protected double valorArea;
    protected boolean esGobierno;
    @Override
    public String toString() {
        return "Oficina [valorArea=" + valorArea + ", esGobierno=" + esGobierno + "]";
    }

    
    
}
