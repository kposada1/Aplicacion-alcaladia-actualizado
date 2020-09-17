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
import android.widget.Toast;
import android.widget.VideoView;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class formulario extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    EditText etNombres, etApellidos, etNumDoc, etEdad, etEmail, etTelefonoFijo, etCelular, etComuna, etCiudad, etDepartamento, etFechaDeNaciemiento, etnumPersonas, etNumeroDeHijos, etDireccion, etOcupacion, etEmpleoActual;
    RadioButton rbDispositivoSi,rbDispositivoNo ,rbHombre, rbMujer, rbOtro, rbCiudadania, rbInternetSi, rbInternetNo, rbSinEmpleoSi, rbSinEmpleoNo, rbBuscandoEmpleoNo, rbBuscandoEmpleoSi, rbCensatiasPensionesSi, rbCensatiasPensionesNo, rbSubsidioAlcaldiaSi, rbSubsidioAlcaldiaNo, rbEstrato1, rbEstrato2, rbEstrato3, rbEstrato4, rbEstrato5, rbEstrato6;
    CheckBox cbTerminosCondiciones, cbPoliticaPrivacidad;
    SeekBar seekBar;
    Button btnProcesarInformacion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        ((SeekBar)findViewById(R.id.seekBar)).setOnSeekBarChangeListener(this);

        etNombres=(EditText)findViewById(R.id.etNombres);
        etApellidos=(EditText)findViewById(R.id.etApellidos);
        //tipodoc
        rbCiudadania=(RadioButton)findViewById(R.id.rbCiudadania);
        rbOtro=(RadioButton)findViewById(R.id.rbOtro);
        etEdad=(EditText)findViewById(R.id.etEdad);
        etNumDoc=(EditText)findViewById(R.id.etNumDoc);
        //genero
        rbHombre=(RadioButton)findViewById(R.id.rbHombre);
        rbMujer=(RadioButton)findViewById(R.id.rbMujer);
        rbOtro=(RadioButton)findViewById(R.id.rbOtro);
        etFechaDeNaciemiento=(EditText)findViewById(R.id.etFechaDeNaciemiento);
        //estrato
        rbEstrato1=(RadioButton)findViewById(R.id.rbEstrato1);
        rbEstrato2=(RadioButton)findViewById(R.id.rbEstrato2);
        rbEstrato3=(RadioButton)findViewById(R.id.rbEstrato3);
        rbEstrato4=(RadioButton)findViewById(R.id.rbEstrato4);
        rbEstrato5=(RadioButton)findViewById(R.id.rbEstrato5);
        rbEstrato6=(RadioButton)findViewById(R.id.rbEstrato6);
        etTelefonoFijo=(EditText)findViewById(R.id.etTelefonoFijo);
        etCelular=(EditText)findViewById(R.id.etCelular);
        etCiudad=(EditText)findViewById(R.id.etCiudad);
        etDepartamento=(EditText)findViewById(R.id.etDepartamento);
        etnumPersonas=(EditText)findViewById(R.id.etnumPersonas);
        etNumeroDeHijos=(EditText)findViewById(R.id.etNumeroDeHijos);
        //computador
        rbInternetSi=(RadioButton)findViewById(R.id.rbInternetSi);
        rbInternetNo=(RadioButton)findViewById(R.id.rbInternetNo);
        //conexioninternet
        rbDispositivoSi=(RadioButton)findViewById(R.id.rbBuscandoEmpleoSi);
        rbDispositivoNo=(RadioButton)findViewById(R.id.rbBuscandoEmpleoNo);
        //direccion
        etDireccion=(EditText)findViewById(R.id.etDireccion);
        etComuna=(EditText)findViewById(R.id.etComuna);
        etEmail=(EditText)findViewById(R.id.etEmail);
        etOcupacion=(EditText)findViewById(R.id.etOcupacion);
        //tieneempleo
        etEmpleoActual=(EditText)findViewById(R.id.etEmpleoActual);
        //quedosinempleo
        rbSinEmpleoSi=(RadioButton)findViewById(R.id.rbSinEmpleoSi);
        rbSinEmpleoNo=(RadioButton)findViewById(R.id.rbSinEmpleoNo);
        //buscaempleo
        rbBuscandoEmpleoNo=(RadioButton)findViewById(R.id.rbBuscandoEmpleoNo);
        rbBuscandoEmpleoSi=(RadioButton)findViewById(R.id.rbBuscandoEmpleoSi);
        //beneficiosubcidio
        rbSubsidioAlcaldiaSi=(RadioButton)findViewById(R.id.rbSubsidioAlcaldiaSi);
        rbSubsidioAlcaldiaNo=(RadioButton)findViewById(R.id.rbSubsidioAlcaldiaNo);
        //registrocesantias
        rbCensatiasPensionesSi=(RadioButton)findViewById(R.id.rbCensatiasPensionesSi);
        rbCensatiasPensionesNo=(RadioButton)findViewById(R.id.rbCensatiasPensionesNo);
        //afectopandemia
        seekBar=(SeekBar)findViewById(R.id.seekBar);

        //checkbox
        cbTerminosCondiciones=(CheckBox)findViewById(R.id.cbTerminosCondiciones);
        cbPoliticaPrivacidad=(CheckBox)findViewById(R.id.cbPoliticaPrivacidad);

        //boton
        btnProcesarInformacion=(Button)findViewById(R.id.btnProcesarInformacion);



    }

    public  void ejecutarServicio(String URL){
        StringRequest stringRequest=new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "Operacion Exitosa!", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), "Operacion Exitosa!", Toast.LENGTH_SHORT).show();
            }
        }){
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros=new HashMap<String, String>();
                parametros.put("nombre",etNombres.getText().toString());
                parametros.put("apellido",etApellidos.getText().toString());
                parametros.put("tipodoc",rbCiudadania.getText().toString());
                parametros.put("tipodoc",rbOtro.getText().toString());
                parametros.put("edad",etEdad.getText().toString());
                parametros.put("numdoc",etNumDoc.getText().toString());
                parametros.put("genero",rbHombre.getText().toString());
                parametros.put("genero",rbMujer.getText().toString());
                parametros.put("genero",rbOtro.getText().toString());
                parametros.put("fechanacimiento",etFechaDeNaciemiento.getText().toString());
                parametros.put("estrato",rbEstrato1.getText().toString());
                parametros.put("estrato",rbEstrato2.getText().toString());
                parametros.put("estrato",rbEstrato3.getText().toString());
                parametros.put("estrato",rbEstrato4.getText().toString());
                parametros.put("estrato",rbEstrato5.getText().toString());
                parametros.put("estrato",rbEstrato6.getText().toString());
                parametros.put("telefono",etTelefonoFijo.getText().toString());
                parametros.put("celular",etCelular.getText().toString());
                parametros.put("ciudad",etCiudad.getText().toString());
                parametros.put("departamento",etDepartamento.getText().toString());
                parametros.put("personasconquevive",etnumPersonas.getText().toString());
                parametros.put("numhijos",etNumeroDeHijos.getText().toString());
                parametros.put("computador",rbInternetSi.getText().toString());
                parametros.put("computador",rbInternetNo.getText().toString());
                parametros.put("conexioninternet",rbDispositivoSi.getText().toString());
                parametros.put("conexioninternet",rbDispositivoNo.getText().toString());
                parametros.put("direccion",etDireccion.getText().toString());
                parametros.put("comuna",etComuna.getText().toString());
                parametros.put("correo",etEmail.getText().toString());
                parametros.put("ocupacion",etOcupacion.getText().toString());
                parametros.put("tieneempleo",etEmpleoActual.getText().toString());
                parametros.put("quedosinempleo",rbSinEmpleoSi.getText().toString());
                parametros.put("quedosinempleo",rbSinEmpleoNo.getText().toString());
                parametros.put("buscaempleo",rbBuscandoEmpleoNo.getText().toString());
                parametros.put("buscaempleo",rbBuscandoEmpleoSi.getText().toString());
                parametros.put("beneficiadosubsidio",rbSubsidioAlcaldiaNo.getText().toString());
                parametros.put("beneficiadosubsidio",rbBuscandoEmpleoSi.getText().toString());
                parametros.put("registrocesantias",rbCensatiasPensionesNo.getText().toString());
                parametros.put("registrocesantias",rbCensatiasPensionesSi.getText().toString());
                return parametros;
            }
        };
        RequestQueue requestQueue= Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);

    }

    public void Seguir (View view) {
        Intent principio = new Intent(this,graciasPorParticipar.class);
        startActivity(principio);
        Toast.makeText(getApplicationContext(), "Operacion Exitosa!", Toast.LENGTH_SHORT).show();
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