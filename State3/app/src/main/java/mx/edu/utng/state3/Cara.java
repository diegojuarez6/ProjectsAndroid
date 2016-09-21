package mx.edu.utng.state3;

import android.graphics.Canvas;

/**
 * Created by TICLAB1 on 14/09/2016.
 */
    public class Cara {
        private Estado estado;
        private Canvas canvas;

        public Cara(Estado estado) {
            this.estado = estado;
        }

        public void presionarBoton() {
            estado.pulsarBoton(this, canvas);
        }

        public Canvas getCanvas() {
            return canvas;
        }

        public void setCanvas(Canvas canvas) {
            this.canvas = canvas;
        }

        public Estado getEstado() {
            return estado;
        }

        public void setEstado(Estado estado) {
            this.estado = estado;
        }
    }

