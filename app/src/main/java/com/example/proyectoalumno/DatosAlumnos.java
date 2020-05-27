package com.example.proyectoalumno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import Hilo.Hilo;
public class DatosAlumnos extends AppCompatActivity {
    Button btn1,aceptar;
    static EditText miEdit1,miEdit2,miEdit3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos_alumnos);

        miEdit1=(EditText)findViewById(R.id.miID1);
        miEdit2=(EditText)findViewById(R.id.miId2);
        miEdit3=(EditText)findViewById(R.id.miID3);

        btn1=(Button)findViewById(R.id.Regresar);
        aceptar=(Button)findViewById(R.id.btnIniciar);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //llamamos al siguiente activity ya hecho con anterioridad
                //referencia a la clase principal y la que se va a llamar

                Intent intentReg=new Intent(DatosAlumnos.this,MainActivity.class);
                //inicia el activity Registro
                DatosAlumnos.this.startActivity(intentReg);
            }
        });
        aceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //DatosAlumnos.miEdit1.getText().toString();

                String n=DatosAlumnos.miEdit1.getText().toString();
                String l=DatosAlumnos.miEdit2.getText().toString();
                String b=DatosAlumnos.miEdit3.getText().toString();

                Toast i= Toast.makeText(getBaseContext(),n+"\n"+l+"\n"+b+"\n",Toast.LENGTH_LONG);
                i.setGravity(300,230,900);
                i.show();
            }
        });

    }
}
