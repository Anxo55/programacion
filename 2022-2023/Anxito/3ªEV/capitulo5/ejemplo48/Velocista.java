public class Velocista extends Ciclista {
    private int potencia;
    private int velocidadPromedio;

    public Velocista(int identificador, String nombre, int potencia, int velocidadPromedio) {
        super(identificador, nombre);
        this.potencia = potencia;
        this.velocidadPromedio = velocidadPromedio;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(int velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    public void imprimirTipo() {
        System.out.println("Tipo: Velocista");
    }

    public void imprimirDatosContrarrelojista() {
        System.out.println("No aplica para un velocista");
    }
}