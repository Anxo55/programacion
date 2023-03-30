package ejerciciosA;

import java.util.Arrays;
import java.util.Scanner;

// Programa que pida al usuario la introducción de dos cadenas de
// caracteres.
// A continuación construya una tercera cadena intercalando las
// palabras de las cadenas recibidas.
// Muestre dicha cadena por pantalla

public class Ejercicio3A {

    private static String[] lista;
    private static String[] lista2;
	final static int POS=4;

	public static void muestra() {
		for(int i=0; i<POS; i++) System.out.print(lista[i] + " ");
	}

    public static void muestra2() {
        for(int i=0; i<POS; i++)System.out.println(lista2[i]+ " ");
    }
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        //PRIMERA LISTA
		lista = new String[POS];
		
		for(int j=0; j<POS; j++) {
			System.out.println("Dame palabras: ");
			String ln =sc.nextLine();
			lista[j]=ln.toString();
		}
		System.out.println();
		

        //SEGUNDA LISTA
        lista2 = new String[POS];

        for(int j=0; j<POS; j++) {
            System.out.println("Dame palabras: ");
            String ln = sc.nextLine();
            lista2[j]=ln.toString();
        }
        System.out.println();
      
        muestra();
        System.out.println();
        muestra2();
	}

    
	
}
