package com.example.practicabotones;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DadosActivity extends AppCompatActivity implements View.OnClickListener {

     Button tirada;
     ImageView dado;
    int[]posibilidades = {R.drawable.dado_uno, R.drawable.dado_dos, R.drawable.dado_tres,R.drawable.dado_cuatro, R.drawable.dado_cinco, R.drawable.dado_seis};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dados);
        instancias();
        acciones();

    }

    private void acciones() {
       tirada.setOnClickListener(this);
    }

    private void instancias() {
        tirada = findViewById(R.id.tiradaDado);
        dado = findViewById(R.id.imagen_dado);
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    public void onClick(View v) {

        int numero = (int) (Math.random() * 6);
        dado.setImageDrawable(getResources().getDrawable(posibilidades[numero], null));
        dado.setImageResource(posibilidades[numero]);


    }
}
