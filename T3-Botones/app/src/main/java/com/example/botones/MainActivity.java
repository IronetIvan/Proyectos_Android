package com.example.botones;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, CompoundButton.OnCheckedChangeListener, RadioGroup.OnCheckedChangeListener {

    ImageButton botonimagen;
    ToggleButton botontoggle;
    CheckBox checknormal;
    Switch switchnormal;
    RadioGroup gruporadios;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {
        botonimagen.setOnClickListener(this);
        botontoggle.setOnCheckedChangeListener(this);
        checknormal.setOnCheckedChangeListener(this);
        switchnormal.setOnCheckedChangeListener(this);
        gruporadios.setOnCheckedChangeListener(this);
    }

    private void instancias() {
        botonimagen = findViewById(R.id.btnimagen);
        botontoggle = findViewById(R.id.toggleboton);
        checknormal = findViewById(R.id.checknormal);
        switchnormal = findViewById(R.id.switchnormal);
        gruporadios = findViewById(R.id.gruporadios);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnimagen:
                //Log.v("tag", String.valueOf(botontoggle.isChecked()));
                //Log.v("tag", String.valueOf(checknormal.isChecked()));
                //Log.v("tag", String.valueOf(switchnormal.isChecked()));

                RadioButton rSel = findViewById(gruporadios.getCheckedRadioButtonId());
                break;
        }
    }

    @Override
    public void onCheckedChanged(CompoundButton compoundbutton, boolean b) {

        String elemento = "";
        boolean estado = false;

        switch (compoundbutton.getId()){
            case R.id.checknormal:
                elemento = "Check";
                estado = b;
                break;

            case R.id.toggleboton:
                if(b){
                    botonimagen.setEnabled(true);
                } else {
                    botonimagen.setEnabled(false);
                }
                elemento = "Toggle";
                estado = b;
                break;

            case R.id.switchnormal:
                elemento = "Switch";
                estado = b;
                break;
        }
        Toast.makeText(getApplicationContext(),String.format("El elemento %s esta en estado %b", elemento, estado),Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int i) {

        String elemento = "";
        switch (i){
            case R.id.radio1:
                elemento = "Opcion 1";
                break;

            case R.id.radio2:
                elemento = "Opcion 2";
                break;

            case R.id.radio3:
                elemento = "Opcion 3";
                break;
        }
        Toast.makeText(getApplicationContext(),elemento,Toast.LENGTH_SHORT).show();
    }
}
