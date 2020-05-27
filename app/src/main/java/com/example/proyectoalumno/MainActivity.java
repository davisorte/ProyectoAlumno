package com.example.proyectoalumno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Hilo.Hilo;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.button1);
        btn2=(Button)findViewById(R.id.button2);
        btn3=(Button)findViewById(R.id.button3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //llamamos al siguiente activity ya hecho con anterioridad
                //referencia a la clase principal y la que se va a llamar
                Hilo miHilo=new Hilo();
                miHilo.run();
                Intent intentReg=new Intent(MainActivity.this,DatosAlumnos.class);
        //inicia el activity Registro
                MainActivity.this.startActivity(intentReg);
              }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //llamamos al siguiente activity ya hecho con anterioridad
                //referencia a la clase principal y la que se va a llamar
                Hilo miHilo=new Hilo();
                miHilo.run();
                Intent intentReg=new Intent(MainActivity.this,Pagos.class);
                //inicia el activity Registro
                MainActivity.this.startActivity(intentReg);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //llamamos al siguiente activity ya hecho con anterioridad
                //referencia a la clase principal y la que se va a llamar
                Hilo miHilo=new Hilo();
                miHilo.run();
                Intent intentReg=new Intent(MainActivity.this,Horario.class);
                //inicia el activity Registro
                MainActivity.this.startActivity(intentReg);
            }
        });
    }
}
