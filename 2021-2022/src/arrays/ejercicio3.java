package arrays;

import java.util.Scanner;

//leer y guardar filtrando notas  entre 0 y 10
public class ejercicio3 {

	public static void main(String[] args) {

		Scanner lector = new Scanner(System.in);

		int tamano = 0;
		while (tamano <= 0) {
			System.out.print("�Cu�ntas notas quieres introducir?");
			if (lector.hasNextInt()) {
				tamano = lector.nextInt();
			} else {
				lector.next();
			}
		}
		lector.nextLine();
		System.out.println("Se leer�n " + tamano + " valores reales.");
		System.out.println("Puedes escribir varios valores en una sola l�nea, "
		+ "separados por espacios.");
		
		// Los guardaremos en un array. Ya conocemos el tama�o.
		float[] notas = new float[tamano];
	
		// Estructura de repetici�n con contador.
		int index = 0;
		while (index < notas.length) {
				
			if (lector.hasNextFloat()) {
				// Se ha le�do una nota, pero es v�lida (entre 0 y 10)?
				float nota = lector.nextFloat();
				if ((nota >= 0) && (nota <= 10)) {
					notas[index] = nota;
					index++;
				}
			} else {
				lector.next();
			}
		
		}
		// Ignoramos los valores sobrantes de la �ltima l�nea.
		lector.nextLine();
		
		System.out.println("La secuencia le�da es: ");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
	}

}