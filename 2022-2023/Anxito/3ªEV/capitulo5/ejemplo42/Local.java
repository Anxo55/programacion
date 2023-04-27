package capitulo5.ejemplo42;

enum tipo tipolocal;

public class Local extends Inmueble{

    protected tipo tipoLocal;

    public Local(int idTipo, int area, String direccion) {
        super(idTipo, area, direccion);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "Local []";
    }

    

}
