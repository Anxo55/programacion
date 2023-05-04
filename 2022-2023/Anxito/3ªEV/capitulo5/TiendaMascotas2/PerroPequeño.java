package capitulo5.TiendaMascotas2;

public class PerroPequeño extends Perros{
    
    enum razas{
        CANICHE, YORKSHIRE, CHIHUAHUA, SCHNAUZER
    }

        private razas raza;

        


    public PerroPequeño(String nombre, int edad, String color, int peso, boolean muerde, razas raza) {
            super(nombre, edad, color, peso, muerde);
            this.raza = raza;
        }

        


    @Override
    public String toString() {
        return super.toString()+"PerroPequeño [raza=" + raza + "]";
    }




    public razas getRaza() {
        return raza;
    }




    public void setRaza(razas raza) {
        this.raza = raza;
    }




    

    
}
