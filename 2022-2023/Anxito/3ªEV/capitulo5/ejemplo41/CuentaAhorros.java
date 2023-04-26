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
    }

    @Override
    public void extractoMensual() {
        
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
