package Maquina;

import java.util.Scanner;

public class testMaquina {
    public static void main(String[] args){
        
        String Accion;
        char Car;
        Scanner sc = new Scanner(System.in);

        Modelo MiMaquina = new
        Modelo();
         MiMaquina.PonPrecios(1.1f, 1.3f, 0.8f);
         MiMaquina.Deposito1Euro.MeteElemento();
         MiMaquina.Deposito01Euro.MeteElemento();
         MiMaquina.Deposito01Euro.MeteElemento();
         MiMaquina.DepositoCocaCola.RellenaAlmacen();
         MiMaquina.DepositoNaranja.RellenaAlmacen();
         //MiMaquina.Deposito1Euro.RellenaAlmacen(); No nos
         // ha llegado el suministro de agua
        
         do {
         System.out.println("-- c,n,a,s --");
         Accion = sc.nextLine();
         Car = Accion.charAt(0);
         switch (Car) {
         case 'c':
         System.out.println("Ha seleccionado Coca cola");
         if(MiMaquina.DepositoCocaCola.HayElemento()) {
         if (Control.IntroduccionMonedas
         (MiMaquina,MiMaquina.DimePrecioCocaCola())) {
         MiMaquina.DepositoCocaCola.SacaElemento();
         System.out.println("No olvide coger su cocacola");
         // Sacar fisicamente la CocaCola
         }
         }
         else
         System.out.println("Producto agotado");
         break;
        
         case 'n':
         System.out.println("Ha seleccionado Naranja");
         if (MiMaquina.DepositoNaranja.HayElemento()) {
         if (Control.IntroduccionMonedas
         (MiMaquina,MiMaquina.DimePrecioNaranja())) {
         MiMaquina.DepositoNaranja.SacaElemento();
         System.out.println("No olvide coger su naranja");
         // Sacar fisicamente la Naranja
         }
         }
         else
         System.out.println("Producto agotado");
         break;
        
         case 'a':
         System.out.println("Ha seleccionado Agua");
         if (MiMaquina.DepositoAgua.HayElemento()) {
         if (Control.IntroduccionMonedas (MiMaquina, MiMaquina.DimePrecioAgua())) {
         MiMaquina.DepositoAgua.SacaElemento();
         System.out.println("No olvide coger su agua");
         // Sacar fisicamente el agua
         }
         }
         else
         System.out.println("Producto agotado");
         break;

         case 's':
         System.out.println("fin de la simulacion");
         break;
         
        
         default:
         System.out.println("Error de seleccion, intentelo de nuevo");
         break;
         }
         MiMaquina.MostrarEstadoMaquina();
        
         } while (!Accion.equals("s"));
         }
         }
