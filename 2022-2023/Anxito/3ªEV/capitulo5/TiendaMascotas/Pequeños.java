package capitulo5.TiendaMascotas;

public class Pequeños extends Perros{

    enum razas
        {YORKSHIRE, CANICHE, CHIHUAHUA, SCHNAUZER}

 //ATRIBUTO
    private razas  raza;

    ////constructor

    @Override
    public String toString() {
        return super.toString() +  "Pequeños []";
    }    

    }
    

