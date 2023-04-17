package capitulo5.ejemplo1;

public class Periodico extends Publicacion{

    //atributos
    public String Nombre;
    public String Fecha;

    public Periodico() {

    }

    public Periodico(int ndp, float p, String nombre, String fecha) {
        super(ndp, p);
        Nombre=nombre;
        Fecha = fecha;
    }
    
}
