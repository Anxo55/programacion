package cadenas;

import java.util.Scanner;

public class ContarCaracteres {
    
    public static void main (String [] args) {
		Scanner lector = new Scanner (System.in);
		
		System.out.println ("Escribe una línea de texto cualquiera y pulsa retorno: ");
		String texto = lector.nextLine();
		
		System.out.println ("¿Qué carácter quieres buscar?");
		String charText = lector.next();
		lector.nextLine();
		char charBusca = charText.charAt(0);

        int veces = 0;

        if(texto.indexOf(charBusca)==1) 
            System.out.println("no se ha encontrad el caracter "+charBusca);
        else{

            for(int i = 0; i<texto.length();i++) {
                if (texto.charAt(i)==charBusca); veces++;
            }

            System.out.println("Se ha encontrado en caracter "+charBusca+ " veces en la cadena "+ veces);

        }

    }       
}
