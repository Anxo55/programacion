package capitulo5.ejemplo3;
import java.awt.Color;
import java.util.Scanner;

public class Camion extends Vehiculo {

    private byte NumeroDeEjes;

    Camion(byte NumeroDeRuedas) {
        super(NumeroDeRuedas);
    }

    Camion(Color color, byte NumeroDeRuedas) {
        super(color, NumeroDeRuedas);
    }

    Camion(Color color, byte NumeroDeRuedas,
            short Cilindrada) {
        super(color, NumeroDeRuedas, Cilindrada);
    }

    Camion(Color color, byte NumeroDeRuedas,
            short Cilindrada, short Potencia) {
        super(color, NumeroDeRuedas, Cilindrada, Potencia);

    }

    Camion(Color color, byte NumeroDeRuedas,
            byte NumeroDeEjes, short Cilindrada,
            short Potencia) {
        super(color, NumeroDeRuedas, Cilindrada, Potencia);
        EstableceNumeroDeEjes(NumeroDeEjes);
    }

    public byte DimeNumeroDeEjes() {
        return NumeroDeEjes;
    }

    public void EstableceNumeroDeEjes(byte NumeroDeEjes) {
        this.NumeroDeEjes = NumeroDeEjes;
    }

    public double pagarRodaje() {
        return super.pagarRodaje() + 2.17 * getCilindrada();
    }

    @Override
    public double pagarCarburante() {
        // TODO Auto-generated method stub

        return super.pagarCarburante()+GASOLINA*pideLitros();
        
    }

    public double pideLitros(){
        Scanner sc = new Scanner(System.in);
        System.out.println("numero de litros");
        double litros = sc.nextDouble();
        return litros;
    }

    @Override
    public String toString() {
        return "Camion [NumeroDeEjes=" + NumeroDeEjes + "ColorVehiculo=" + ColorVehiculo + ", NumRuedas=" + NumRuedas
                + ", Cilindrada=" + Cilindrada
                + ", Potencia=" + Potencia + "]";
    }

}
