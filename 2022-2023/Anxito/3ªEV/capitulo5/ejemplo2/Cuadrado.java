package capitulo5.ejemplo2;

import java.awt.Color;

public class Cuadrado extends Figura{

    private double Lado;
    
     Cuadrado(double Lado) {
     setLados(Lado);
     }
             
     Cuadrado(double Lado, Color color) {
     super(color);
     setLados(Lado);
     }
    
     Cuadrado(double Lado, Color color, int[] Posicion) {
     super(color, Posicion);
     setLados(Lado);
     }
    
     public void setLados(double Lado) {
     this.Lado = Lado;
   
     }
    
     public double getLados() {
     return Lado;
     }

    @Override
    public String toString() {
        return "Cuadrado [Lado=" + Lado + "]";
    }

    public double calculaArea() {
        return Lado*Lado;
    }

    //posible problema
    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        Figura c = (Figura) arg0;
        if (this.calculaArea()>c.calculaArea())
            return 1;
        else if (this.calculaArea() == c.calculaArea())
            return 0;
        else
            return -1;
    }

     @Override
     public double perimetro() {
         // TODO Auto-generated method stub
         return 0;
     }
    
}
