<<<<<<< HEAD
package Boletin;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
<<<<<<< HEAD
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[12];
        int[] arr2 = new int[12];
        int[] arr3 = new int[24];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce un numero para cadena 1: ");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Introduce un numero para cadena 2: ");
            arr2[i] = sc.nextInt();

        }

        for (int i = 0; i < 24; i++) {
            while (j < 3) {
                arr3[i] = arr[i];
                j++;
            }

            while (j > 3 && j < 6) {
                arr3[i] = arr2[i];
                j++;
            }
            j = 0;

        }
        System.out.println(Arrays.toString(arr3));
    }
=======
        Scanner sc= new Scanner(System.in);
            int[] arr=new int[12];
            int[] arr2=new int[12];
            int[] arr3=new int[8];
        int j=0;
            for(int i=0;i<arr.length;i++){
                System.out.println("Introduce un numero para cadena 1: ");
                arr[i]=sc.nextInt();
    
            }
            for(int i=0;i<arr2.length;i++){
                System.out.println("Introduce un numero para cadena 2: ");
                arr2[i]=sc.nextInt();
                
            }
            
            for(int i=0;i<10;i++){
    
                arr3[j]=arr[i];
                j++;
                arr3[j]=arr2[i];
                j++;
                
    
            }
            System.out.println(Arrays.toString(arr3));
    }    
>>>>>>> 02d14455e15fef57119e0a6f27e386c0d92806b4
}
=======
package Boletin;

import java.util.Arrays;
import java.util.Scanner;
// Leer los datos correspondientes a dos tablas de 12
// elementos numéricos, y mezclarlos en una tercera de la
// forma: 3 de la tabla A, 3 de la B, otros 3 de A, otros 3 de
// la B, etc
public class ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[12];
        int[] arr2 = new int[12];
        int[] arr3 = new int[24];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Introduce un numero para cadena 1: ");
            arr[i] = sc.nextInt();

        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("Introduce un numero para cadena 2: ");
            arr2[i] = sc.nextInt();

        }

        for (int i = 0; i < 24; i++) {
            while (j < 3) {
                arr3[i] = arr[i];
                j++;
            }

            while (j > 3 && j < 6) {
                arr3[i] = arr2[i];
                j++;
            }
            j = 0;

        }
        System.out.println(Arrays.toString(arr3));
    }
}
>>>>>>> 3719236a9f18b0d230e7b9995bd68cbd837bf087
