package mx.edu.utng.state3;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/**
 * Created by TICLAB1 on 14/09/2016.
 */

    public class Lienzo extends View {

        private Estado estado;
        private Cara cara;

        public Lienzo(Context context, Estado estado, Cara cara) {
            super(context);
            this.estado = estado;
            this.cara = cara;
        }

        @Override
        protected void onDraw(Canvas canvas) {
            if (estado != null && cara!= null) {
                cara.setCanvas(canvas);
                estado.pulsarBoton(cara, canvas);
            }
        }

        public Estado getEstado() {
            return estado;
        }

        public void setEstado(Estado estado) {
            this.estado = estado;
        }

    }
