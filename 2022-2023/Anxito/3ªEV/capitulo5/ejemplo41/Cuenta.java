package capitulo5.ejemplo41;

public class Cuenta {

    //atributos
    protected float Saldo;
    protected int NumeroConsignaciones=0;//ingresos
    protected int NumeroRetiros=0;//retiros
    protected float TasaAnual; //porcentaje
    protected float Comision=0;

    //constructores
    public Cuenta(float Saldo, float TasaAnual) {
        this.Saldo=Saldo;
        this.TasaAnual=TasaAnual;
    } 

    //metodos

    public void consignar(float cantidad) {
        Saldo+=cantidad;
        NumeroConsignaciones++;
    }
    
    public void retirar(int cantidad) {
        if(Saldo>=cantidad){
            Saldo-=cantidad;
            NumeroConsignaciones++;
        }        
        else
            System.out.println("no puede retirar dicha cantidad");
    }

    public calcularInteres() {
        float TasaMensual = TasaAnual/12;
    /*Convierte la tasa anual en mensual */
        float interesMensual;
        Saldo += interesMensual;
        /*Actualiza el saldo aplicando el interes mensual */
    }

}
