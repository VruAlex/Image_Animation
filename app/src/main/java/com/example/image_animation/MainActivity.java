package com.example.image_animation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView load = findViewById(R.id.image);
        animationDrawable = (AnimationDrawable) load.getDrawable();

        //Start animation
        Button start = findViewById(R.id.One);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                animationDrawable.start();
                load.setVisibility(View.VISIBLE);
            }
        });

        //Start animation
        Button cancel = findViewById(R.id.Two);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                load.setVisibility(View.GONE);
            }
        });



    }
}
