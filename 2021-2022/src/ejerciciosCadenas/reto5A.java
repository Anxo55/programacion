package ejerciciosCadenas;

import java.util.Scanner;

/*
 * Reto 5: haga un programa que muestre por pantalla cada una de las
palabras individuales de una frase en l�neas diferentes. Para ello,
antes deber� ir averiguando las posiciones donde hay espacios en
blanco para poder delimitar d�nde empieza y termina cada palabra.

 */
public class reto5A {

	public static void main(String[] args) {
		
	
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Introduce una cadena a trocear");
		String texto=sc.nextLine();
	
		String[] palabras =texto.split(" ");
		String invPalabras=" ";
		
		for(String recorre:palabras) {
			System.out.println(recorre);
			invPalabras += " "+recorre;
		}
		System.out.println(invPalabras);
	}
}