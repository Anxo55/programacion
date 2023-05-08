public class Escalador extends Ciclista {
    private int aceleracionPromedio;
    private int gradoRampaSoportado;

    public Escalador(int identificador, String nombre, int aceleracionPromedio, int gradoRampaSoportado) {
        super(identificador, nombre);
        this.aceleracionPromedio = aceleracionPromedio;
        this.gradoRampaSoportado = gradoRampaSoportado;
    }

    public int getAceleracionPromedio() {
        return aceleracionPromedio;
    }

    public void setAceleracionPromedio(int aceleracionPromedio) {
        this.aceleracionPromedio = aceleracionPromedio;
    }

    public int getGradoRampaSoportado() {
        return gradoRampaSoportado;
    }

    public void setGradoRampaSoportado(int gradoRampaSoportado) {
        this.gradoRampaSoportado = gradoRampaSoportado;
    }

    public void imprimirTipo() {
        System.out.println("Tipo: Escalador");
    }

    public void imprimirDatosContrarrelojista() {
        System.out.println("No aplica para un velocista");
    }


}