package com.example.controlaccess2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Pantalla2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantalla2);
    }

    public void onclick(View view) {
        Intent miIntent=null;
        switch (view.getId()){

            case R.id.btnLecturaDatos:
                 miIntent= new Intent(Pantalla2.this, PantallaMostrar.class);
                startActivity(miIntent);
            break;
            case R.id.btnEnviarTag:
                miIntent= new Intent(Pantalla2.this,PantallaEscrituta.class);
                startActivity(miIntent);
                break;

            case R.id.btnInscritos:
                miIntent= new Intent(Pantalla2.this,ListaUsuarioActivity.class);
                startActivity(miIntent);
                break;
            case  R.id.btnSalir:
                finish();
                break;
        }

    }
}