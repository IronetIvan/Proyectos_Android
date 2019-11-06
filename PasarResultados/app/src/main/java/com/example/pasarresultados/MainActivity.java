package com.example.pasarresultados;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnpulsar;
    TextView txttexto;
    final int REQ_COD = 1;
    final static int RES_COD_OK = 0;
    final static int RES_COD_FAIL = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();

    }

    private void acciones() {
        btnpulsar.setOnClickListener(this);
    }

    private void instancias() {
        btnpulsar = findViewById(R.id.btnpulsar);
        txttexto = findViewById(R.id.texto);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RES_COD_FAIL) {
            txttexto.setText("No han contestado");
        } else {
            String respuesta = (String) data.getExtras().get(SecondActivity.TAG_Respuesta);
            txttexto.setText(respuesta);
        }
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnpulsar:
                Intent intent = new Intent(getApplicationContext(),SecondActivity.class);
                startActivityForResult(intent , REQ_COD);
                break;
        }
    }
}
