package poo23.ejemplo3;

public class Masajista extends SeleccionFutbol {

	private String titulacion;
	private int aniosExperiencia;

	public Masajista() {
		super();
	}

	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		super(id, nombre, apellidos, edad);
		this.titulacion = titulacion;
		this.aniosExperiencia = aniosExperiencia;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public void setTitulacion(String titulacion) {
		this.titulacion = titulacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

    @Override
    public void Viajar() {
        //TODO Auto-generathed method stub
        super.Viajar();
        System.out.println("El masajista va andando");
    }

	public void darMasaje() {
		System.out.println("Da un masaje");
	}

    @Override
    public String toString() {
        return "Masajista [titulacion=" + titulacion + ", aniosExperiencia=" + aniosExperiencia + "]";
    }

    

}
