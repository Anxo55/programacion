package ejerciciosCadenas;

import java.util.Scanner;

/*
 * Rutina que indica si todos los caracteres contenidos
 * en un String dado como par�metro
corresponden a d�gitos decimales o no.
 */
public class ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String cad;
		boolean noEsDigito = false;

		System.out.println("Introduce una cadena");
		cad = sc.nextLine();

		int fran = 0;

		do {

			// if (cad.charAt(fran) == buscar)
			if (!Character.isDigit(cad.charAt(fran)))
				noEsDigito = true;
			fran++;
		} while (fran < cad.length() && !noEsDigito);

		if(noEsDigito)
			System.out.println("Hay alg�n NO digito");
		else
			System.out.println("Todos son digitos");
	}

}
