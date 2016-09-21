package mx.edu.utng.state3;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

/**
 * Created by TICLAB1 on 14/09/2016.
 */
    public class Enojado extends Estado{

        @Override
        public void pulsarBoton(Cara cara, Canvas canvas) {
            cara.setEstado(new Feliz());
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.FILL);
            paint.setColor(Color.BLACK);
            float mitadX = canvas.getWidth()/2;
            float mitadY = canvas.getHeight()/2;

            canvas.drawRect(0.0f, 0.0f,
                    mitadX*5.5f, mitadY*5.5f, paint);

            paint.setColor(Color.YELLOW);

            canvas.drawCircle(mitadX,mitadY,250f,paint);

            paint.setColor(Color.WHITE);
            canvas.drawCircle(mitadX*0.5f,mitadY*.5f,50f,paint);

            paint.setColor(Color.WHITE);
            canvas.drawCircle(mitadX*1.5f,mitadY*.5f,50f,paint);

            paint.setColor(Color.BLACK);
            canvas.drawCircle(mitadX*0.5f,mitadY*.5f,20f,paint);

            paint.setColor(Color.BLACK);
            canvas.drawCircle(mitadX*1.5f,mitadY*.5f,20f,paint);


        }
    }
