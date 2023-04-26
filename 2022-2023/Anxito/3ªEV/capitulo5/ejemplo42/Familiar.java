package capitulo5.ejemplo42;

public class Familiar extends Apartamento{

    protected double valorArea;
    protected int valorAdministracion;
    
    public Familiar(int idTipo, int area, String direccion, int numeroHabitaciones, int numeroBaños, double valorArea,
            int valorAdministracion) {
        super(idTipo, area, direccion, numeroHabitaciones, numeroBaños);
        this.valorArea = valorArea;
        this.valorAdministracion = valorAdministracion;
    }

    @Override
    public String toString() {
        return "Familiar [valorArea=" + valorArea + ", valorAdministracion=" + valorAdministracion + "]";
    }

    
    
}
