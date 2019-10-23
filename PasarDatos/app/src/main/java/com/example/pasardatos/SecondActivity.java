package com.example.pasardatos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textoNombre, Numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        instancias();
        recuperarDatos();
    }

    private void recuperarDatos(){
        if(getIntent().getExtras()!= null){
            String palabraRecuperada = getIntent().getExtras().get("k1").toString();
            textoNombre.setText((getResources().getString(R.string.en)) + " " + palabraRecuperada);
            int numeroRecuperado = (int )getIntent().getExtras().get("k2");
            Numero.setText(String.valueOf((getResources().getString(R.string.tf)) + " " + numeroRecuperado + " " +
                    getResources().getString(R.string.pt)));

        }

    }

    private void instancias() {
        textoNombre = findViewById(R.id.NombreRecuperado);
        Numero = findViewById(R.id.NumeroRecuperado);

    }


}
