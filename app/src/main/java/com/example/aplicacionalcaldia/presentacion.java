package com.example.aplicacionalcaldia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class presentacion extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener, YouTubePlayer.PlaybackEventListener {

    String claveYoutube="AIzaSyC5Us92_GvKUeOgCCxXvGDjat9ddDAhlJQ";
    YouTubePlayerView youTubePlayerView;
    private TextView tvPersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presentacion);

        youTubePlayerView= findViewById(R.id.youTubePlayerView);
        youTubePlayerView.initialize(claveYoutube,this);






        tvPersona=findViewById(R.id.tvPersona);

        String nombre = getIntent().getStringExtra("nombre");
        tvPersona.setText("¡Bienvenido " + nombre+"!");
    }
    public void Volver (View view){
        Intent volver = new Intent(this, MainActivity.class);
        startActivity(volver);
    }
    public void Form (View view){
        Intent siguiente = new Intent(this, graciasPorParticipar.class);
        startActivity(siguiente);
    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean fueRestaurado) {
    if(!fueRestaurado){
        youTubePlayer.cueVideo("dL4LwtSCV80");
    }

    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

        if(youTubeInitializationResult.isUserRecoverableError()){
            youTubeInitializationResult.getErrorDialog(this,1).show();
        }else{
            String error= "Error al inicializar Youtube"+ youTubeInitializationResult.toString();

            Toast.makeText(getApplication(),error,Toast.LENGTH_LONG).show();
        }

    }
    protected void onActivityResult(int requestCode,int resultCode, Intent data){
        if(requestCode==1){
            getYoutubePlayerProvider().initialize(claveYoutube,this);
        }
    }

    protected YouTubePlayer.Provider getYoutubePlayerProvider(){
        return youTubePlayerView;
    }

    @Override
    public void onPlaying() {

    }

    @Override
    public void onPaused() {

    }

    @Override
    public void onStopped() {

    }

    @Override
    public void onBuffering(boolean b) {

    }

    @Override
    public void onSeekTo(int i) {

    }
}