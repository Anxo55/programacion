package capitulo5.ejemplo3;

import java.awt.Color;

public class Camion extends Vehiculo {
    
     private byte NumeroDeEjes;
    
     Camion(byte NumeroDeRuedas) {
     super(NumeroDeRuedas);
     }
    
     Camion(Color color, byte NumeroDeRuedas) {
     super(color,NumeroDeRuedas);
     }
    
     Camion(Color color, byte NumeroDeRuedas,
     short Cilindrada) {
     super(color,NumeroDeRuedas,Cilindrada);
     }
    
     Camion(Color color, byte NumeroDeRuedas,
     short Cilindrada, short Potencia) {
     super(color,NumeroDeRuedas,Cilindrada,Potencia);
    
    
    
     }
    
     Camion(Color color, byte NumeroDeRuedas,
     byte NumeroDeEjes, short Cilindrada,
     short Potencia) {
     super(color,NumeroDeRuedas,Cilindrada,Potencia);
     setNumeroDeEjes(NumeroDeEjes);
     }
    
     public byte setDeEjes() {
     return NumeroDeEjes;
     }
    
     public void setNumeroDeEjes(byte NumeroDeEjes) {
     this.NumeroDeEjes = NumeroDeEjes;
     }

    @Override
    public String toString() {
        return "Camion [NumeroDeEjes=" + NumeroDeEjes + "]";
    }

    @Override
    public double pagarRodaje() {
        // TODO Auto-generated method stub
        return super.pagarRodaje() +2.17*getCilindrada();
    }     
    
}
