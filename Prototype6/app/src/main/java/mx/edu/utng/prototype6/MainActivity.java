package mx.edu.utng.prototype6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtMarca;
    private EditText edtColor;
    private Button btnClonar;
    private GridView grvAmplificadores;
    private ArrayList<Amplificador> amplificadors;
    private Amplificador amplificador;
    private AmplificadorAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMarca = (EditText) findViewById(R.id.edt_marca);
        edtColor = (EditText) findViewById(R.id.edt_color);

        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvAmplificadores = (GridView)findViewById(R.id.grv_amplificadores);
        amplificadors = new ArrayList<Amplificador>();
        amplificador = new Amplificador();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                amplificador.setMarca(edtMarca.getText().toString());
                amplificador.setColor(edtColor.getText().toString());

                Amplificador clon = (Amplificador) amplificador.clonar();

                amplificadors.add(clon);

                adapter = new AmplificadorAdapter(
                        MainActivity.this, amplificadors);
                grvAmplificadores.setAdapter(adapter);
            }
        });
    }
}