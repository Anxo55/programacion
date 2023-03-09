package arrays;

import java.util.Arrays;
import java.util.Scanner;

//Un programa que lee un n�mero conocido de valores enteros.
public class ejercicio1 {

//Se leer�n 10 valores.
	public static final int NUM_VALORES = 10;

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Escribe " + NUM_VALORES + " enteros." + "Se puede hacer en diferentes l�neas.");

		// Se leen exactamente NUM_VALORES valores.
		int leidos = 0;

		int []array = new int[NUM_VALORES];
		while (leidos < NUM_VALORES) {
			// Antes de leer, comprobamos si realmente hay un entero.
			if (lector.hasNextInt()) {
				int valor = lector.nextInt();
				System.out.println("Valor " + leidos + " le�do: " + valor);
				//guardo el valor en el array
				array[leidos]=valor;
				//incremento el indice del array
				leidos++;
			} else {
				// Si el valor no es entero, se lee pero se ignora.
				// No se avanza tampoco el contador.
				lector.next();
			}
		}
//Los valores que sobren en la �ltima l�nea escrita se descartan.
		lector.nextLine();
		System.out.println("Ya se han le�do " + NUM_VALORES + " valores.");
		
		System.out.println("El array introducido es: ");
		System.out.println(Arrays.toString(array));
	}
}