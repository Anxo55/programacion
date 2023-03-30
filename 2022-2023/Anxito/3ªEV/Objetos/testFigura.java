import java.awt.Color;

public class testFigura {
    
public static void main(String[] args) {
    
Figura uno = new Figura(Color.BLUE);
int[] centro = {1,2};

Figura dos = new Figura(Color.GREEN, centro);

System.out.println(uno);
System.out.println(dos);


}

}
