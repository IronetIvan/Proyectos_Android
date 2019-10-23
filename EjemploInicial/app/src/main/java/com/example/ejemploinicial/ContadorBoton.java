package com.example.ejemploinicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ContadorBoton extends AppCompatActivity implements View.OnClickListener {

    Button contador;
    TextView TextoContador;
    int contadorSum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contador_boton);
        instancias();
        acciones();
    }

    private void acciones() {
        contador.setOnClickListener(this);

    }

    private void instancias() {
        contador = this.findViewById(R.id.btncontador);
        TextoContador = this.findViewById(R.id.TextoContador);
    }

    @Override
    public void onClick(View v) {
        contadorSum++;
        TextoContador.setText(String.valueOf(contadorSum));
        if(contadorSum ==4){
            Toast.makeText(getApplicationContext(),getResources().getString(R.string.app_aviso),Toast.LENGTH_SHORT).show();
        }else if(contadorSum==5){
            finish();
        }

    }

}
