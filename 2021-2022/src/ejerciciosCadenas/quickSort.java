package ejerciciosCadenas;


public class quickSort {
	
	private static int particion(int arra[], int izquierda, int derecha) {
        // Elegimos el pivote, es el primero
        int pivote = arra[izquierda];
        // Ciclo infinito
        while (true) {
            // Mientras cada elemento desde la izquierda est� en orden (sea menor que el
            // pivote) contin�a avanzando el �ndice
            while (arra[izquierda] < pivote) {
                izquierda++;
            }
            // Mientras cada elemento desde la derecha est� en orden (sea mayor que el
            // pivote) contin�a disminuyendo el �ndice
            while (arra[derecha] > pivote) {
                derecha--;
            }
    /*
    Si la izquierda es mayor o igual que la derecha significa que no
    necesitamos hacer ning�n intercambio
    de variables, pues los elementos ya est�n en orden (al menos en esta
    iteraci�n)
    */
            if (izquierda >= derecha) {
                // Indicar "en d�nde nos quedamos" para poder dividir el arreglo de nuevo
                // y ordenar los dem�s elementos
                return derecha;
            } else {//Nota: yo s� que el else no hace falta por el return de arriba, pero as� el algoritmo es m�s claro
      /*
      Si las variables quedaron "lejos" (es decir, la izquierda no super� ni
      alcanz� a la derecha)
      significa que se detuvieron porque encontraron un valor que no estaba
      en orden, as� que lo intercambiamos
      */
                int temporal = arra[izquierda];
                arra[izquierda] = arra[derecha];
                arra[derecha] = temporal;
      /*
      Ya intercambiamos, pero seguimos avanzando los �ndices una vez m�s
      */
                izquierda++;
                derecha--;
            }
            // El while se repite hasta que izquierda >= derecha
        }
    }
 
	
	// Divide y vencer�s
    private static void quicksort(int arra[], int izquierda, int derecha) {
           
        	if (izquierda < derecha) {
                
            	int pivote = particion(arra, izquierda, derecha);
                
            	quicksort(arra, izquierda, pivote);
                quicksort(arra, pivote + 1, derecha);
            }
        }


    public static void mostrar(int[] paso) {
		System.out.print("Mostrando el array: [");
		for (int i = 0; i < paso.length; i++) {
			System.out.print(paso[i] + " ");
		}
		System.out.print("]");
		System.out.println();
	}
    
   	public static void main(String[] args) {
		// TODO Auto-generated method stub

   		int[] notas =  {1, 9, 23, 4, 55, 100, 1, 1, 23};
   		System.out.println("array desordenado");
   		mostrar(notas);
   		
   		quicksort(notas,0,notas.length-1);
   		
   		System.out.println("array ordenado");
   		mostrar(notas);
   		
	}

}