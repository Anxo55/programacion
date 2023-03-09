package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
 * ***Ejercicio 6
Implementa el control de acceso al �rea restringida de un programa. 
Se debe pedir un nombre de usuario y una contrase�a. 
Si el usuario introduce los datos correctamente, el programa dir� �Ha accedido al �rea restringida�. 
El usuario tendr� un m�ximo de 3 oportunidades. 
Si se agotan las oportunidades el programa dir� �Lo siento, no tiene acceso al �rea restringida�. 
Los nombres de usuario con sus correspondientes contrase�as deben estar almacenados en una estructura de la clase HashMap.

 */

public class ejercicio6 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Map<String, String> mapa = new HashMap<>();
		boolean acertar = false;
		int opc = 0;
		String user = "";
		String pass = "";

		mapa.put("yanki", "1312");
		mapa.put("melon", "sandia");
		mapa.put("jak", "2w3r4");

		System.out.println("introduce usuario: ");
		user = sc.nextLine();

		if (mapa.containsKey(user)) {
			System.out.println("al menos sabes el usuario");
			// pedir la contrase�a
			do {
				System.out.println("contrase�a");
				pass = sc.nextLine();
				if (mapa.get(user).equals(pass)) {
					System.out.println("ACCESO PERMITIDO");
					acertar=true;
				} else {
					System.out.println("ERROR DE CONTRASE�A");
					opc++;
				}
			} while (opc<3 && !acertar);
			if(!acertar);
			System.out.println("te has quedado sin opciones");
		} else {
			System.out.println("que usas???");
			// volver a pedir usuario

		}
	}

}
