package ejerciciosA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

// Escribe un programa que genere una secuencia de 7 cartas de la
// baraja francesa de palos (corazones, diamantes, picas y tréboles) y
// números (A,K,Q,J,10,9,8,7,6,5,4,3,2) sin que se repita ninguna.
// El valor de las cartas se debe guardar en una estructura HashMap que
// debe contener parejas (número, valor).
// El valor de las cartas es el siguiente: as → 11, K,Q,J → 10, el
// resto de cartas su número.

// La secuencia de cartas debe ser una estructura de la clase ArrayList
// que contiene objetos de la clase Carta.
// Se deberá listar la mano de siete cartas ordenadas por PALO y NÚMERO
// SEGÚN EL ENUNCIADO y a continuación el total de puntos de la mano
// Ejemplo: as de picas, cinco de corazones, reina de tréboles, jota de
// diamantes, seis de picas, dos de diamantes, 7 de corazones.
// Tienes 49 puntos

public class Ejercicio6A {

    static HashMap<String,Integer> parejas = new HashMap<String,Integer>();
	
	static void ponPuntosAlMap() {
		parejas.put("as", 11);
		parejas.put("K", 10);
		parejas.put("Q", 10);
		parejas.put("J", 10);
		parejas.put("nueve", 9);
		parejas.put("ocho", 8);
		parejas.put("siete", 7);
		parejas.put("seis", 6);
		parejas.put("cinco", 5);
        parejas.put("cuatro", 4);
        parejas.put("tres",3);
        parejas.put("dos", 2);
		
	}

    static ArrayList<Carta> mano = new ArrayList();
    
    public static void main(String[] args) {
		ponPuntosAlMap();
		Carta c= new Carta();
		mano.add(c);
		do {
			Carta nueva= new Carta();
			if (!mano.contains(nueva)) mano.add(nueva);
		}while(mano.size()<7);
		Collections.sort(mano);
		
		int total=0;
		System.out.println("Generadas 7 cartas no repetidas:");
		for (Carta carta:mano) {
			System.out.println(carta.toString());
			total+= parejas.get(carta.getValor());
		}
		System.out.println("PUNTAJE TOTAL: "+total+" PUNTOS");
		
	}	
}
