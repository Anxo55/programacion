package examenA;

import java.util.Scanner;

public class ejercicio1 {
	
	public static void main(String[] args) {
		int a�o=0;
		boolean bis=false;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Escriba un a�o para saber si es bisiesto");
		a�o=sc.nextInt();
		
		if(a�o%4==0) {
			if(a�o%100==0 && a�o%400==0) {
				bis=true;
				System.out.println(bis);
			}else {
				System.out.println(bis);
			}
		}else {
			System.out.println(bis);
		}
		sc.close();
	}

}
