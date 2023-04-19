package capitulo5.ejemplo2;

import java.awt.Color;
import java.util.Arrays;

//EJERCICIO MUY INTERESANTE PARA QUE CAIGA EN EL EXAMEN

abstract public class Figura implements Comparable, Perimetrosa{
    
    protected Color ColorFigura;
     protected int[] Posicion = new int[2];
    
     Figura() {
     setColor(Color.black);
     Posicion[0] = 0;
     Posicion[1] = 0;
     }
    
    Figura(Color color) {
     setColor(color);
     }
    
     Figura(Color color, int[] Posicion) {
    setColor(color);
     setCentro(Posicion);
     }
    
     public void setColor(Color color) {
     ColorFigura = color;
     }
    
     public Color getColor() {
     return ColorFigura;
     }
    
     public void setCentro(int[] Posicion) {
     this.Posicion[0] = Posicion[0];
     this.Posicion[1] = Posicion[1];
     }
    
     public int[] getCentro() {
     return Posicion;
     }

    @Override
    public String toString() {
        return "Figura [ColorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion) + "]";
    }
    
     abstract public double calculaArea();

     public double Perimetro() {
        System.out.println("Esto es un metodo de figura");
        return 0d;
     }
        
     

}
