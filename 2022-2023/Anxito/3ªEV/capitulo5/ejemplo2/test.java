package capitulo5.ejemplo2;

import java.awt.Color;

public class test {
    
    public static void main(String[] args) {
         int[] Posicion = {10,20};
         double[] Lados = {50d,100d};
        
         Cuadrado MiCuadrado = new Cuadrado(5.6d,Color.PINK,Posicion);
         Circulo MiCirculo = new Circulo(3d,Color.red,Posicion);
         Rectangulo MiRectangulo = new Rectangulo(Lados, Color.blue, Posicion);
        
         System.out.println(MiCirculo);
         int[] Centro = MiCirculo.getCentro();
         System.out.println(Centro[0]);
        System.out.println(Centro[1]);
          
              
         System.out.println(MiRectangulo);

         System.out.println("El area es: "+MiCirculo.calculaArea());
         System.out.println("El area del rec es: "+MiRectangulo.calculaArea());
        System.out.println("El area del cuadrado es: "+MiCuadrado.calculaArea());
         }
     
}


