import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ejercicio6B {

    static HashMap<String,Integer> parejas = new HashMap<String,Integer>();
    
    static void ponPuntosAlMap() {
		parejas.put("as", 20);
		parejas.put("K", 15);
		parejas.put("Q", 15);
		parejas.put("J", 15);
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


