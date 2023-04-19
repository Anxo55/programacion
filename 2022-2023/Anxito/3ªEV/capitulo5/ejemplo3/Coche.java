package capitulo5.ejemplo3;

import java.awt.Color;

public class Coche extends Vehiculo{

    //atributos
    int numeroDePuertas;

public Coche(byte NumRuedas) {
super(NumRuedas);
}

public Coche(Color color, byte NumRuedas, short Cilindrada, short Potencia) {
super(color, NumRuedas, Cilindrada, Potencia);
}

public Coche(Color color, byte NumRuedas, short Cilindrada) {
super(color, NumRuedas, Cilindrada);
}

public Coche(Color color, byte NumRuedas) {
super(color, NumRuedas);
}

public Coche(Color color) {
super(color);
}

public Coche(short Cilindrada) {
super(Cilindrada);
}

@Override
public String toString() {
return "Coche [numeroDePuertas=" + numeroDePuertas + "]";
}

@Override
public double pagarRodaje() {
    // TODO Auto-generated method stub
    return super.pagarRodaje() + 40*getNumeroPuertas;
}
  
}
