package capitulo5.ejemplo42;

public class Rural extends Casa{

    protected static double valorArea=150000;
    protected int distanciaCabera;
    protected int altitud;

    public Rural(int idTipo, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos,
            double valorArea, int distanciaCabera, int altitud) {
        super(idTipo, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorArea = valorArea;
        this.distanciaCabera = distanciaCabera;
        this.altitud = altitud;
    }

    @Override
    public String toString() {
        return "Rural [valorArea=" + valorArea + ", distanciaCabera=" + distanciaCabera + ", altitud=" + altitud + "]";
    }

    
    
}
