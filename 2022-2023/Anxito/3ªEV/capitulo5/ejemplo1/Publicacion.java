package capitulo5.ejemplo1;

public class Publicacion {
    //atributos
    protected int NumeroDePaginas;
    protected float Precio;

    public Publicacion() {
        this.NumeroDePaginas=0;
        this.Precio=0f;
    }

        public Publicacion(int numeroDePaginas, float precio) {
        NumeroDePaginas = numeroDePaginas;
        Precio = precio;
    }

    //set get
    public int getNumeroDePaginas() {
        return NumeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        NumeroDePaginas = numeroDePaginas;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    
    
}
