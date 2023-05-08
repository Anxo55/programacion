public class Contrarrelojista extends Ciclista{

    private double velocidadMaxima;

    public Contrarrelojista(int identificador, String nombre, double velocidadMaxima, int i, int j) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public void imprimirTipo() {
        System.out.println("Tipo: Contrarrelojista");
    }

    public void imprimirDatosContrarrelojista() {
        System.out.println("No aplica para un velocista");
    }


    
}
