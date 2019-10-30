package com.example.botones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageButton boton;
    ToggleButton togglebtn;
    CheckBox checknormal;
    Switch switchnormal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        boton.setOnClickListener(this);
    }

    private void instancias() {
        boton = findViewById(R.id.btnimagen);
        togglebtn = findViewById(R.id.toggleboton);
        checknormal = findViewById(R.id.checknormal);
        switchnormal = findViewById(R.id.switchnormal);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnimagen:

                break;
        }
    }
}
