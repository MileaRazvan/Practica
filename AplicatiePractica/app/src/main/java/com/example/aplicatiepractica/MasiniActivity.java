package com.example.aplicatiepractica;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class MasiniActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masini);
    }

    public void backbutton (View view){
        onBackPressed();
    }

}