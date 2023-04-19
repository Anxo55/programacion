package capitulo5.ejemplo2;

import java.awt.Color;
import java.util.Arrays;

public class Circulo extends Figura {
     private double Radio;
    
     Circulo(double Radio) {
     setRadio(Radio);
           
     }
    
     Circulo(double Radio,Color color) {
     super(color);
     setRadio(Radio);
     }
    
     Circulo(double Radio, Color color, int[] Posicion) {
     super(color, Posicion);
     setRadio(Radio);
     }
    
     public void setRadio(double Radio) {
     this.Radio = Radio;
     }
    
     public double getRadio() {
         return Radio;
     }

     @Override
     public String toString() {
         return "Circulo [Radio=" + Radio + "ColorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion) + "]";
     }

     @Override
     public double calculaArea() {
        //return super.calculaArea();
        return Math.PI*Math.pow(Radio,2);
     }

    //posible problema
    //Sigue habiendo un problema
    //EJERCICIO MUY INTERESANTE PARA CAER EN EL EXAMEN
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
        super.Perimetro();
        return 2*Math.PI*getRadio();
    }     

}
