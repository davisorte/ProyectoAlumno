package com.example.proyectoalumno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import Hilo.Hilo;

public class Pagos extends AppCompatActivity {
    Button btn1,btn2;
    static EditText miEdit1,miEdit2;
    static TextView muestra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagos);
        miEdit1=(EditText)findViewById(R.id.nControl);
        miEdit2=(EditText)findViewById(R.id.carrera);
        muestra=(TextView) findViewById(R.id.Muestra);

        btn1=(Button)findViewById(R.id.ALGA);
        btn2=(Button)findViewById(R.id.Regresar);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n=Pagos.miEdit1.getText().toString();
                String l=Pagos.miEdit2.getText().toString();
                Pagos.muestra.append("Total a pagar: 1600 \n");
                Pagos.muestra.append(n +"\n");
                Pagos.muestra.append(l +"\n");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //llamamos al siguiente activity ya hecho con anterioridad
                //referencia a la clase principal y la que se va a llamar
                Intent intentReg=new Intent(Pagos.this,MainActivity.class);
                //inicia el activity Registro
                Pagos.this.startActivity(intentReg);
            }
        });

    }
}
