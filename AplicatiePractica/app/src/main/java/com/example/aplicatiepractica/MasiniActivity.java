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


public class MasiniActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masini);


        ImageView imgmas1 = findViewById(R.id.imgmas1);
        ImageView imgmas2 = findViewById(R.id.imgmas2);

        List<Integer> listaMasini = Arrays.asList(
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
            RandomIndex1 = random.nextInt(listaMasini.size()) + 1;
            RandomIndex2 = random.nextInt(listaMasini.size()) + 1;
        } while (RandomIndex1 == RandomIndex2 || RandomIndex1 <= 1 || RandomIndex2 <= 1 || RandomIndex1 >= listaMasini.size() || RandomIndex2 >= listaMasini.size());

        int randomImage1 = listaMasini.get(RandomIndex1);
        int randomImage2 = listaMasini.get(RandomIndex2);
        imgmas1.setImageResource(randomImage1);
        imgmas2.setImageResource(randomImage2);
    }

    public void backbutton (View view){
        onBackPressed();
    }

}