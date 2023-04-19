package capitulo5.ejemplo2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class test {
    
    public static void main(String[] args) {

         int[] Posicion = {10,20};
         double[] Lados = {50d,100d};

         //Creamos un ArrayList
         ArrayList<Figura> lista = new ArrayList<Figura>(); 
        
         Triangulo V16 = new Triangulo(5.4, 6.3, Color.YELLOW, Posicion);
         Cuadrado MiCuadrado = new Cuadrado(5.6d,Color.PINK,Posicion);
         Circulo MiCirculo = new Circulo(3d,Color.red,Posicion);
         Rectangulo MiRectangulo = new Rectangulo(Lados, Color.blue, Posicion);

         lista.add(MiCuadrado);
         lista.add(MiRectangulo);
         lista.add(MiCirculo);
         lista.add(V16);
        
         System.out.println(MiCirculo);
         int[] Centro = MiCirculo.getCentro();
         System.out.println(Centro[0]);
        System.out.println(Centro[1]);
          
              
         System.out.println(MiRectangulo);
         System.out.println(MiCuadrado);
         System.out.println(V16);

         System.out.println("El area es: "+MiCirculo.calculaArea());
         System.out.println("El area del rec es: "+MiRectangulo.calculaArea());
         System.out.println("El area del cuadrado es: "+MiCuadrado.calculaArea());
         System.out.println("el area es: "+V16.calculaArea());

        for(Figura f : lista) {
            System.out.println(f);
            System.out.println("Su area es: "+f.calculaArea());
        }

        Collections.sort(lista);

        for(Figura f : lista) {
            System.out.println(f);
            System.out.println("perimetro: "+f.Perimetro());
            System.out.println("Su area es: "+f.calculaArea());
        }

         }
     
}


