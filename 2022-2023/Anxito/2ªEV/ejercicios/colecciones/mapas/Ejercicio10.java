package colecciones.mapas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/*
 * ejercicio 10 y 11
 * mini-diccionario español inglés
 * usar HashMap
 * generar 5 palabras de este y pedir al usuario su traduccion, checkear si las tradujo bien
 * 
 * */
public class Ejercicio10 {

	static HashMap<String, String> dic = new HashMap();

	static void ponPalabras() {
		dic.put("ordenador", "computer");
		dic.put("gato", "cat");
		dic.put("rojo", "red");
		dic.put("árbol", "tree");
		dic.put("pingüino", "penguin");
		dic.put("sol", "sun");
		dic.put("agua", "water");
		dic.put("viento", "wind");
		dic.put("siesta", "siesta");
		dic.put("arriba", "up");
		dic.put("ratón", "mouse");
		dic.put("estadio", "arena");
		dic.put("calumnia", "aspersion");
		dic.put("aguacate", "avocado");
		dic.put("cuerpo", "body");
		dic.put("concurso", "contest");
		dic.put("cena", "dinner");
		dic.put("salida", "exit");
		dic.put("lenteja", "lentil");
		dic.put("cacerola", "pan");
		dic.put("pastel", "pie");
		dic.put("membrillo", "quince");
	}

	
	//como para generar palabras aleatorias de un conjunto de palabras usamos un random y necesitamos las posiciones, es mejor 
	//trabajar para esto con un array (ya que el hash map no permite acceder por numero de posicion)
	static String[] spanish={"ordenador","gato","rojo","árbol",
			"pingüino","agua","viento","siesta","arriba","ratón",
			"estadio","calumnia","aguacate","cuerpo","concurso","cena","salida","lenteja","cacerola","pastel","membrillo", "quince"};
			
		
	
	public static void main(String[] args) {
		ponPalabras();
		
		Scanner sc= new Scanner (System.in);
		String pal="";
		String entr="";
		int bien=0;
		for (int i=0;i<5;i++) {
			//generamos la palabra de la que pedirá traducción
			entr=spanish[(int)(Math.random()*20)];
			System.out.println("Palabra en español: "+entr );
			pal=sc.nextLine();
			if (pal.equals(dic.get(entr))) {
				bien++;
			}
		}
		
		System.out.println("Acertaste: "+bien);
			
		

	}

}
