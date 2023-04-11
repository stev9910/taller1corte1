package com.example.corte2dia1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button botonopcion;
    EditText valoropcion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        valoropcion=findViewById(R.id.primer_numero);
        botonopcion=findViewById(R.id.operacion);
        botonopcion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarpantalla();
            }
        });
    }
    public void cambiarpantalla(){
        int valoropci = Integer.parseInt(valoropcion.getText().toString());
        if(valoropci == 1) {
            Intent pantfibo = new Intent(this,Activityfibonacci.class);
            startActivity(pantfibo);
        }else if(valoropci == 2){
            Intent pantpoten = new Intent(this,Activitypotencia.class);
            startActivity(pantpoten);
        }else if(valoropci == 3) {
            Intent pantmulti = new Intent(this,Activitymultiplicacion.class);
            startActivity(pantmulti);

        }else if(valoropci == 4) {
            Intent pantmaps = new Intent(this, MainActivityMAPS.class);
            startActivity(pantmaps);

        }else {
            Intent pant = new Intent(this, MainActivity.class);
            startActivity(pant);
        }
    }
}