package capitulo5.TiendaMascotas;

public class GatoPeloLargo extends Gatos{

public GatoPeloLargo(String nombre, int edad, String color, float altura, float longitudSalto) {
        super(nombre, edad, color, altura, longitudSalto);
        /this.raza=raza;
    }



enum razas 
{ANGORA, MALAYO, BALINES,SOMALI}    

//atributo
private razas  raza;



@Override
public String toString() {
    return super.toString() + "GatoPeloLargo [raza=" + raza + "]";
}


    
}
