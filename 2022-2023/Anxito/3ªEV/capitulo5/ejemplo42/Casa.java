package capitulo5.ejemplo42;

public class Casa extends Vivienda{

    protected int numeroPisos;

    public Casa(int idTipo, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos) {
        super(idTipo, area, direccion, numeroHabitaciones, numeroBaños);
        this.numeroPisos = numeroPisos;
    }

    @Override
    public String toString() {
        return "Casa [numeroPisos=" + numeroPisos + "]";
    }

    
    
}
