package ejerciciosCadenas;

import java.util.Scanner;

public class BuscaCaracter {

	public static void main(String[] args) {

		String[] semana = {"lunes","martes","mi�rcoles","jueves","viernes", "s�bado","domingo"};
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce un caracter a buscar");
		String cad = sc.nextLine();
		
		for (String dia : semana) {
			System.out.println(dia);
			System.out.println("Posici�n " + dia.indexOf(cad.charAt(0)));
			
		}
		
		sc.close();
		
	}
	
}