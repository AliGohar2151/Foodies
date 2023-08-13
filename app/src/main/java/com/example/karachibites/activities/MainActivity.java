package com.example.karachibites.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.karachibites.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CircleImageView imageView = findViewById(R.id.logo);
        TextView textView = findViewById(R.id.titletext);
        ProgressBar progressBar=findViewById(R.id.progressBar);
        TextView textView1 =findViewById(R.id.textView1);


        Animation imageViewAnimation = AnimationUtils.loadAnimation(this, R.anim.scaleup);
        Animation textViewAnimation = AnimationUtils.loadAnimation(this, R.anim.scaleup);
        imageView.startAnimation(imageViewAnimation);

        textView.setVisibility(View.GONE);
        progressBar.setVisibility(View.GONE);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                progressBar.setVisibility(View.VISIBLE);
            }
        },1000);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                textView.setVisibility(View.VISIBLE);
                textView.startAnimation(textViewAnimation);
            }
        },1300);



        boolean handler=new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(getApplicationContext(), HomeActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);
                
        
        
    }
}