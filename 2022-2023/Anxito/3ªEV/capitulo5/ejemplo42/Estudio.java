package capitulo5.ejemplo42;

public class Estudio extends Apartamento{

    protected double valorArea;

    public Estudio(int idTipo, int area, String direccion, int numeroHabitaciones, int numeroBaños, double valorArea) {
        super(idTipo, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorArea = valorArea;
    }

    @Override
    public String toString() {
        return "Estudio [valorArea=" + valorArea + "]";
    }

    
    
}
