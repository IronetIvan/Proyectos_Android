package com.example.repasoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.repasoandroid.utils.Persona;

import java.util.ArrayList;

public class Formulario_Activity extends AppCompatActivity implements View.OnClickListener {
    TextView nombre, apellido, edad;
    EditText editNombre, editApellido;
    Button agregar, introducirEdad;
    Spinner spinnerEdad;
    ArrayAdapter adaptEdades, adaptadorPersonas;
    ArrayList listaEdad, listaPersonas;

    final static int REQ_COD =1; //codigo peticion
    final static int REQ_COD_OK =0; //codigo respuesta
    final static int REQ_COD_FAIL =1; //codigo respuesta


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario_);
        instancias();
        acciones();
    }


    private void instancias() {
        nombre = findViewById(R.id.txtnombre);
        apellido = findViewById(R.id.txtapellido);
        edad = findViewById(R.id.txtedad);
        editNombre = findViewById(R.id.edit_nombre);
        editApellido = findViewById(R.id.edit_apellido);
        agregar = findViewById(R.id.boton_agregar);
        introducirEdad = findViewById(R.id.boton_obtener);
        spinnerEdad = findViewById(R.id.spinnerEdad);
        listaEdad = new ArrayList();
        listaPersonas = new ArrayList();
        adaptEdades = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_spinner_item, listaEdad);
        adaptadorPersonas = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_item, listaPersonas);
    }

    private void acciones() {
        agregar.setOnClickListener(this);
        introducirEdad.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    switch (v.getId()){
        case R.id.boton_agregar:
            if(editNombre.getText().toString().isEmpty() || editApellido.getText().toString().isEmpty()){
                Toast.makeText(getApplicationContext(), "Faltan datos" , Toast.LENGTH_SHORT).show();
            }else {
                String nombbre = editNombre.getText().toString();
                String apellido = editApellido.getText().toString();
                int edad = (int)adaptEdades.getItem(spinnerEdad.getSelectedItemPosition());
                Persona persona = new Persona(nombbre, apellido,edad);
                listaPersonas.add(persona);
                adaptEdades.notifyDataSetChanged();
            }
            break;
        case R.id.boton_obtener:
            Intent intent = new Intent(getApplicationContext(),)
    }
    }
}
