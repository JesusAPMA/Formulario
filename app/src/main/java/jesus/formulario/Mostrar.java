package jesus.formulario;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Mostrar extends AppCompatActivity {
private TextView nombre,telefono,fecha,email,descripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar);
        nombre=(TextView)findViewById(R.id.nombre);
       fecha=(TextView)findViewById(R.id.fecha);
        telefono=(TextView)findViewById(R.id.telefono);
        email=(TextView)findViewById(R.id.email);
       descripcion=(TextView)findViewById(R.id.descripcion);
        Bundle bundle = getIntent().getExtras();
        nombre.setText(bundle.getString("nombre"));
       fecha.setText(bundle.getString("fecha"));
        telefono.setText(bundle.getString("telefono"));
        email.setText(bundle.getString("email"));
        descripcion.setText(bundle.getString("descripcion"));

    }
    public void ejecutar(View view) {
        Intent i = new Intent(this, MainActivity.class);
        i.putExtra("nombre", nombre.getText().toString());
        i.putExtra("fecha", fecha.getText().toString());
        i.putExtra("telefono", telefono.getText().toString());
        i.putExtra("email", email.getText().toString());
        i.putExtra("descripcion", descripcion.getText().toString());
        startActivity(i);
    }
}
