package listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/*
 * realiza un  programa que introduzca valores aleatorios
 * (entre 0 y 100) en un arraylist y que luego calcule la suma,
 * la media, el m�ximo y el m�nimo de esos n�meros. El tama�o de la lista
 * ser� aleatorio y podr� oscilar entre 10 y 20 alementos abmos inclusive
 */
public class palabras1 {
	
	public static String generaPalabra() {
		// Los caracteres de inter�s en un array de char.
		char[] chars = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
		// Longitud del array de char.
		int charsLength = chars.length;
		// Instanciamos la clase Random
		Random random = new Random();
		// Un StringBuffer para componer la cadena aleatoria de forma eficiente
		StringBuffer buffer = new StringBuffer();
		// Bucle para elegir una cadena de 10 caracteres al azar
		for (int i=0;i<tama�oPalabra();i++){
		   // A�adimos al buffer un caracter al azar del array
		   buffer.append(chars[random.nextInt(charsLength)]);
		}
		// Y solo nos queda hacer algo con la cadena
		System.out.println("Random String " + buffer.toString());
		return buffer.toString(); 
		}
	
	public static int generaSize() {

		Random r = new Random();
		return r.nextInt(5) + 5;
		
	}
	
	public static int tama�oPalabra() {

		Random r = new Random();
		return r.nextInt(8) + 4;

	}

	public static void main(String[] args) {
		

		ArrayList<String> lista = new ArrayList<String>();

		for (int i = 0; i < generaSize(); i++) {

			lista.add(generaPalabra());

		}

		System.out.println("Tama�o de la lista: " + lista.size());
		Collections.sort(lista);
		
		System.out.println("max:" + lista.get(lista.size()-1));
		System.out.println("min:" + lista.get(0));

	}

}