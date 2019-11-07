package com.example.practicabotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


import java.util.ArrayList;

public class GanadorActivity extends AppCompatActivity implements View.OnClickListener {

    Button agregar, generar;
    TextView parrillaCon;
    EditText concursante;
    ArrayList concursantes;
    int posicion = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganador);
        instacias();
        acciones();
    }

    private void acciones() {
        agregar.setOnClickListener(this);
        generar.setOnClickListener(this);
    }

    private void instacias() {
        agregar = findViewById(R.id.agregarconcursante);
        generar = findViewById(R.id.generarganador);
        parrillaCon = findViewById(R.id.concursantestotales);
        concursante = findViewById(R.id.nombre);
        concursantes = new ArrayList();
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.agregarconcursante:
                String con = concursante.getText().toString();
                concursantes.add(posicion,con);
                parrillaCon.append(con + "\n");
                concursante.setText("");
                System.out.println(concursantes);
                posicion++;
                break;
            case R.id.generarganador:
                int aleatorio = (int)(Math.random()*concursantes.size());
                String prueba = concursantes.get(aleatorio).toString();
                parrillaCon.setText("El ganador es -" + prueba + "-");
                concursantes.clear();
                posicion = 0;
                break;
        }

    }
}
