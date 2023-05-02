package capitulo5.TiendaMascotas;

        public class Pequeños extends Perros {
            private String razaPequeña;

            public Pequeños(String nombre, int edad, String color, double peso, boolean muerde, String razaPequeña) {
                super(nombre, edad, color, razaPequeña, tamaño, peso, muerde);
                this.razaPequeña = razaPequeña;
            }
        
            public String getRazaPequeña() {
                return razaPequeña;
            }
        }
    

