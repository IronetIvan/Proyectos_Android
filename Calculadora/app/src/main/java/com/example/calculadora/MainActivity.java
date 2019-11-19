package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnum1, btnum2, btnum3, btnum4, btnum5, btnum6,
    btnum7, btnum8, btnum9, btnum0, btnsuma, btnresta,
    btnproducto, btndividir, btnreset, btnigual, btndecimal, btnlog, btnsen, btncos, btntan;
    //as
    TextView MostrarResultado;
    double resultado;
    String operador, mostrar , reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        instancias();
        acciones();
    }

    private void acciones() {

        btnum0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = MostrarResultado.getText().toString();
                mostrar = mostrar + "0";
                MostrarResultado.setText(mostrar);
            }
        });

        btnum1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = MostrarResultado.getText().toString();
                mostrar = mostrar + "1";
                MostrarResultado.setText(mostrar);
            }
        });

        btnum2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = MostrarResultado.getText().toString();
                mostrar = mostrar + "2";
                MostrarResultado.setText(mostrar);
            }
        });

        btnum3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = MostrarResultado.getText().toString();
                mostrar = mostrar + "3";
                MostrarResultado.setText(mostrar);
            }
        });

        btnum4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mostrar = MostrarResultado.getText().toString();
                mostrar = mostrar + "4";
                MostrarResultado.setText(mostrar);
            }
        });

        btnum5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = MostrarResultado.getText().toString();
                mostrar = mostrar + "5";
                MostrarResultado.setText(mostrar);
            }
        });

        btnum6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = MostrarResultado.getText().toString();
                mostrar = mostrar + "6";
                MostrarResultado.setText(mostrar);
            }
        });

        btnum7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = MostrarResultado.getText().toString();
                mostrar = mostrar + "7";
                MostrarResultado.setText(mostrar);
            }
        });

        btnum8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = MostrarResultado.getText().toString();
                mostrar = mostrar + "8";
                MostrarResultado.setText(mostrar);
            }
        });

        btnum9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = MostrarResultado.getText().toString();
                mostrar = mostrar + "9";
                MostrarResultado.setText(mostrar);
            }
        });

        btnsuma.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = MostrarResultado.getText().toString();
                operador = "+";
                MostrarResultado.setText("");
            }
        });

        btnresta.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = MostrarResultado.getText().toString();
                operador = "-";
                MostrarResultado.setText("");
            }
        });

        btnproducto.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = MostrarResultado.getText().toString();
                operador = "*";
                MostrarResultado.setText("");
            }
        });

        btndividir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                reserva = MostrarResultado.getText().toString();
                operador = "/";
                MostrarResultado.setText("");
            }
        });

        btndecimal.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = MostrarResultado.getText().toString();
                mostrar = mostrar + ".";
                MostrarResultado.setText(mostrar);
            }
        });

        btnreset.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = "";
                MostrarResultado.setText(mostrar);
                reserva = "";
                operador = "";
            }
        });

        btnigual.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                mostrar = MostrarResultado.getText().toString();
                mostrar = mostrar + "1";

                if(operador.equals("-")){
                    resultado = Double.parseDouble(reserva) - Double.parseDouble(MostrarResultado.getText().toString());
                    MostrarResultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("+")){
                    resultado = Double.parseDouble(reserva) + Double.parseDouble(MostrarResultado.getText().toString());
                    MostrarResultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("/")){
                    resultado = Double.parseDouble(reserva) / Double.parseDouble(MostrarResultado.getText().toString());
                    MostrarResultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("*")){
                    resultado = Double.parseDouble(reserva) * Double.parseDouble(MostrarResultado.getText().toString());
                    MostrarResultado.setText(String.valueOf(resultado));
                }
                if(operador.equals("log")){
                    operador = reserva;
                    MostrarResultado.setText((int) Math.log(Double.parseDouble(reserva)));
                }

            }
        });
    }

    private void instancias() {
        btnum0 = this.findViewById(R.id.num0);
        btnum1 = this.findViewById(R.id.num1);
        btnum2 = this.findViewById(R.id.num2);
        btnum3 = this.findViewById(R.id.num3);
        btnum4 = this.findViewById(R.id.num4);
        btnum5 = this.findViewById(R.id.num5);
        btnum6 = this.findViewById(R.id.num6);
        btnum7 = this.findViewById(R.id.num7);
        btnum8 = this.findViewById(R.id.num8);
        btnum9 = this.findViewById(R.id.num9);
        btnsuma = this.findViewById(R.id.suma);
        btnresta = this.findViewById(R.id.resta);
        btnproducto = this.findViewById(R.id.multiplicar);
        btndividir = this.findViewById(R.id.dividir);
        btnreset = this.findViewById(R.id.reset);
        btnigual = this.findViewById(R.id.igual);
        btndecimal = this.findViewById(R.id.decimal);
        MostrarResultado = this.findViewById(R.id.muestradatos);
        btnlog = this.findViewById(R.id.logaritmo);
        btnsen = this.findViewById(R.id.seno);
        btncos = this.findViewById(R.id.coseno);
        btntan = this.findViewById(R.id.tangente);

    }
}
