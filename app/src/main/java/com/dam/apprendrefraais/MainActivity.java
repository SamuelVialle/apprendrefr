package com.dam.apprendrefraais;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialisation du bouton
        Button button = findViewById(R.id.btnTest);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }

    public void playLetter(View view) {
        ImageView imageViewPresse = (ImageView) view;
        String tag = imageViewPresse.getTag().toString();

        MediaPlayer mediaPlayer = MediaPlayer.create(this,
                getResources().getIdentifier(tag, "raw", getPackageName()));
        mediaPlayer.start();
    }
}