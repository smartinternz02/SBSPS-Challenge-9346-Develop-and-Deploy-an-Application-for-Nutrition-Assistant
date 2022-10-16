package com.example.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import java.util.ArrayList;

public class DietPlan extends AppCompatActivity {

    GridView coursesGV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet_plan);

        coursesGV = findViewById(R.id.idGVcourses1);
        ArrayList<CourseModel1> courseModelArrayList = new ArrayList<CourseModel1>();

        // this is only for remembering purpose
        
        courseModelArrayList.add(new CourseModel1("Breakfast", R.drawable.breakfast));
        courseModelArrayList.add(new CourseModel1("Lunch", R.drawable.lunch));
        courseModelArrayList.add(new CourseModel1("Evening Snack", R.drawable.evening));
        courseModelArrayList.add(new CourseModel1("Dinner", R.drawable.dinner));

        CoursesGVAdapter1 adapter = new CoursesGVAdapter1(this, courseModelArrayList);
        coursesGV.setAdapter(adapter);
    }
}