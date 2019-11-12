package com.example.practicabotones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


import java.util.ArrayList;

public class GanadorActivity extends AppCompatActivity implements View.OnClickListener {

    Button agregar, generar;
    TextView parrillaCon;
    EditText concursante;
    ArrayList concursantes;
    Boolean estado_parrilla;
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
                if (!concursante.getText().toString().isEmpty()) {
                    String con = concursante.getText().toString();
                    concursantes.add(posicion, con);
                    parrillaCon.append(con + "\n");
                    concursante.setText("");
                    System.out.println(concursantes);
                    posicion++;
                    estado_parrilla = true;
                } else {
                    Toast.makeText(getApplicationContext(),"Introduce concursante",Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.generarganador:
                if (!parrillaCon.getText().toString().isEmpty()) {
                    int aleatorio = (int) (Math.random() * concursantes.size());
                    String prueba = concursantes.get(aleatorio).toString();
                    parrillaCon.setText("El ganador es -" + prueba + "-");
                    concursantes.clear();
                    posicion = 0;
                    estado_parrilla = false;
                }else{
                    Toast.makeText(getApplicationContext(),"No hay concursantes",Toast.LENGTH_SHORT).show();
                }
                break;
        }

    }
}
