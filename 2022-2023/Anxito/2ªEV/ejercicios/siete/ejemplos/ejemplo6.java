package ejemplos;

public class ejemplo6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String cad1 = "EMMA";
		String cad2 = "MARIA";
		
		System.out.println(cad1.compareTo(cad2));
		
		System.out.println(cad2.compareTo(cad1));
		
		System.out.println(cad2.compareTo(cad2));
		
		System.out.println(cad1.compareTo("emma"));
		System.out.println(cad1.compareTo("EMMA"));
		System.out.println(cad1.compareTo("EMMAMORENO"));
		
		System.out.println(cad2.compareTo("MARIA AMPARO"));
		System.out.println(cad2.compareTo("MORIA"));
		
		System.out.println(cad1.compareToIgnoreCase("emma"));
		
		
		
	}

}
