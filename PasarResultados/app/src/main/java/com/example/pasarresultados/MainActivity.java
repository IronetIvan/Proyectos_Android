package com.example.pasarresultados;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnpulsar;
    TextView txttexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
    }

    private void instancias() {
        btnpulsar = findViewById(R.id.btnpulsar);
        txttexto = findViewById(R.id.texto);
    }
}
