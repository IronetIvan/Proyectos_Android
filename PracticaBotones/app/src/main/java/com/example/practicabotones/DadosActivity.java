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

        //int numero = (int) (Math.random() * 6) + 1;
        //int[]posibilidades = {R.drawable.dado_uno, R.drawable.dado_dos, R.drawable.dado_tres,R.drawable.dado_cuatro, R.drawable.dado_cinco, R.drawable.dado_seis};

        //dado.setImageDrawable(getResources().getDrawable(R.drawable.dado_uno, null));
        //dado.setImageResource(posibilidades[1]);

        if (v == tirada){
            int aleatorio = (int)(Math.random()*6)+1;

            switch (aleatorio){
                case 1:
                    dado.setImageResource(R.drawable.dado_uno);
                    break;
                case 2:
                    dado.setImageResource(R.drawable.dado_dos);
                    break;
                case 3:
                    dado.setImageResource(R.drawable.dado_tres);
                    break;
                case 4:
                    dado.setImageResource(R.drawable.dado_cuatro);
                    break;
                case 5:
                    dado.setImageResource(R.drawable.dado_cinco);
                    break;
                case 6:
                    dado.setImageResource(R.drawable.dado_seis);
                    break;
            }
        }
    }
}
