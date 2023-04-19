package capitulo5.ejemplo2;

import java.awt.Color;

public class Triangulo extends Figura {

    private double base;
    private double altura;

    //constr
    Triangulo(double base, double altura){
        setBase(base);
        setAltura(altura);
    }

    Triangulo(double base, double altura, Color color) {
        super(color);
        setBase(base);
        setAltura(altura);
    }

    Triangulo(double base, double altura, Color color, int[] Posicion) {
        super(color, Posicion);
        setBase(base);
        setAltura(altura);
    }
    
    //toString
    @Override
    public double calculaArea() {
        // TODO Auto-generated method stub
        return base*altura/2;
    }

    //set y get
    @Override
    public String toString() {
        return "Triangulo [base=" + base + ", altura=" + altura + "]";
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //posible problema
    @Override
    public int compareTo(Object arg0) {
        // TODO Auto-generated method stub
        Figura c = (Figura) arg0;
        if (this.calculaArea()>c.calculaArea())
            return 1;
        else if (this.calculaArea() == c.calculaArea())
            return 0;
        else
            return -1;
    }

    @Override
    public double perimetro() {
        // TODO Auto-generated method stub
        System.out.println("No se calcular el perimetro lo siento");
        return 0;
    }
    
}
