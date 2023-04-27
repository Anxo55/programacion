<<<<<<< HEAD
package capitulo5.ejemplo41;

public class CuentaAhorros extends Cuenta{

//atributo
private boolean Activa;

    public CuentaAhorros(float Saldo, float TasaAnual) {
        super(Saldo, TasaAnual);
        //criterio
        if(Saldo>10000)
            this.Activa=true;
        else
            this.Activa=false;
    }

    @Override
    public void consignar(float cantidad) {
        // TODO Auto-generated method stub
        //NO CAMBIAR A ACTIVA????
        if(estaActiva())
            super.consignar(cantidad);
        else
            System.out.println("La cuenta no esta activa");
    }
    
    @Override
    public void retirar(float cantidad) {
        // TODO Auto-generated method stub
        //NO DEJARA DE ESTAR ACTIVA
        if(estaActiva())
            super.retirar(cantidad);
        else
            System.out.println("La cuenta no esta activa");
=======
package Capitulo5.Ejemplo41;

import javax.swing.text.html.parser.Element;

public class CuentaAhorros extends Cuenta{

    private boolean Activa;

    public CuentaAhorros(float TasaAnual, float Saldo) {
        super(TasaAnual, Saldo);
        //TODO Auto-generated constructor stub

        if(this.Saldo>10000)
        this.Activa=true;
        else
        this.Activa=false;
    }
    

    @Override
    public void Consignar(float cantidad) {
        if(estaActiva())
        super.Consignar(cantidad);
        else
        System.out.println("la cuenta no está activa");
    }

    @Override
    public void Retirar(float cantidad) {
        if(estaActiva())
        super.Retirar(cantidad);
        else
        System.out.println("la cuenta no está activa");
>>>>>>> 5b2e850c66dac4f575797535a138bef3f19ddfdc
    }

    @Override
    public void extractoMensual() {
<<<<<<< HEAD
        
        if(estaActiva()){
        // TODO Auto-generated method stub
        if(NumeroRetiros>4){


            Comision+=1000*(NumeroRetiros-4);
            super.extractoMensual();
        
        }else 
            super.extractoMensual();
            }
        else
            System.out.println("La cuenta no esta activa");    
        }
    

    @Override
    public String toString() {
        return "CuentaAhorros [Activa=" + Activa + "]";
    }

   public boolean estaActiva() {
       
    return Activa;
   }

}
=======
        if(estaActiva()){
            if(NumeroRetiros>4){
                Comision+=1000*(NumeroRetiros-4);
                super.extractoMensual();
            }
            else{
                super.extractoMensual();
            }
        }
        else{
            System.out.println("la cuenta no está activa");
    
            }
       
    }


    @Override
    public String toString() {
        return "CuentaAhorros [Activa=" + Activa + "Saldo=" + Saldo + ", NumeroConsignaciones=" + NumeroConsignaciones + ", NumeroRetiros="
        + NumeroRetiros + ", TasaAnual=" + TasaAnual + ", Comision=" + Comision + "]";
    }

    
public boolean estaActiva(){
    return Activa;
}
}

>>>>>>> 5b2e850c66dac4f575797535a138bef3f19ddfdc
