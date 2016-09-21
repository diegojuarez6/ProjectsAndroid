package mx.edu.utng.prototype3;

/**
 * Created by Juárez on 11/09/2016.
 */
public class Perro implements Clonable{

        private String raza;
        private String color;

        public Perro(){
            this.raza = "";
            this.color = "";
        }

        public Perro(String raza, String color) {
            this.raza = raza;
            this.color = color;
        }

        @Override
        public Clonable clonar() {
            Perro clon = new Perro(raza, color);
            return clon;
        }

        public String getRaza() {
            return raza;
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

    }

