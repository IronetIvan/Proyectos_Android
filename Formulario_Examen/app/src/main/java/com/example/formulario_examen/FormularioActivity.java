package com.example.formulario_examen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.formulario_examen.utils.Persona;

import java.util.ArrayList;

public class FormularioActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txtnombre, txtapellido;
    TextView nombre, apellido, edad;
    Button btnagregar, btnpasaredad;
    Spinner spinneredad;
    ArrayList listaedades, listapersonas;
    ArrayAdapter adaptadorEdades, adaptadorPersonas;

    final int REQ_COD = 1; //codigo de peticion

    final static int RES_COD_OK = 0; //codigo de respuesta
    final static int RES_COD_FAIL = 1; //codigo de respuesta

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        instancias();
        rellenaredades();
        acciones();
    }

    private void rellenaredades() {
        for (int i = 0; i < 10; i++) {
        listaedades.add(i);
        adaptadorEdades.notifyDataSetChanged();
    }

    }

    private void instancias() {
        txtnombre = findViewById(R.id.edit_nombre);
        txtapellido = findViewById(R.id.edit_apellido);

        nombre = findViewById(R.id.ver_nombre);
        apellido = findViewById(R.id.ver_apellido);
        spinneredad = findViewById(R.id.spinner_edad);

        btnagregar = findViewById(R.id.boton_agregar);
        btnpasaredad = findViewById(R.id.boton_cambiar);

        adaptadorEdades = new ArrayAdapter(getApplicationContext(),
                android.R.layout.simple_spinner_item, listaedades);

        adaptadorPersonas = new ArrayAdapter(getApplicationContext(),
                android.R.layout.simple_spinner_item, listapersonas);
        listaedades = new ArrayList();
        listapersonas =  new ArrayList();

    }


    private void acciones() {

        btnagregar.setOnClickListener(this);
        btnpasaredad.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.boton_agregar:
                if (txtnombre.getText().toString().isEmpty() || txtapellido.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(), "Faltan datos", Toast.LENGTH_SHORT).show();
                } else {

                    String nombre = txtnombre.getText().toString();
                    String apellido = txtapellido.getText().toString();
                    int edad = (int)adaptadorEdades.getItem(spinneredad.getSelectedItemPosition());
                    Persona persona = new Persona(nombre, apellido, edad);
                    listapersonas.add(persona);
                    adaptadorEdades.notifyDataSetChanged();
                }
                break;

            case R.id.boton_cambiar:
                if (adaptadorPersonas.getCount() > 0) {
                    Persona persona = (Persona) adaptadorPersonas.getItem(.getSelectedItemPosition());
                    Toast.makeText(getApplicationContext(), persona.getNombre(), Toast.LENGTH_SHORT).show();
                })
                break;
        }
    }
}
