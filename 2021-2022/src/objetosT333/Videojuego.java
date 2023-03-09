package objetosT333;
/*
 * Sus atributos son titulo, horas estimadas, entregado, genero y
compa�ia.
 Por defecto, las horas estimadas ser�n de 10 horas y entregado false. El
resto de atributos ser�n valores por defecto seg�n el tipo del atributo.
 Los constructores que se implementaran ser�n:
 Un constructor por defecto.
 Un constructor con el titulo y horas estimadas. El resto por defecto.
 Un constructor con todos los atributos, excepto de entregado.
 Los m�todos que se implementara ser�n:
 M�todos get de todos los atributos, excepto de entregado.
 M�todos set de todos los atributos, excepto de entregado.
 Sobrescribe los m�todos toString.
 */

public class Videojuego implements Entregable{
	
	private final int HORAS_DEF=10;
	private final boolean ENTREGAD_DEF=false;
	String titulo;
	int horas;
	boolean entregado;
	String genero;
	String compa�ia;
	

	public Videojuego() {
		horas=HORAS_DEF;
		entregado=ENTREGAD_DEF;
	}
	
	public Videojuego(String t,int h) {
		titulo=t;
		horas=h;
		entregado=ENTREGAD_DEF;
	}
	public Videojuego(String t, int h, String g,String c) {
		 titulo=t;
		 horas=h;
		 genero=g;
		 compa�ia=c;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horas=" + horas + ", genero=" + genero + ", compa�ia=" + compa�ia
				+ "]";
	}
	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		entregado=true;
	}
	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		entregado=false;
	}
	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return entregado;
	}
	@Override
	public int compareTo(Object obj) {
		// TODO Auto-generated method stub
		Videojuego v = (Videojuego) obj;
		return this.horas -v.getHoras();
	}
	
}
