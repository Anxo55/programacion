package Cadenas;

public class InvertirOrden {
    public static void main(String[] args) {
        float numero = 3.1415926535f;
        String rev = "";

        String numeroTexto = String.valueOf(numero);
        for (int i = numeroTexto.length() - 1; i >= 0; i--) {
            rev = rev + numeroTexto.charAt(i);
            System.out.print(numeroTexto.charAt(i));
        }
        System.out.println();
        System.out.println(rev);

        double numerito = Double.parseDouble(rev);
        System.out.println("otra vez es numero: " + numerito);
    }

}
