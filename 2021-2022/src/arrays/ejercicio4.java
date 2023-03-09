package arrays;

import java.util.Scanner;

//Lee un conjunto de datos sin saber cu�ntos son.
public class ejercicio4 {

	public static final int MAX_VALORES = 80;
	public static final int FIN = -1;

	public static void main(String[] args) {
		// No se sabe cu�ntos entrar�n. Hay que acotar un valor m�ximo. Ponemos 80.
		float nota=0;
		
		boolean semaforo =false;
		
		float[] notas = new float[MAX_VALORES];

		// Hay un contador de posiciones actuales en que hay valores.
		int elementos = 0;
		Scanner lector = new Scanner(System.in);
		System.out.print("Escribir hasta " + MAX_VALORES + " valores.");
		System.out.println("Puedes escribir varios en una sola l�nea, separados por espacios.");
		
		//Habr� alguna manera de saber que se ha terminado de escribir.
		System.out.println("(Para terminar, escribe un" + FIN + ")");
		
		//Ir leyendo hasta encontrar la marca de fin. Pero el m�ximo es el tama�o del array.
		//Si se introducen m�s valores, los ignoramos, ya que no queda lugar donde//a lmacenarlos.
		//Estructura de repetici�n con sem�foro.
		
		while (elementos < notas.length || (nota!=FIN)) {
			//Hay un real?
			if (lector.hasNextFloat()) {
				//Hay que ver si es un valor v�lido o final de secuencia.
				 nota = lector.nextFloat();
				if ((nota >= 0) && (nota <= 10)) {

					//Todo correcto. Ahora hay un elemento m�s en el array.
					notas[elementos] = nota;
					elementos++;
				} else if (nota == FIN) {
		
				}
				//Si no es ni lo uno ni lo   otro, la ignoramos.
			} else {
				//Si no era un real, el ignor  amos.
				lector.next();
			}
			
		}
		//Ignoramos los valores sobrantes de la �ltima l�nea.
		lector.nextLine();
		System.out.println("La secuencia le�da es: ");
		for (int i = 0; i < elementos; i++) {
			System.out.println(notas[i]);
		}
	}
}
