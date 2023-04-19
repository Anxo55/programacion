package  capitulo5.ejemplo3;

import java.awt.Color;

public class Vehiculo implements Comparable{
    protected Color ColorVehiculo;
    protected byte NumRuedas;
    protected short Cilindrada;
    protected short Potencia;

    Vehiculo(Color color) {
        setColor(color);
    }

    Vehiculo(byte NumRuedas) {
        this.NumRuedas = NumRuedas;
    }

    Vehiculo(short Cilindrada) {
        this.Cilindrada = Cilindrada;
    }

    Vehiculo(Color color, byte NumRuedas) {
        this(color);
        this.NumRuedas = NumRuedas;
    }

    Vehiculo(Color color, byte NumRuedas, short Cilindrada) {
        this(color, NumRuedas);
        this.Cilindrada = Cilindrada;
    }

    Vehiculo(Color color, byte NumRuedas, short Cilindrada,
            short Potencia) {
        this(color, NumRuedas, Cilindrada);
        this.Potencia = Potencia;

    }

    public void setColor(Color color) {
        ColorVehiculo = color;
    }

    public Color getColor() {
        return ColorVehiculo;
    }

    public byte getNumRuedas() {
        return NumRuedas;
    }

    public short getCilindrada() {
        return Cilindrada;
    }

    public short getPotencia() {
        return Potencia;
    }

    public double pagarRodaje() {
        return 53.27d;
    }

    @Override
    public String toString() {
        return "Vehiculo [ColorVehiculo=" + ColorVehiculo + ", NumRuedas=" + NumRuedas + ", Cilindrada=" + Cilindrada
                + ", Potencia=" + Potencia + "]";
    }


    public int compareTo(Object arg0){
        Vehiculo v = (Vehiculo) arg0;
        if(this.pagarRodaje()>v.pagarRodaje()){
            return -1;
        }
        else if(this.pagarRodaje()==v.pagarRodaje()){
            return 0;
        }
        else
        return 1;
    }
}
