package capitulo5.ejemplo1;

public class test {

    public static void main(String[] args) {

         Libro MiLibro = new Libro(575,15.2f,"El manifiesto negro","Dura","","Frederick Forsyth","Circulo de lectores");

         System.out.println(MiLibro.toString());

         Periodico TuPeriodico = new Periodico(64, 1.5f, "Fora de Bigo", "14 de abril de 2023");

         System.out.println(TuPeriodico.toString());
         }
    
}
