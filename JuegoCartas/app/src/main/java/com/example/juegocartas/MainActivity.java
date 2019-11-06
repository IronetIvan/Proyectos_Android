package com.example.juegocartas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnempezar;
    CheckBox checkpracticar;
    TextView editrecord;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        btnempezar.setOnClickListener(this);
    }

    private void instancias() {

        btnempezar = findViewById(R.id.empezar);
        checkpracticar = findViewById(R.id.practicar);
        editrecord = findViewById(R.id.record);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.empezar:
                Intent empezar = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(empezar);
                break;
        }
    }
}
