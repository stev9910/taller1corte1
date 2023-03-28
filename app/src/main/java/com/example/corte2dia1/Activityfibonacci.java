package com.example.corte2dia1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Activityfibonacci extends AppCompatActivity {

    EditText valorfib;
    Button botonfib;
    TextView resulfib;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityfibonacci);
        valorfib=findViewById(R.id.valor_fi);
        resulfib=findViewById(R.id.text_fi);
        botonfib=findViewById(R.id.boton_fib);
        botonfib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int numerofibo = Integer.parseInt(valorfib.getText().toString());
                fibonacci(numerofibo);
                int fibonacci1 = fibonacci(numerofibo);
                resulfib.setText("Fibonacci("+numerofibo+")"+fibonacci1);
            }
        });

    }
    public int fibonacci(int valorfibo) {
        if (valorfibo<=1) {
            return valorfibo;
        }
        return fibonacci(-1) + fibonacci(-2);
    }
}