package capitulo5.ejemplo41;

import java.util.Scanner;

public class test {
    
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Cuenta de ahorros");
    System.out.println("Ingrese sakdo inicial =$");

    float saldoInicialAhorros = sc.nextFloat();
    System.out.println("Ingrese tasa de interés");
    float tasaAhorros = sc.nextFloat();

    CuentaAhorros cuenta1 = new CuentaAhorros(saldoInicialAhorros, tasaAhorros);
    System.out.println("Ingresar cantidad a consignar: $");
    float cantidadDepositar
}

}
