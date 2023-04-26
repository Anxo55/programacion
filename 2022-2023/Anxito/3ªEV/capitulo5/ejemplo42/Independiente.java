package capitulo5.ejemplo42;

public class Independiente extends Urbana{

    protected double valorArea;

    public Independiente(int idTipo, int area, String direccion, int numeroHabitaciones, int numeroBaños,
            int numeroPisos, double valorArea) {
        super(idTipo, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorArea = valorArea;
    }

    @Override
    public String toString() {
        return "Independiente [valorArea=" + valorArea + "]";
    }

    
    
}
