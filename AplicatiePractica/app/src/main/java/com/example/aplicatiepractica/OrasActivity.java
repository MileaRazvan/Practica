package com.example.aplicatiepractica;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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
        imgoras1.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imgoras2 = findViewById(R.id.imgoras2);
        imgoras2.setScaleType(ImageView.ScaleType.FIT_XY);

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



        Button aleg1 = findViewById(R.id.aleg1);
        aleg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(OrasActivity.this, OrasActivity.class);
                startActivity(intent4);
            }
        });

        Button aleg2 = findViewById(R.id.aleg2);
        aleg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(OrasActivity.this, OrasActivity.class);
                startActivity(intent5);
            }
        });

        Button inapoiOr = findViewById(R.id.inapoiOr);
        inapoiOr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(OrasActivity.this, MainActivity.class);
                intent6.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent6);
                finish();
            }
        });


    }




}