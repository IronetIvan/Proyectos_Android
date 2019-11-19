package com.example.repasoandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.repasoandroid.utils.Persona;

public class ResultadoActivity extends AppCompatActivity {

    TextView resultadopersona;
    Spinner spinnerresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);
        instancias();
        recuperarDatos();
    }

    private void recuperarDatos() {
        if(getIntent().getExtras()!= null){
            String nombre =
            String apellido;
            int edad;
        }
    }


    private void instancias() {

        resultadopersona = findViewById(R.id.resultados);
        spinnerresultado = findViewById(R.id.spinner_resultados);
    }
}
