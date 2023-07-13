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


public class TopActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.top);


        Button topA = findViewById(R.id.topA);
        topA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }

            });
        Button back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        ImageView top1 = findViewById(R.id.top1);
        top1.setScaleType(ImageView.ScaleType.FIT_XY);
        top1.setImageResource(R.drawable.capybara);
        ImageView top2 = findViewById(R.id.top2);
        top2.setScaleType(ImageView.ScaleType.FIT_XY);
        top2.setImageResource(R.drawable.vidra);
        ImageView top3 = findViewById(R.id.top3);
        top3.setScaleType(ImageView.ScaleType.FIT_XY);
        top3.setImageResource(R.drawable.caine);
    }
}