package com.example.aplicacionalcaldia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class graciasPorParticipar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gracias_por_participar);
    }
    public void Principio (View view) {
        Intent principio = new Intent(this, MainActivity.class);
        startActivity(principio);
    }
}