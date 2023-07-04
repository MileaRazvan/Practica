package com.example.aplicatiepractica;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class OrasActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orase);

        ImageView imgoras1 = findViewById(R.id.imgoras1);
        ImageView imgoras2 = findViewById(R.id.imgoras2);

        List<Integer> listaOrase = Arrays.asList(
                R.drawable.braila,
                R.drawable.roma,
                R.drawable.constanta,
                R.drawable.sighisoara,
                R.drawable.bergamo,
                R.drawable.timisoara,
                R.drawable.brasov,
                R.drawable.bucuresti,
                R.drawable.galati
        );

        Random random = new Random();
        int RandomIndex1, RandomIndex2;

        do {
            RandomIndex1 = random.nextInt(listaOrase.size()) + 1;
            RandomIndex2 = random.nextInt(listaOrase.size()) + 1;
        } while (RandomIndex1 == RandomIndex2 || RandomIndex1 <= 1 || RandomIndex2 <= 1 || RandomIndex1 >= listaOrase.size() || RandomIndex2 >= listaOrase.size());

        int randomImage1 = listaOrase.get(RandomIndex1);
        int randomImage2 = listaOrase.get(RandomIndex2);
        imgoras1.setImageResource(randomImage1);
        imgoras2.setImageResource(randomImage2);
    }

    public void backbutton (View view){
        onBackPressed();
    }
}