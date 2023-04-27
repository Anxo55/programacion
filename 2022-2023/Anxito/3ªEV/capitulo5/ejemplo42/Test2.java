package capitulo5.ejemplo42;

import java.util.ArrayList;

public class Test2 {

    public static void main(String[] args) {
        ArrayList<Inmueble> terrenos = new ArrayList<Inmueble>();
        Inmueble inmueble = new Inmueble(2, 200, "Avenida ramo nieto");
        Vivienda vivienda = new Vivienda(4, 220, "Pizarro vigo", 8, 2);
        Casa CasaConchi = new Casa(4, 300, "avenida castelao nº7", 9, 2, 2);
        ConjuntoCerrado CC = new ConjuntoCerrado(7, 200, "avenida de las traviesas", 5, 6, 4, 1000000, 500000, 1, true);
        Estudio estudio = new Estudio(4, 200, "Mercantil", 4, 2, 100000);
        Familiar familiar= new Familiar(0, 0, null, 0, 0, 0, 0);
        Independiente independiente = new Independiente(2, 200, "Calle santiago", 5, 2, 3, 200000);


        terrenos.add(inmueble);
        terrenos.add(vivienda);
        terrenos.add(CasaConchi);
        terrenos.add(CC);
        terrenos.add(estudio);
        terrenos.add(familiar);
        terrenos.add(independiente);

        //no todos tienen valorArea

        for(Inmueble i : terrenos) {
            System.out.println(i.toString());
            System.out.println(i.calculaPrecioVenta(0));
        }

    }
    
}
