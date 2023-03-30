package poo23.ejemplo2;

public class Deportivo extends Vehiculo {

	private int cilindrada;

	public Deportivo(String matricula, String marca, String modelo, String color, double tarifa, double d) {
		super(matricula, marca, modelo, color, tarifa);
		this.cilindrada = (int) d;
	}

	// métodos ‘get’ de la subclase Deportivo
	public int getCilindrada() {
		return this.cilindrada;
	}

	@Override
	public String toString() {
		return super.toString() + "Deportivo [cilindrada=" + cilindrada + "]";
	}

	@Override
	public void arranca() {
		System.out.println("Que bien suena este motor");
	}

	

}
