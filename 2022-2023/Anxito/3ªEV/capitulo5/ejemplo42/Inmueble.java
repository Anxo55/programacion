package capitulo5.ejemplo42;

public class Inmueble {
    
//atributos
protected int idTipo;
protected int area;
protected String direccion;
protected double precio;

public Inmueble(int idTipo, int area, String direccion) {
    this.idTipo = idTipo;
    this.area = area;
    this.direccion = direccion;
}

public double calculaPrecioVenta(double ValorArea) {
    return 0d;
}

@Override
public String toString() {
    return "Inmueble [idTipo=" + idTipo + ", area=" + area + ", direccion=" + direccion + ", precio=" + precio + "]";
}





}
