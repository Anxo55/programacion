package capitulo5.TiendaMascotas2;

public class PerroMediano extends Perros{
    enum razas{
       COLLIE, DALMATA, BULLDO, GALGO
    }

        private razas raza;

        public PerroMediano(String nombre, int edad, String color, int peso, boolean muerde, razas raza) {
            super(nombre, edad, color, peso, muerde);
            this.raza = raza;
        }

        public razas getRaza() {
            return raza;
        }

        public void setRaza(razas raza) {
            this.raza = raza;
        }

        @Override
        public String toString() {
            return super.toString()+"PerroMediano [raza=" + raza + "]";
        }

        
}
