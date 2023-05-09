public class Test {

    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Sky", "Estados Unidos");
        Velocista velocista1 = new Velocista(123979, "Geraint Thomas", 320,25);
        Escalador escalador1 = new Escalador(123980, "Egan Bernal", 25, 10);
        Contrarrelojista contrarrelojista = new Contrarrelojista(1502, "Jonathan Catroviejo", 120, 0, 0);

        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista);

        System.out.println("Antes de la prueba");
        equipo1.imprimir();

        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarrelojista.setTiempoAcumulado(370);

        equipo1.calcularTotalTiempo();
        System.out.println("Despues de la prueba");
        equipo1.imprimir();
        equipo1.listarEquipo();
    }
    
}
