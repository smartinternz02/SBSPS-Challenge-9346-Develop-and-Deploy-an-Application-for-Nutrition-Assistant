package com.example.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Dietitian extends AppCompatActivity {

    ListView list;
    //SearchView searchView;
    String[] maintitle ={
            "Rujuta Diwekar","Nidhi Mohan Kamal",
            "Mahima Sethia","Roshni Sanghvi",
            "Mansi Padechia",
    };

    String[] subtitle ={
            "She is also a best-selling author and the country’s foremost speaker on health and wellness. ",
            "She is the director of NidSun Weight Loss, a chain of weight loss clinics with its branches in Delhi, Chandigarh, and Panchkula. ",
            "Mahima Sethia is the Founder and Managing Director at FitnessFlu. Her aim is to transform her clients’ life and health by making workouts and clean eating a part of their lifestyle.",
            "She also is a plant-based sports nutritionist and the first Indian vegan bikini athlete. ",
            "She believes that a good meal plan does more than just help you lose weight. It’s the foundation of a healthy lifestyle that will keep you fit.",
    };

    Integer[] imgid={
            R.drawable.doctor,
            R.drawable.doctor,
            R.drawable.doctor,
            R.drawable.doctor,
            R.drawable.doctor

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dietitian);

        MyListAdapter1 adapter=new MyListAdapter1(this, maintitle, subtitle,imgid);
        list=(ListView) findViewById(R.id.list1);
        //searchView = (SearchView) findViewById(R.id.searchView);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
    }
}