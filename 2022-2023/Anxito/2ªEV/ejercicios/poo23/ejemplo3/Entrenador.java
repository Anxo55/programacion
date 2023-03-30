package poo23.ejemplo3;

public class Entrenador extends SeleccionFutbol {

	private String idFederacion;

	public Entrenador() {
		super();
	}

	public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
    
    @Override
    public void Concentrarse() {
        //TODO Auto-generathed method stub
        super.Concentrarse();
        System.out.println("El entrenador tiene una habitacion doble");
    }

    @Override
    public void Viajar() {
        //TODO Auto-generathed method stub
        super.Viajar();
        System.out.println("Viaja en avion en primera clase");
    }

	public void dirigirPartido() {
		System.out.println("Dirige un partido");
	}

	public void dirigirEntrenamiento() {
		System.out.println("Dirige un entrenamiento");
	}

    @Override
    public String toString() {
        return "Entrenador [idFederacion=" + idFederacion + "]";
    }

    


}
