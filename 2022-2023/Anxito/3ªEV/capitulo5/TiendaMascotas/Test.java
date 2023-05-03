package capitulo5.TiendaMascotas;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        
      ArrayList<Mascota> animales = new ArrayList<Mascota>();

      Angora angora = new Angora(null, 0, null, null, null, 0, 0);
      AzulRuso Ruso = new AzulRuso(null, 0, null, null, null, 0, 0);
      Balines balines = new Balines(null, 0, null, null, null, 0, 0);
      Britanico britanico = new Britanico(null, 0, null, null, null, 0, 0);
      Bulldog bulldog = new Bulldog(null, 0, null, null, null, 0, false);
      Caniche caniche = new Caniche(null, 0, null, 0, false);
      Chihuahua chihuahua = new Chihuahua(null, 0, null, 0, false);
      Collie collie = new Collie(null, 0, null, null, null, 0, false);
      Dalmata dalmata = new Dalmata(null, 0, null, null, null, 0, false);
      DevonRex devonRex = new DevonRex(null, 0, null, null, null, 0, 0);
      Doberman doberman = new Doberman(null, 0, null, null, null, 0, false);
      Donskoy donskoy = new Donskoy(null, 0, null, null, null, 0, 0);
      Elfo elfo = new Elfo(null, 0, null, null, null, 0, 0);
      Esfinge esfinge = new Esfinge(null, 0, null, null, null, 0, 0);
      Galgo galgo = new Galgo(null, 0, null, null, null, 0, false);
      Himalayo himalayo = new Himalayo(null, 0, null, null, null, 0, 0);
      Manx manx = new Manx(null, 0, null, null, null, 0, 0);
      PastorAleman pastorAleman = new PastorAleman(null, 0, null, null, null, 0, false);
      Rotweiler rotweiler = new Rotweiler(null, 0, null, null, null, 0, false);
      Sabueso sabueso = new Sabueso(null, 0, null, null, null, 0, false);
      Schnauzer schnauzer = new Schnauzer(null, 0, null, 0, false);
      Somali somali = new Somali(null, 0, null, null, null, 0, 0);
      YorkshireTerrier yorkshireTerrier = new YorkshireTerrier(null, 0, null, 0, false);

      animales.add(angora);
      animales.add(Ruso);
      animales.add(balines);
      animales.add(britanico);
      animales.add(bulldog);
      animales.add(caniche);
      animales.add(chihuahua);
      animales.add(collie);
      animales.add(dalmata);
      animales.add(devonRex);
      animales.add(doberman);
      animales.add(donskoy);
      animales.add(elfo);
      animales.add(esfinge);
      animales.add(galgo);
      animales.add(himalayo);
      animales.add(manx);
      animales.add(pastorAleman);
      animales.add(rotweiler);
      animales.add(sabueso);
      animales.add(schnauzer);
      animales.add(somali);
      animales.add(yorkshireTerrier);

      for(Mascota m : animales) {

        System.out.println(m.toString());

      }

    }

      
}
