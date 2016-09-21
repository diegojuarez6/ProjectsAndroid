package mx.edu.utng.singleton6;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtFoto;
    private EditText edtNumFoto;
    private Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtFoto = (EditText) findViewById(R.id.edt_foto);
        edtNumFoto = (EditText) findViewById(R.id.edt_numFotos);
        btnAgregar = (Button) findViewById(R.id.btn_Agregar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Foto foto = Foto.getFoto();
                foto.setNombre(edtFoto.getText().toString());
                foto.setNumFotos(Integer.parseInt(
                        edtNumFoto.getText().toString()));

                Toast.makeText(MainActivity.this, "Foto: "
                                + "\nNombre: " + foto.getNombre()
                                + "\nNumero de Fotos: " + foto.getNumFotos(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
