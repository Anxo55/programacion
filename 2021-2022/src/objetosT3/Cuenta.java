package objetosT3;
/*
 * 1) Crea una clase llamada Cuenta que tendr� los siguientes atributos: titular y
cantidad (puede tener decimales).
El titular ser� obligatorio y la cantidad es opcional. Crea dos constructores que
cumpla lo anterior.
Crea sus m�todos get, set y toString.
Tendr� dos m�todos especiales:
 ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la
cantidad introducida es negativa, no se hara nada.
 retirar(double cantidad): se retira una cantidad a la cuenta, si restando la
cantidad actual a la que nos pasan es negativa, NO SE PEUDE RETIRAR
 */

public class Cuenta {
	String titular;
	double cantidad;
	
	Cuenta(String t){
		this.titular=t;
	}
	
	Cuenta(String t,double c){
		this.titular=t;
		this.cantidad=c;
		
	}

	@Override
	public String toString() {
		return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
	}
	
	public void ingresar (double c) {
		if (c>=0)
			cantidad+=c;
	}
	
	public void retirar (double c) {

		if(cantidad-c>=0 && c>=0)
				cantidad-=c;
	}
}
