package ejerciciosCadenas;

import java.util.Scanner;

public class buscarCaracter {
	public static void main(String[] args) {
		String [] semana = {"lunes","martes","miercoles","jueves","viernes","s�bado","domingo"};
		
		Scanner sc= new Scanner (System.in);
		System.out.println("introduce un caracter a buscar");
		String cad = sc.nextLine();
		
		for( String usame : semana ) {
			System.out.println(usame+ " posicion: "+usame.indexOf(cad.charAt(0)));
		}
		
	}
}
