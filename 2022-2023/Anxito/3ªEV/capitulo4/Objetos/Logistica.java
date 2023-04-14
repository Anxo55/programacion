public class Logistica {
    
    private String Nombre;
    private byte Capacidad;
    private byte NumeroDeHuecos;
    
     Logistica(byte Capacidad, String n) {
        
     this.Capacidad = Capacidad;
     NumeroDeHuecos = Capacidad;
     this.Nombre=n;
     }
    
     public byte DimeNumeroDeHuecos() {
     return (NumeroDeHuecos);
     }
    
     public byte DimeCapacidad() {
     return (Capacidad);
     }
    
     public boolean HayHueco() {
     return (NumeroDeHuecos != 0);
     }
    
     public boolean HayContenedor() {
     return (NumeroDeHuecos != Capacidad);
     }
    
     public void MeteContenedor() {
        System.out.println(this.toString());
     NumeroDeHuecos--;
     }
    
     public void SacaContenedor() {
     NumeroDeHuecos++;
     }

    @Override
    public String toString() {
        return "Logistica [Capacidad=" + Capacidad + ", NumeroDeHuecos=" + NumeroDeHuecos + "]";
    }

     
    
     } // LogisticaAlmacen
