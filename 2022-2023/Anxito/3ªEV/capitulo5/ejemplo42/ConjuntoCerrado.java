package capitulo5.ejemplo42;

public class ConjuntoCerrado extends Urbana{

    protected double valorArea;
    protected double valorAdministracion;
    protected double tienePiscina;
    protected boolean tieneCamposDeportivos;
    
    public ConjuntoCerrado(int idTipo, int area, String direccion, int numeroHabitaciones, int numeroBaños,
            int numeroPisos, double valorArea, double valorAdministracion, double tienePiscina,
            boolean tieneCamposDeportivos) {
        super(idTipo, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.valorArea = valorArea;
        this.valorAdministracion = valorAdministracion;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }

    @Override
    public String toString() {
        return "ConjuntoCerrado [valorArea=" + valorArea + ", valorAdministracion=" + valorAdministracion
                + ", tienePiscina=" + tienePiscina + ", tieneCamposDeportivos=" + tieneCamposDeportivos + "]";
    }

    
    
}
