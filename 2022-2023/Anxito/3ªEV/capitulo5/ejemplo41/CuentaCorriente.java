<<<<<<< HEAD
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

    
=======
package Capitulo5.Ejemplo41;

public class CuentaCorriente extends Cuenta{

   public CuentaCorriente(float TasaAnual, float Saldo) {
        super(TasaAnual, Saldo);
        //TODO Auto-generated constructor stub
    }

float Sobregiro=0;

   @Override
   public void Retirar(float cantidad) {
       if(Saldo>=cantidad){
        Saldo-=cantidad;
        NumeroRetiros++;
       }
       else{
        Sobregiro=cantidad-Saldo;
        Saldo=0;
        NumeroRetiros++;
       }

   }

   @Override
   public void Consignar(float cantidad) {
      if(Sobregiro>0){
        if(cantidad-Sobregiro>=0){
            super.Consignar(cantidad-Sobregiro);
        Sobregiro=0;
        }
        else{
            Sobregiro-=cantidad;
        }
        
      }
      else{
        super.Consignar(cantidad);
      }

   }

@Override
public String toString() {
    return "CuentaCorriente [Sobregiro=" + Sobregiro + "Saldo=" + Saldo + ", NumeroConsignaciones=" + NumeroConsignaciones + ", NumeroRetiros="
    + NumeroRetiros + ", TasaAnual=" + TasaAnual + ", Comision=" + Comision + "]";
}

   

>>>>>>> 5b2e850c66dac4f575797535a138bef3f19ddfdc
    
}
