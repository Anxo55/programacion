package boletinArrays;

import java.util.Arrays;

/*
 * Crear un programa que lea por teclado una tabla de 10
n�meros enteros y la desplace una posici�n hacia abajo: el
primero pasa a ser el segundo, el segundo pasa a ser el
tercero y as� sucesivamente. El �ltimo pasa a ser el
primero.
 */
public class ejercicio9 {
	
	public static int [] moverDerecha(int[]array) {
		int aux =0;
		aux=array[array.length-1];
		for (int i = array.length-1; i>0; i--) {
			array[i] = array[i-1];
		}
		array[0]=aux;
		return array;
	}

	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,6,7,8,9,10 };
	
		System.out.println(Arrays.toString(array));
		moverDerecha(array);
		System.out.println(Arrays.toString(array));
		moverDerecha(array);
		System.out.println(Arrays.toString(array));
		
	}
}
