package com.example.pasarresultados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    Button resultado;
    EditText editable;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        instancias();
    }

    private void instancias() {
        resultado = findViewById(R.id.btnpulsar);
        editable = findViewById(R.id.textoeditado);
    }
}
