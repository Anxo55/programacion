package arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
 * Ejercicio 5 Escribe un programa que pida 10 n�meros por teclado y que luego muestre los n�meros 
 * introducidos junto con las palabras �m�ximo" y "m�nimo" al lado del m�ximo y del m�nimo respectivamente.
 */
public class especialEjercicio5 {
	
	public static void main(String[] args) {

		int maximo=0;
		int minimo=0;
		int [] numeros = new int [10];
		Scanner sc = new Scanner(System.in);
		for (int k=0;k<numeros.length;k++) {
			System.out.println("Escribe un n�mero");
			numeros[k]=sc.nextInt();

		}
		System.out.println(Arrays.toString(numeros));
	
		int cont=0;
		for(int k=0;k<numeros.length;k++) {
			if(numeros[k]>=numeros[k]+1) {
				maximo=numeros[k];
			}else {
				minimo=numeros[k];
			}
		}
		System.out.println("M�ximo: "+maximo);
		System.out.println("minimo: "+minimo);
			
	
		
	}

}
