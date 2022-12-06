package com.dam.apprendrefraais;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {
    private static final String TAG = "MainActivity2";
    private int nbAleatoire;
    private String tag, tagAttendu;
    int s = 0;


    private void generateRandomNumber() {
        Random rand = new Random();
        nbAleatoire = rand.nextInt(2) + 1;
    }

    public void gestionDuClic(View view) {
        ImageView imageViewPresse = (ImageView) view;
        tag = imageViewPresse.getTag().toString();
    }

    public void myRandom() {
        for (int i = 1; i <= 10; i++) {
            generateRandomNumber();
            Log.i(TAG, "myRandom: " + i + " " + nbAleatoire);
            // Lecture du texte en fonction du chiffre random
            switch (nbAleatoire) {
                case 1:
                    // Lancer la lecture du morceau a.mp3
                    tagAttendu = "a";// Tag attendu
                    break;
                case 2:
                    // Lancer la lecture du morceau b.mp3
                    tagAttendu = "b";// Tag attendu
                    break;

                // Ajouter les 24 autres lettres ...

            }

            if(tag.equals(tagAttendu)){
                s=s+1; // ou s++
                Log.i(TAG, "myRandom: " + s);
            }
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myRandom();
    }


}