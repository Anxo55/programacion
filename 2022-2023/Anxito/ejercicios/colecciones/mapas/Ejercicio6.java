package colecciones.mapas;

import java.util.HashMap;
import java.util.Scanner;

/*Implementa el control de acceso al área de un programa. Se debe pedir un nombre
 * de usuario y una contraseña. Si el usuario introduce los datos correctamente,
 * el programa dirá "Ha accedido al área restringida".
 * 
 *El usuario tendrá un máximo de 3 oportunidades. Si se agotan las oportunidades 
 el porgrama dirá "Lo siento no tiene acceso al área restringida". Losa nombres 
 del usuario con sus correspondientes contraseñas deben estar almacenadas
 en una estructura de la clase HashMap.
 */

public class Ejercicio6 {
public static HashMap<String,String> Login= new HashMap<>();

public static void poblarMap() {
    Login.put( "Amalia Núñez","1234");
    Login.put("Cindy Nero","1235");
    Login.put("César Vázquez","2234");
    Login.put("Víctor Tilla","3234");
    Login.put("Alan Brito","4234");
    Login.put("Esteban Quito","5234");
    Login.put("Conchita Perez","6234");
}
    
public static void main(String[] args) {
    poblarMap();
    Scanner sc= new Scanner(System.in);
    String usuario,contraseña="";
    int veces=0;
    boolean seguir= true;


   /*  for(int i=0;i<3;i++){
        System.out.println("Usuario: ");
    usuario= sc.nextLine();
    System.out.println("Contraseña: ");
    contraseña=sc.nextLine();
    if(Login.containsKey(usuario)&& Login.containsValue(contraseña)){
    System.out.println("Bienvenido, estás logeado");
        break;
    }
    else{
        System.out.println("Has fallado");
    }
    }*/
    
do {
    System.out.println("Usuario: ");
    usuario= sc.nextLine();
    System.out.println("Contraseña: ");
    contraseña=sc.nextLine();
   if(Login.containsKey(usuario)&& Login.get(usuario).equals(contraseña)){
    System.out.println("Bienvenido, estás logeado");
    seguir=false;
   }

   if(!Login.containsKey(usuario)){
    System.out.println("Usuario no existente");
    veces++;
} 
if(Login.containsKey(usuario)&& !Login.get(usuario).equals(contraseña)){
    System.out.println("Contraseña fallida");
    veces++;
}

}
while (seguir && veces<3);

if(veces >=3)
    System.out.println("Intentado 3 veces adios");

System.out.println("Intentado "+veces+" veces adios");
}
}
 
    


