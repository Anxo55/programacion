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
    
    public void retirar(float cantidad) {
        if(Saldo>=cantidad){
            Saldo-=cantidad;
            NumeroConsignaciones++;
        }        
        else
            System.out.println("no puede retirar dicha cantidad");
    }

        /*Calcular el interes mensual de la cuenta */
    public void calcularInteres() {
        
    /*Convierte la tasa anual en mensual */
        float interesMensual =Saldo * (TasaAnual/12);
        Saldo += interesMensual;
        /*Actualiza el saldo aplicando el interes mensual */
    }

        /*Extracto mensual:  actualiza el saldo restándole la comision mensual
         * y calculando el interes mensual correspondiente (invoca el metodo
         * anterior)
         */
        public void extractoMensual() {
            Saldo-=Comision;
            calcularInteres();
        }
        /*toString (imprimir) */

        @Override
        public String toString() {
            return "Cuenta [Saldo=" + Saldo + ", NumeroConsignaciones=" + NumeroConsignaciones + ", NumeroRetiros="
                    + NumeroRetiros + ", TasaAnual=" + TasaAnual + ", Comision=" + Comision + "]";
        }

        public float getSaldo() {
            return Saldo;
        }

        public void setSaldo(float saldo) {
            Saldo = saldo;
        }

        public int getNumeroConsignaciones() {
            return NumeroConsignaciones;
        }

        public void setNumeroConsignaciones(int numeroConsignaciones) {
            NumeroConsignaciones = numeroConsignaciones;
        }

        public int getNumeroRetiros() {
            return NumeroRetiros;
        }

        public void setNumeroRetiros(int numeroRetiros) {
            NumeroRetiros = numeroRetiros;
        }

        public float getTasaAnual() {
            return TasaAnual;
        }

        public void setTasaAnual(float tasaAnual) {
            TasaAnual = tasaAnual;
        }

        public float getComision() {
            return Comision;
        }

        public void setComision(float comision) {
            Comision = comision;
        }

        

}
