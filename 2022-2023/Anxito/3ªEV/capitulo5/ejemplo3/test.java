package capitulo5.ejemplo3;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class test {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo(Color.yellow, (byte) 4, (short) 2500, (byte) 300);

        Motocicleta MotoBarata = new Motocicleta(Color.red, (short) 125, (short) 25);
        Motocicleta MotoBarata2 = new Motocicleta(Color.red, (short) 125, (short) 25);
        Motocicleta MotoCara = new Motocicleta(Color.yellow, (short) 1000, (short) 90);

        Camion CamionNormal = new Camion(Color.red, (byte) 4,
                (byte) 2, (short) 4000, (short) 300);
        Camion CamionEnorme = new Camion(Color.red, (byte) 24,
                (byte) 6, (short) 15000, (short) 800);
        Coche Zito = new Coche(Color.cyan, (byte) 4, (short) 12, (short) 104, 5);
        ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
        lista.add(vehiculo);
        lista.add(MotoBarata);
        lista.add(MotoBarata2);
        lista.add(MotoCara);
        lista.add(CamionNormal);
        lista.add(CamionEnorme);
        lista.add(Zito);
        for (Vehiculo v : lista) {
            System.out.println(v);
            System.out.println("a pagar: " + v.pagarRodaje());
        }
        Collections.sort(lista);
        for (Vehiculo v : lista) {
            System.out.println(v);
            System.out.println("a pagar: " + v.pagarRodaje());
        }
        for (Vehiculo v : lista) {
            System.out.println(v);
            System.out.println("a pagar: " + v.pagarCarburante());
        }
        MotoBarata.setNumeroDePlazas((byte) 1);
        System.out.println(MotoBarata.getNumeroDePlazas());
        System.out.println(MotoBarata2.getCilindrada());
        System.out.println(CamionEnorme.DimeNumeroDeEjes());

    }
}
