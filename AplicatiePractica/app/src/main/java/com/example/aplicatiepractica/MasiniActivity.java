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


public class MasiniActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masini);


        ImageView imgmas1 = findViewById(R.id.imgmas1);
        imgmas1.setScaleType(ImageView.ScaleType.FIT_XY);
        ImageView imgmas2 = findViewById(R.id.imgmas2);
        imgmas2.setScaleType(ImageView.ScaleType.FIT_XY);

        List<Integer> listaMasini = Arrays.asList(
                R.drawable.bmw,
                R.drawable.eos,
                R.drawable.fiat,
                R.drawable.ford,
                R.drawable.honda,
                R.drawable.lamborghini,
                R.drawable.mercedes,
                R.drawable.nissan,
                R.drawable.porche,
                R.drawable.tesla,
                R.drawable.toyota
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



        Button alegM1 = findViewById(R.id.alegM1);
        alegM1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent10 = new Intent(MasiniActivity.this, MasiniActivity.class);
                startActivity(intent10);
            }
        });

        Button alegM2 = findViewById(R.id.alegM2);
        alegM2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent11 = new Intent(MasiniActivity.this, MasiniActivity.class);
                startActivity(intent11);
            }
        });

        Button inapoi = findViewById(R.id.inapoi);
        inapoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12 = new Intent(MasiniActivity.this, MainActivity.class);
                intent12.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent12);
                finish();
            }
        });
    }


}