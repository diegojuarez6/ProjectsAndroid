package mx.edu.utng.state3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private LinearLayout layPrincipal;
    private ImageButton btnCambio;
    private Lienzo lienzo;

    private Enojado estadoInicial;
    private Cara cara;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layPrincipal = (LinearLayout) findViewById(R.id.lay_principal);
        btnCambio = (ImageButton)findViewById(R.id.btn_switch);
        estadoInicial = new Enojado();
        cara = new Cara(estadoInicial);
        lienzo = new Lienzo(this, estadoInicial, cara);
        layPrincipal.addView(lienzo);

        btnCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                lienzo.setEstado(cara.getEstado());
                cara.presionarBoton();
                lienzo.invalidate();
            }
        });

    }
}
