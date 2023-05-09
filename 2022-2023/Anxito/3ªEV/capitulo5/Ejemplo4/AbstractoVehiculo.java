package capitulo5.Ejemplo4;
import java.awt.Color;
public abstract class AbstractoVehiculo {
    // Los mismos constructores y metodos que en la clase
// Vehiculo
// Tambien cambiamos el nombre de los constructores

abstract public float Impuesto();

public int DimeCilindrada() {
    return 0;
}

public int DimePotencia() {
    return 0;
}

public int DimeNumRuedas() {
    return 0;
}
}
