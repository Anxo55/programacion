package capitulo5.ejemplo42;

public class Apartamento extends Vivienda{
   // protected static double valorArea=2000000;

    
    public Apartamento(int idTipo, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idTipo, area, direccion, numHabitaciones, numBaños);
        setValorArea(2000);
    }


    @Override
    public String toString() {
        return super.toString()+ "Apartamento []";
    }

    

   
    

}
