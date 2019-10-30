package com.example.practicabotones;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity  extends AppCompatActivity implements View.OnClickListener {

    ImageButton aleatorio, ganador, dados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        aleatorio.setOnClickListener(this);
        ganador.setOnClickListener(this);
        dados.setOnClickListener(this);
    }

    private void instancias() {
        aleatorio = findViewById(R.id.btnaleatorio);
        ganador = findViewById(R.id.btntrofeo);
        dados = findViewById(R.id.btndados);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.btnaleatorio:
                Intent aleatorio = new Intent(getApplicationContext(),AleatorioActivity.class);
                startActivity(aleatorio);
                break;

            case R.id.btntrofeo:
                Intent ganador = new Intent(getApplicationContext(),GanadorActivity.class);
                startActivity(ganador);
                break;

            case R.id.btndados:
                Intent dados = new Intent(getApplicationContext(),DadosActivity.class);
                startActivity(dados);
                break;
        }
    }
}
