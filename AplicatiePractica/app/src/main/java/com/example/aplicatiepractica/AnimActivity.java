package com.example.aplicatiepractica;
import androidx.appcompat.app.AppCompatActivity;

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


public class AnimActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animale);

        ImageView imganim1 = findViewById(R.id.imganim1);
        imganim1.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imganim2 = findViewById(R.id.imganim2);
        imganim2.setScaleType(ImageView.ScaleType.FIT_XY);

        List<Integer> lista = Arrays.asList(
                R.drawable.alpaca,
                R.drawable.caine,
                R.drawable.capybara,
                R.drawable.delfin,
                R.drawable.kuoka,
                R.drawable.panda,
                R.drawable.pisic,
                R.drawable.veverita,
                R.drawable.vulpe,
                R.drawable.vidra
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


        Button alegA1 = findViewById(R.id.alegA1);
        alegA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(AnimActivity.this, AnimActivity.class);
                startActivity(intent7);
            }
        });

        Button alegA2 = findViewById(R.id.alegA2);
        alegA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent8 = new Intent(AnimActivity.this, AnimActivity.class);
                startActivity(intent8);
            }
        });

        Button inapoiAn = findViewById(R.id.inapoiAn);
        inapoiAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9 = new Intent(AnimActivity.this, MainActivity.class);
                intent9.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent9);
                finish();
            }
        });

        }


    }


