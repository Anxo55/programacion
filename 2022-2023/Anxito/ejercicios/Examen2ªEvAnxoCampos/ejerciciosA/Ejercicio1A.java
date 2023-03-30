package ejerciciosA;

import java.util.Arrays;
import java.util.Scanner;

// Pedir por teclado la introducción de una tabla de 10 elementos
// numéricos enteros.
// Eliminar el elemento situado en una posición pedida por teclado al
// usuario sin dejar huecos en la tabla.
// Mostrar la tabla por consola después de la eliminación de dicho
// elemento.


public class Ejercicio1A {

    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int valor, numero=0;
		
		int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduzca un número "+(1+i)+" :");
            array[i] = sc.nextInt();
            }
		System.out.println(Arrays.toString(array));
		

		//Pedir indice
		System.out.println("introduce un numero");
		numero=sc.nextInt();
		
		
		//quitar posicion
		for(int i=numero;i<array.length-1;i++) {
			array[i]=array[i+1];
		}
		System.out.println(Arrays.toString(array));
		array[array.length-1]=0;
	System.out.println(Arrays.toString(array));
	}
}
    

