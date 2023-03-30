package ejerciciosA;

import java.util.Arrays;

// Genera un array de 50 posiciones enteras que tomarán valores entre
// -100 y 100.
// Recorriendo dicho array separe en dos arrays distintos los valores
// positivos de los negativos.
// Ordene ambos arrays por el método de la Burbuja. Considere el cero
// positivo.
// Mostrar por teclado ambos arrays obtenidos y ordenados.

public class Ejercicio2A {

    public static void qSort(int items[]){
    qs(items, 0 ,items.length-1);
   } 

   //version recursiva del metodo


   public static void qsort(int item[]) {
    qs(item, 0 ,item.length-1);
}

private static void qs(int [] items, int left, int right) {
    int i, j;
    int x, y;
    
    i= left; j =right;
    x=items[(left+right)/2];
    do {
        while((items[i]<x)&& (i<right))i++;
        while((x<items[j])&& (j>left))j--;
        if(i<=j) {
            y=items[i];
            items[i]=items[j];
            items[j]=y;
            i++; j--;
        }
    }while(i<=j);
    if(left <j) qs(items, left, j);
    if(i<right) qs(items, i, right);
}

    public static int[] generaArray(){
        int[] arr= new int[50];
        for(int i=0;i<50;i++){
            int random = (int) (Math.random() * (200 + 1)) - 100;
            arr[i]=random;
        }
        return arr;
    }
    public static void main(String[] args) {
        int p=0;
        int n=0;
        int[]positivos= new int[50];
        int[]negativos= new int[50];
        int[] arr = generaArray();
        for(int i=0;i<50;i++){
            if(arr[i]>=0){
                positivos[p]=arr[i];
                p++;
            }
            else{
                negativos[n]=arr[i];
                n++;
            } 
        }
        System.out.println(Arrays.toString(positivos));
        System.out.println(Arrays.toString(negativos));
        qSort(positivos);
        System.out.println(Arrays.toString(positivos));
        qSort(negativos);
        System.out.println(Arrays.toString(negativos));

    }
}
