package mx.edu.utng.singleton5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edtMaterial;
    private EditText edtNumSilla;
    private Button btnAgregar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtMaterial = (EditText) findViewById(R.id.edt_material);
        edtNumSilla = (EditText) findViewById(R.id.edt_numSillas);
        btnAgregar = (Button) findViewById(R.id.btn_Agregar);

        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Silla silla = Silla.getSilla();
                silla.setMaterial(edtMaterial.getText().toString());
                silla.setNumSillas(Integer.parseInt(
                        edtNumSilla.getText().toString()));

                Toast.makeText(MainActivity.this, "Silla: "
                                + "\nMaterial: " + silla.getMaterial()
                                + "\nNumero de Sillas: " + silla.getNumSillas(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
