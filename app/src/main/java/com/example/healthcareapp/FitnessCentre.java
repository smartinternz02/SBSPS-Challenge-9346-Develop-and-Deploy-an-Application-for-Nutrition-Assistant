package com.example.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class FitnessCentre extends AppCompatActivity {

    GridView coursesGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness_centre);

        coursesGV = findViewById(R.id.idGVcourses);
        ArrayList<CourseModel> courseModelArrayList = new ArrayList<CourseModel>();

        courseModelArrayList.add(new CourseModel("Chasing Aesthetic", R.drawable.center1));
        courseModelArrayList.add(new CourseModel("FitFat Studio", R.drawable.center2));
        courseModelArrayList.add(new CourseModel("Metro Fit Fitness Factory", R.drawable.center3));
        courseModelArrayList.add(new CourseModel("Black Sheep", R.drawable.center4));
        courseModelArrayList.add(new CourseModel("Gotham Gym", R.drawable.center5));
        courseModelArrayList.add(new CourseModel("FLEX Studios", R.drawable.center6));
        courseModelArrayList.add(new CourseModel("Blue Muscles", R.drawable.center7));
        courseModelArrayList.add(new CourseModel("BFS Gym", R.drawable.center8));

        CourseGVAdapter adapter = new CourseGVAdapter(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}