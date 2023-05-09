public class Test {

    public static void main(String[] args) {
        Equipo equipo1 = new Equipo("Sky", "Estados Unidos");

        Velocista velocista1 = new Velocista(123979, "Geraint Thomas", 320,25);
        Escalador escalador1 = new Escalador(123980, "Egan Bernal", 25, 10);
        Contrarrelojista contrarrelojista = new Contrarrelojista(1502, "Jonathan Catroviejo", 120, 0, 0);

        equipo1.añadirCiclista(velocista1);
        equipo1.añadirCiclista(escalador1);
        equipo1.añadirCiclista(contrarrelojista);

        Equipo  equipo2 = new Equipo("Movistar", "España");

        Velocista velocista2 = new Velocista(123446, "Pepe Luis", 320,25);
        Escalador escalador2 = new Escalador(23534, "Alba cete", 25, 10);
        Contrarrelojista contrarrelojista2 = new Contrarrelojista(124665, "Jhonny Melabo", 120, 20, 0);

        equipo2.añadirCiclista(contrarrelojista2);
        equipo2.añadirCiclista(velocista2);
        equipo2.añadirCiclista(escalador2);

        System.out.println("Antes de la prueba");
        equipo1.imprimir();

        velocista1.setTiempoAcumulado(365);
        escalador1.setTiempoAcumulado(385);
        contrarrelojista.setTiempoAcumulado(370);

        velocista2.setTiempoAcumulado(330);
        escalador2.setTiempoAcumulado(380);
        contrarrelojista2.setTiempoAcumulado(395);


        equipo1.calcularTotalTiempo();
        equipo1.ordenaPosiciones();
        System.out.println("Despues de la prueba");
        equipo1.imprimir();
        equipo1.listarEquipo();

        equipo2.calcularTotalTiempo();
        equipo2.ordenaPosiciones();
        System.out.println("Despues de la prueba");
        equipo2.imprimir();
        equipo2.listarEquipo();
    }
    
}
