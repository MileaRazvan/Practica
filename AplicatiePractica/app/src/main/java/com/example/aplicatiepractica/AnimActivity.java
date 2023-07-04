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


public class AnimActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animale);

        ImageView imganim1 = findViewById(R.id.imganim1);
        ImageView imganim2 = findViewById(R.id.imganim2);
        List<Integer> lista = Arrays.asList(
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
            RandomIndex1 = random.nextInt(lista.size()) + 1;
            RandomIndex2 = random.nextInt(lista.size()) + 1;
        } while (RandomIndex1 == RandomIndex2 || RandomIndex1 <= 1 || RandomIndex2 <= 1 || RandomIndex1 >= lista.size() || RandomIndex2 >= lista.size());

            int randomImage1 = lista.get(RandomIndex1);
            int randomImage2 = lista.get(RandomIndex2);
            imganim1.setImageResource(randomImage1);
            imganim2.setImageResource(randomImage2);


        }
        public void backbutton (View view){
            onBackPressed();
        }
    }


