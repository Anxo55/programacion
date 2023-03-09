package copias;

import java.util.Scanner;

public class changeSize {

	public static final int INICIAL = 5;
	public static final int INCREMENTO = 10;

	public static void main(String[] args) {

		float[] notas = new float[INICIAL];
		// Hay un contador de posiciones en las que hay valores v�lidos.
		int elementos = 0;
		Scanner lector = new Scanner(System.in);
		
		System.out.print("Ir escribiendo notas (valores reales entre 0 y 10).");
		System.out.println("Puedes escribir varios en una sola l�nea, separados por espacios.");
		System.out.println("(Para terminar, escribe un -1)");
		
		/*
		 * Si escribimos m�s valroes, cambiamos el tama�o del array
		 * y continuamos leyendo
		 */
		
		boolean fin = false;
		while (!fin) {
			// Hay un real?
			if (lector.hasNextFloat()) {
				// Hay que ver si es un valor v�lido o final de secuencia.
				float nota = lector.nextFloat();
				if ((nota >= 0) && (nota <= 10)) {
					// Todo correcto. Pero hay lugar en el array?
					if (elementos == notas.length) {
						// Hay que cambiar el  tama�o del array. Se hace 5 posiciones m�s largo.
						// Para ver cuando sucede, avisamos por pantalla.
						System.out.println("Capacidad superada. A�adimos " + INCREMENTO+ " posiciones...");
						float[] arrayNuevo = new float[notas.length + INCREMENTO];
						for (int i = 0; i < notas.length; i++) {
							arrayNuevo[i] = notas[i];
						}
						notas = arrayNuevo;
					}
					// A�adimos el nuevo valor. Seguro que hay sitio.
					notas[elementos] = nota;
					elementos++;
				} else if (nota == -1) {
					// Marca de final, salimos del bucle.
					fin=true;
				}
				// Si no es ni lo uno ni lo otro, lo ignoramos.
			} else {

				// Si no era un real, el ignoramos.
				lector.next();
			}
		}
		// Ignoramos los valores sobrantes de la �ltima l�nea.
		lector.nextLine();
		System.out.println("En el array hay almacenados " + elementos + " elementos:");
		for (int i = 0; i < elementos; i++) {
			System.out.println(notas[i]);
		}
	}
}