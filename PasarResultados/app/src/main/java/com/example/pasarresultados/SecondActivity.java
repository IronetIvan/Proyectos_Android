package com.example.pasarresultados;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button resultado;
    EditText editable;
    final static String TAG_Respuesta = "respuesta";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        instancias();
        acciones();
    }

    private void acciones() {
        resultado.setOnClickListener(this);
    }

    private void instancias() {
        resultado = findViewById(R.id.volver);
        editable = findViewById(R.id.textoeditado);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.volver:
                if (editable.getText().toString().isEmpty()){
                    setResult(MainActivity.RES_COD_FAIL);
                } else {
                    Intent irespuesta = new Intent();
                    irespuesta.putExtra(TAG_Respuesta, editable.getText().toString());
                    setResult(MainActivity.RES_COD_OK, irespuesta);
                }

                finish();
                break;

        }
    }
}
