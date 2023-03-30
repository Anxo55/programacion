package colecciones.mapas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * al azar 10 cartas NO REPETIDAS de la baraja española, y ordenadas alfabeticamente
 * primero por palo luego por valor. 
 * Sacar luego los puntos según el juego de la brisca
 * (as=11 puntos, tres=10puntos, sota=2, caballo=3, rey=4, resto:0 puntos)
 * 
 * Usar Arraylist de Cartas; y HashMap para los puntos
 * 
 * 
 * */

public class Ejercicio12 {
	static HashMap<String,Integer> puntaje = new HashMap<String,Integer>();
	
	static void ponPuntosAlMap() {
		puntaje.put("as", 11);
		puntaje.put("tres", 10);
		puntaje.put("rey", 4);
		puntaje.put("caballo", 3);
		puntaje.put("sota", 2);
		puntaje.put("dos", 0);
		puntaje.put("cuatro", 0);
		puntaje.put("cinco", 0);
		puntaje.put("seis", 0);
		puntaje.put("siete", 0);
		
	}
	
	
	
	
	static ArrayList<Carta> mano = new ArrayList();
	
	public static void main(String[] args) {
		ponPuntosAlMap();
		Carta c= new Carta();
		mano.add(c);
		do {
			Carta nueva= new Carta();
			if (!mano.contains(nueva)) mano.add(nueva);
		}while(mano.size()<10);
		Collections.sort(mano);
		
		int total=0;
		System.out.println("Generadas 10 cartas no repetidas:");
		for (Carta carta:mano) {
			System.out.println(carta.toString());
			total+= puntaje.get(carta.getValor());
		}
		System.out.println("PUNTAJE TOTAL: "+total+" PUNTOS");
		
	}	

}
