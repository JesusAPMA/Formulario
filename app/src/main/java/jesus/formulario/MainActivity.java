package jesus.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private EditText et1,et2,et3,et4,et5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1 =(EditText) findViewById(R.id.etNombre);
        et2 =(EditText) findViewById(R.id.etFecha);
        et3 =(EditText) findViewById(R.id.etTelefono);
        et4 =(EditText) findViewById(R.id.etEmail);
        et5 =(EditText) findViewById(R.id.etDescripcion);
    }
    public void ejecutar(View view) {
        Intent i = new Intent(this, Mostrar.class);
        i.putExtra("nombre", et1.getText().toString());
        i.putExtra("fecha", et2.getText().toString());
        i.putExtra("telefono", et3.getText().toString());
        i.putExtra("email", et4.getText().toString());
        i.putExtra("descripcion", et5.getText().toString());
        startActivity(i);
    }
}
