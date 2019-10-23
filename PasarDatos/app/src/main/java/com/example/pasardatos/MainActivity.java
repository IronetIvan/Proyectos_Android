package com.example.pasardatos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pasardatos.persona.Persona;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnPasarDatos, btnPasarPantalla;
    private TextView textoPasarNombre, textoPasarTelefono, textoPasarApellido;
    private CheckBox checkboxpermitir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();

    }



    private void instancias() {
        btnPasarDatos = this.findViewById(R.id.btnPasardatos);
        btnPasarPantalla = this.findViewById(R.id.btnPasarpantalla);
        textoPasarNombre = this.findViewById(R.id.txtpasarnombre);
        textoPasarTelefono = this.findViewById(R.id.txtpasartelefono);
        textoPasarApellido = this.findViewById(R.id.txtpasarapellido);
        checkboxpermitir = this.findViewById(R.id.checkpermitir);
    }

    private void acciones() {
        btnPasarDatos.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btnPasardatos:
                String palabraPasar = textoPasarNombre.getText().toString();
                int numeroPasar = Integer.valueOf(textoPasarTelefono.getText().toString());
                if(palabraPasar.isEmpty()){

                    String nombre = textoPasarNombre.getText().toString();
                    String apellido = textoPasarApellido.getText().toString();
                    int telefono = Integer.valueOf(textoPasarTelefono.getText().toString());
                    Persona persona = new Persona(nombre, apellido, telefono);

                } else if (numeroPasar != 0) {
                    //Toast.makeText(getApplicationContext(),palabraPasar,Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                    intent.putExtra("k1", palabraPasar);
                    intent.putExtra("k2", numeroPasar);
                    startActivity(intent);
                }
                break;



        }
    }
}

