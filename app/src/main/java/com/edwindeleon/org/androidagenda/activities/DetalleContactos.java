package com.edwindeleon.org.androidagenda.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.edwindeleon.org.androidagenda.R;

public class DetalleContactos extends AppCompatActivity {

    public TextView tvNombre;
    public TextView tvTelefono;
    public TextView tvCorreo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_contactos);

        Bundle parametros = getIntent().getExtras();
        String nombre = parametros.getString("nombre");
        String telefono = parametros.getString("telefono");
        String correo = parametros.getString("correo");

        tvNombre = (TextView) findViewById(R.id.nombre);
        tvTelefono = (TextView) findViewById(R.id.telefono);
        tvCorreo = (TextView) findViewById(R.id.correo);

        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvCorreo.setText(correo);
    }
}
