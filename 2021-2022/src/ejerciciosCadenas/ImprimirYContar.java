package ejerciciosCadenas;

public class ImprimirYContar {
	
	public static void main(String[] args) {
		String [] semana = {"lunes","martes","miercoles","jueves","viernes","s�bado","domingo"};
		
		for( String usame : semana ) {
			System.out.println(usame+ " Longitud: "+usame.length());
		}
		
	}

}
