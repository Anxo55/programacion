package capitulo5.ejemplo41;

public class CuentaCorriente extends Cuenta{

    public CuentaCorriente(float Saldo, float TasaAnual) {
        super(Saldo, TasaAnual);
    }

    float Sobregiro=0;

    @Override
    public void retirar(float cantidad) {
        // TODO Auto-generated method stub
        if(Saldo >= cantidad){
        Saldo -= cantidad;
        NumeroRetiros++;
    }
    else{
        Sobregiro=cantidad-Saldo;
        Saldo=0;
        NumeroRetiros++;
        }
    }

    @Override
    public void consignar(float cantidad) {
        // TODO Auto-generated method stub
        if(Sobregiro>0){
            if(cantidad-Sobregiro>=0){
            super.consignar(cantidad-Sobregiro);
            Sobregiro=0;
            NumeroConsignaciones++;
            }
            else{
                Sobregiro-=cantidad;
            }
        }else
            super.consignar(cantidad);
    }

    @Override
    public String toString() {
        return "Cuenta [Saldo=" + Saldo + ", NumeroConsignaciones=" + NumeroConsignaciones + ", NumeroRetiros="
        + NumeroRetiros + ", TasaAnual=" + TasaAnual + ", Comision=" + Comision + "]";
}

    
    
}
