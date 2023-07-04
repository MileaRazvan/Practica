package com.example.aplicatiepractica;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button Anim = findViewById(R.id.Anim);
        Anim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AnimActivity.class);
                startActivity(intent);
            }
        });



        Button Cars = findViewById(R.id.Cars);
        Cars.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, MasiniActivity.class);
                startActivity(intent2);
            }
        });


        Button City = findViewById(R.id.City);
        City.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this, OrasActivity.class);
                startActivity(intent3);
            }
        });
    }


    public void animale (View view){
        setContentView(R.layout.animale);
    }

    public void orase (View view){setContentView(R.layout.orase);}

    public void masini (View view){setContentView(R.layout.masini);}


}