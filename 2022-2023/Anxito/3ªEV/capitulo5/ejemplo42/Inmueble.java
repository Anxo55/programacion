package capitulo5.ejemplo42;

public class Inmueble {
    
//atributos
protected int id;
protected int area;
protected String direccion;
protected double precioVenta;

public Inmueble(int idTipo, int area, String direccion) {
    this.id = id;
    this.area = area;
    this.direccion = direccion;
}

public double calculaPrecioVenta(double ValorArea) {
    return 0d;
}

@Override
public String toString() {
    return "Inmueble [id=" + id + ", area=" + area + ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
}





}
