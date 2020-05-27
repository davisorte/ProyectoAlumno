package com.example.proyectoalumno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Hilo.Hilo;

public class Horario extends AppCompatActivity {
    Button btn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);
        btn1=(Button)findViewById(R.id.regresar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //llamamos al siguiente activity ya hecho con anterioridad
                //referencia a la clase principal y la que se va a llamar

                Intent intentReg=new Intent(Horario.this,MainActivity.class);
                //inicia el activity Registro
                Horario.this.startActivity(intentReg);
            }
        });

    }
}
