package com.example.aplicacionalcaldia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.TextView;

public class formulario extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    EditText etNombres, etApellidos, etNumDoc, etEdad, etEmail, etTelefonoFijo, etCelular, etComuna, etMunicipio, etDepartamento, etFechaDeNaciemiento, etnumPersonas, etNumeroDeHijos, etCajaDeCompensacion, etOcupacion, etEmpleoActual;
    RadioButton rbHombre, rbMujer, rbOtro, rbCiudadania, rbPermisoespecialdepermanencia, rbInternetSi, rbInternetNo, rbSinEmpleoSi, rbSinEmpleoNo, rbBuscandoEmpleoNo, rbBuscandoEmpleoSi, rbCensatiasPensionesSi, rbCensatiasPensionesNo, rbSubsidioAlcaldiaSi, rbSubsidioAlcaldiaNo;
    CheckBox cbTerminosCondiciones, cbPoliticaPrivacidad;
    Button btnProcesarInformacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        ((SeekBar)findViewById(R.id.seekBar)).setOnSeekBarChangeListener(this);

        etNombres=(EditText)findViewById(R.id.etNombres);
        etApellidos=(EditText)findViewById(R.id.etApellidos);
        etNumDoc=(EditText)findViewById(R.id.etNumDoc);
        etEdad=(EditText)findViewById(R.id.etEdad);
        etEmail=(EditText)findViewById(R.id.etEmail);
        etTelefonoFijo=(EditText)findViewById(R.id.etTelefonoFijo);
        etCelular=(EditText)findViewById(R.id.etCelular);
        etComuna=(EditText)findViewById(R.id.etComuna);
        etMunicipio=(EditText)findViewById(R.id.etMunicipio);
        etDepartamento=(EditText)findViewById(R.id.etDepartamento);
        etFechaDeNaciemiento=(EditText)findViewById(R.id.etFechaDeNaciemiento);
        etnumPersonas=(EditText)findViewById(R.id.etnumPersonas);
        etNumeroDeHijos=(EditText)findViewById(R.id.etNumeroDeHijos);
        etCajaDeCompensacion=(EditText)findViewById(R.id.etCajaDeCompensacion);
        etOcupacion=(EditText)findViewById(R.id.etOcupacion);
        etEmpleoActual=(EditText)findViewById(R.id.etEmpleoActual);
        rbHombre=(RadioButton)findViewById(R.id.rbHombre);
        rbMujer=(RadioButton)findViewById(R.id.rbMujer);
        rbOtro=(RadioButton)findViewById(R.id.rbOtro);
        rbCiudadania=(RadioButton)findViewById(R.id.rbCiudadania);
        rbPermisoespecialdepermanencia=(RadioButton)findViewById(R.id.rbPermisoespecialdepermanencia);
        rbInternetSi=(RadioButton)findViewById(R.id.rbInternetSi);
        rbInternetNo=(RadioButton)findViewById(R.id.rbInternetNo);
        rbSinEmpleoSi=(RadioButton)findViewById(R.id.rbSinEmpleoSi);
        rbSinEmpleoNo=(RadioButton)findViewById(R.id.rbSinEmpleoNo);
        rbBuscandoEmpleoNo=(RadioButton)findViewById(R.id.rbBuscandoEmpleoNo);
        rbBuscandoEmpleoSi=(RadioButton)findViewById(R.id.rbBuscandoEmpleoSi);
        rbCensatiasPensionesSi=(RadioButton)findViewById(R.id.rbCensatiasPensionesSi);
        rbCensatiasPensionesNo=(RadioButton)findViewById(R.id.rbCensatiasPensionesNo);
        rbSubsidioAlcaldiaSi=(RadioButton)findViewById(R.id.rbSubsidioAlcaldiaSi);
        rbSubsidioAlcaldiaNo=(RadioButton)findViewById(R.id.rbSubsidioAlcaldiaNo);
        cbTerminosCondiciones=(CheckBox)findViewById(R.id.cbTerminosCondiciones);
        cbPoliticaPrivacidad=(CheckBox)findViewById(R.id.cbPoliticaPrivacidad);
        btnProcesarInformacion=(Button)findViewById(R.id.btnProcesarInformacion);


    }

    public void Seguir (View view) {
        Intent principio = new Intent(this,graciasPorParticipar.class);
        startActivity(principio);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
        ((TextView)findViewById(R.id.tvCantidad)).setText("Cantidad " + i);

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}