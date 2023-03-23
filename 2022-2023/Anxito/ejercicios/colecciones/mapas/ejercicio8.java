package colecciones.mapas;
//este ejercicio es de arraylist
import java.util.ArrayList;
import java.util.Collections;

/*
 * al azar 10 cartas NO REPETIDAS de la baraja española, y ordenadas alfabeticamente
 * primero por palo luego por valor. 
 * 
 * Usar Arraylist de Cartas
 * 
 * 
 * */
public class ejercicio8 {
	static ArrayList<Carta> mano = new ArrayList();

	public static void main(String[] args) {
	
		//la primera carta se añade sin problemas.
		Carta c= new Carta();
		//System.out.println(c.toString());
		mano.add(c);
		
		//para las otras 9...
		do {
			Carta nueva= new Carta();
			//para hacer un contains que funcione necesitamos un equals en Carta que generaremos
			if (!mano.contains(nueva)) mano.add(nueva);
		}while(mano.size()<10);
		
		
		//MANO OBTENIDA SIN ORDENAR
		System.out.println("Generadas 10 cartas no repetidas:");
		for (Carta carta:mano) {
			System.out.println(carta.toString());
		}
		
		//MANO OBTENIDA ORDENADA
		Collections.sort(mano);
		System.out.println("Generadas 10 cartas no repetidas:");
		for (Carta carta:mano) {
			System.out.println(carta.toString());
		}
		
		
	}
}