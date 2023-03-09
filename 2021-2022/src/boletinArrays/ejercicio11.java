package boletinArrays;

import java.util.Arrays;

import java.util.Scanner;

/*
 * Leer 5 elementos num�ricos que se introducir�n
ordenados de forma creciente. �stos los guardaremos en una
tabla de tama�o 10. Leer un n�mero N, e insertarlo en el
lugar adecuado para que la tabla contin�e ordenada.
 */
public class ejercicio11 {

	public static void main(String[] args) {

		int[] array = { 1, 3, 5, 7, 9, 0, 0, 0, 0, 0 };
	
		Scanner sc = new Scanner(System.in);

	
		int valor,indice=0;
		
		// pedir
		System.out.println(Arrays.toString(array));
		
		System.out.println("N�mero a insertar");
		valor = sc.nextInt();
		// buscar su sito, evitamos pedir el indice

		while(array[indice]<valor && array[indice]!=0) {
			indice++;
		}
		// insertar para que siga ordenado
		for (int i = array.length - 1; i > indice; i--) {
			array[i] = array[i - 1];
		}
		array[indice] = valor;
		System.out.println(Arrays.toString(array));
		sc.close();

	}
}
