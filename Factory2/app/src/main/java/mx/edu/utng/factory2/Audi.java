package mx.edu.utng.factory2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;

/**
 * Created by Juárez on 13/09/2016.
 */
public class Audi implements Figura {
    @Override
    public void dibujar(Canvas canvas) {
        Paint paint = new Paint();
        Path path = new Path();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);

        float mitadAncho = canvas.getWidth()/2;
        float mitadAlto = canvas.getHeight()/2;

        //canvas.drawRect(mitadAncho*0.5f,mitadAlto*0.5f,
          //      mitadAncho*2.5f,mitadAlto*2.5f, paint);

        canvas.drawCircle(mitadAncho*0.4f,mitadAlto,70,paint);
        canvas.drawCircle(mitadAncho*0.8f,mitadAlto,70,paint);
        canvas.drawCircle(mitadAncho*1.2f,mitadAlto,70,paint);
        canvas.drawCircle(mitadAncho*1.6f,mitadAlto,70,paint);
        //path.moveTo(mitadAncho, mitadAlto*0.5f);
        //path.lineTo(mitadAncho*0.5f, mitadAlto*0.5f);
        //path.lineTo(mitadAncho*1.5f, mitadAlto*0.5f);
        //path.lineTo(mitadAncho, mitadAlto*0.5f);
        //path.close();

        //canvas.drawPath(path, paint);
    }
}
