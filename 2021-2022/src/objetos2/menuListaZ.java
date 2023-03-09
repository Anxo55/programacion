package objetos2;

import java.util.ArrayList;

import java.util.Scanner;

public class menuListaZ {
	
	public static void mostrarMenu() {
		System.out.println("\n\nCOLECCI�N DE DISCOS");
		System.out.println("===================");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo disco");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
		System.out.print("Introduzca una opci�n: ");
	}
	
	public static void listarDiscos(ArrayList<Disco> album) {
		for (Disco d: album) {
			System.out.println(d);
		}
	}
	
	public static void anadirDisco(ArrayList<Disco> album) {
		Scanner mal = new Scanner(System.in);
		Disco dis = new Disco();
		// Busca la primera posici�n libre del array
		int primeraLibre = -1;
		String codigoIntroducido;
		boolean busca = true;



			System.out.print("C�digo: ");
			codigoIntroducido = mal.nextLine();
			dis.setCodigo(codigoIntroducido);
			System.out.println("codigo ya existente");


			System.out.print("Autor: ");
			String autorIntroducido = mal.nextLine();
			dis.setAutor(autorIntroducido);

			System.out.print("T�tulo: ");
			String tituloIntroducido = mal.nextLine();
			dis.setTitulo(tituloIntroducido);

			System.out.print("G�nero: ");
			String generoIntroducido = mal.nextLine();
			dis.setGenero(generoIntroducido);

			System.out.print("Duraci�n: ");
			int duracionIntroducida = Integer.parseInt(mal.nextLine());
			dis.setDuracion(duracionIntroducida);
		

	}
	
	public static void modificarDisco(ArrayList<Disco> album, String cod) {
		Scanner mal = new Scanner(System.in);

		int i = -1;

			System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");
			boolean busca = true;
			System.out.println("C�digo: " + album.getCodigo());
			System.out.print("Nuevo c�digo: ");
			String codigoIntroducido = mal.nextLine();

			col[i].setCodigo(codigoIntroducido);



			System.out.println("Autor: " + col[i].getAutor());
			System.out.print("Nuevo autor: ");
			String autorIntroducido = mal.nextLine();
			if (!autorIntroducido.equals("")) {
				col[i].setAutor(autorIntroducido);
			}

			System.out.println("T�tulo: " + col[i].getTitulo());
			System.out.print("Nuevo t�tulo: ");
			String tituloIntroducido = mal.nextLine();
			if (!tituloIntroducido.equals("")) {
				col[i].setTitulo(tituloIntroducido);
			}

			System.out.println("G�nero: " + col[i].getGenero());
			System.out.print("Nuevo g�nero: ");
			String generoIntroducido = mal.nextLine();
			if (!generoIntroducido.equals("")) {
				col[i].setGenero(generoIntroducido);
			}

			System.out.println("Duraci�n: " + col[i].getDuracion());
			System.out.print("Duraci�n: ");
			String duracionIntroducidaString = mal.nextLine();
			if (!duracionIntroducidaString.equals("")) {
				col[i].setDuracion(Integer.parseInt(duracionIntroducidaString));
			}

	}

	public static void menu(ArrayList<Disco> album) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		String codigoIntroducido;
		/* EMPIEZA MENU */
		do {
			mostrarMenu();
			opcion = Integer.parseInt(sc.nextLine());

			switch (opcion) {
			case 1: // LISTADO
				System.out.println("\nLISTADO");
				System.out.println("=======");
				//listarDiscos(album);
				break;
			case 2: // A�ADIR *ojo codigo
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");
				//anadirDisco(album);
				break;
			case 3: // MODIFICAR *ojo codigo
				System.out.println("\nMODIFICAR");
				System.out.println("===========");
				System.out.print("Por favor, introduzca el c�digo del disco cuyos datos desea cambiar: ");
				codigoIntroducido = sc.nextLine();
				//modificarDisco(album, codigoIntroducido);
				break;
			case 4: // BORRAR
				System.out.println("\nBORRAR");
				System.out.println("======");
				System.out.print("Por favor, introduzca el c�digo del disco que desea borrar: ");
				codigoIntroducido = sc.nextLine();
				//borrarDisco(album, codigoIntroducido);
				break;
			case 5:
				System.out.println("ABANDONANDO PROGRAMA...");
				break;
			default:
				System.out.println("opcion no valida");
			} // switch
		} while (opcion != 5);
		/* FIN DE MENU */

	}
	
	public static ArrayList<Disco> modeloDatos() {
		ArrayList<Disco> album = new ArrayList<Disco>();
		return album;
	}

	public static void main(String[] args) {
		menu(modeloDatos());
	}
	
}

