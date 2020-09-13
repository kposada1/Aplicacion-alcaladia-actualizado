package com.example.aplicacionalcaldia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText etNombrePersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNombrePersona= findViewById(R.id.etNombrePersona);
    }
    public void Presentacion (View view){
        Intent siguiente = new Intent(this, presentacion.class);
        siguiente.putExtra("nombre", etNombrePersona.getText().toString());
        startActivity(siguiente);
    }
}