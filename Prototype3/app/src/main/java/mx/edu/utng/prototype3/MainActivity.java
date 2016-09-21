package mx.edu.utng.prototype3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private EditText edtRaza;
    private EditText edtColor;
    private Button btnClonar;
    private GridView grvPerro;
    private ArrayList<Perro> perros;
    private Perro perro;
    private PerroAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtRaza = (EditText) findViewById(R.id.edt_raza);
        edtColor = (EditText) findViewById(R.id.edt_color);

        btnClonar = (Button)findViewById(R.id.btn_clonar);
        grvPerro = (GridView)findViewById(R.id.grv_perro);
        perros = new ArrayList<Perro>();
        perro = new Perro();

        btnClonar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                perro.setRaza(edtRaza.getText().toString());
                perro.setColor(edtColor.getText().toString());

                Perro clon = (Perro) perro.clonar();

                perros.add(clon);

                adapter = new PerroAdapter(MainActivity.this, perros);
                grvPerro.setAdapter(adapter);
            }
        });
    }
}
