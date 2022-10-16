package com.example.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainDashboard extends AppCompatActivity {

    ImageView m2,m3,m4,m5,m6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_dashboard);

        m2 = (ImageView) findViewById(R.id.mg2);
        m3 = (ImageView) findViewById(R.id.mg3);
        m4 = (ImageView) findViewById(R.id.mg4);
        m5 = (ImageView) findViewById(R.id.mg5);
        m6 = (ImageView) findViewById(R.id.mg6);


        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Nutritionists.class);
                startActivity(i1);
            }
        });

        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), Dietitian.class);
                startActivity(i1);

            }
        });

        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), FitnessCentre.class);
                startActivity(i1);

            }
        });

        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), DietChart.class);
                startActivity(i1);

            }
        });

        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1 = new Intent(getApplicationContext(), MeasureFood.class);
                startActivity(i1);

            }
        });
    }
}