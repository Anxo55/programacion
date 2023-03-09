package objetosT3;

import java.util.Random;

public class Password {
	
	int longitud;
	String contrase�a;
	/*
	Password(){
		contrase�a= generaPassword(8);
	}
	
	Password(int l){
		longitud=l;
		contrase�a= generaPassword(l);
	}
	*/
	Password(){
		contrase�a= generaPass(8);
	}
	
	Password(int l){
		longitud=l;
		contrase�a= generaPass(l);
	}
	

/*
	private char[] mayusculas= { };
	private char[] minusculas= { };
	static char [] numeross = { };
	static char [] especiales
	*/
	private String generaPassword(int l) {
		String p="";
		for(int i=0;i<l;i++) {
			Random r = new Random();
			p+=(char)(r.nextInt(122-48+1)+48);
		}
		return p;
	}
	
	
	public String generaPass(int lon) {

		String aux = "";
		String may = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String min = "abcdefghijklmnopqrstuvwxyz";
		String num = "0123456789";
		String esp = "!�?�&-_@#*";

		//hace aleatoria la longitud
		// int longitud= (int) (6+8*Math.random());

		for (int i = 0; i < lon; i++) {
			
			//hay 25 mayusuclas
			//hay 25 minisculas
			//hay 100 digitos
			// hayd 10 especiales
			//obtiene uno de cada
			int ale1 = (int) (25 * Math.random());
			int ale2 = (int) (25 * Math.random());
			int ale3 = (int) (10 * Math.random());
			int ale4 = (int) (10 * Math.random());
			
			//gernera un numero entre 0 y 9
			int ran = (int) (10 * Math.random());
			// para ver cual  le a�ado a la cadena en cada pasada
			if (ran < 3) {
				aux += may.charAt(ale1);
			} else if (ran < 6) {
				aux += min.charAt(ale2);
			} else if (ran < 8) {
				aux += num.charAt(ale3);
			} else if (ran < 10) {
				aux += esp.charAt(ale4);
			}
		}
		return aux;
	}
	
	
	/*esFuerte(): devuelve un booleano si es fuerte o no, para que sea
	fuerte debe tener mas de 2 may�sculas, mas de 1 min�scula y mas de
	5 n�meros.
	*/
	
	public boolean esFuerte() {
		int may=0;
		int min=0;
		int dig=0;
		boolean esFuerte=false;
		
		for (int i=0;i<contrase�a.length();i++) {
			if(Character.isLowerCase(contrase�a.charAt(i) ) )
					min++;
			if(Character.isUpperCase(contrase�a.charAt(i) )  )
					may++;
			if(Character.isDigit(contrase�a.charAt(i) )  )
					dig++;
		}
		
		int esp =contrase�a.length()-(may+min+dig);
		if ( min>2 && min>2 && (dig+esp)>=4)
			esFuerte = true;
		
		return esFuerte;
	}
	
	@Override
	public String toString() {
		return "Password [contrase�a=" + contrase�a + "]";
	}

}
