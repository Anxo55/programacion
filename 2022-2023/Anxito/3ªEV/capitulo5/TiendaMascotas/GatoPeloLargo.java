package capitulo5.TiendaMascotas;

public class GatoPeloLargo extends Gatos{

enum razas 
{ANGORA, MALAYO, BALINES,SOMALI}    

//atributo
private razas  raza;

@Override
public String toString() {
    return super.toString() + "GatoPeloLargo [raza=" + raza + "]";
}


    
}
