package capitulo5.ejemplo42;

public class Vivienda  extends Inmueble{

    protected int numeroHabitaciones;
    protected int numeroBaños;
    
    public Vivienda(int idTipo, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        super(idTipo, area, direccion);
        this.numeroHabitaciones = numeroHabitaciones;
        this.numeroBaños = numeroBaños;
    }

    @Override
    public String toString() {
        return "Vivienda [numeroHabitaciones=" + numeroHabitaciones + ", numeroBaños=" + numeroBaños + "]";
    }

    
    
}
