package com.example.healthcareapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SetAlarm extends AppCompatActivity {
    EditText ed1,ed2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_alarm);

        ed1 = (EditText) findViewById(R.id.editTextTextPersonName3);
        ed2 = (EditText) findViewById(R.id.editTextTextPersonName4);

        b1 = (Button) findViewById(R.id.button4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int str1 = Integer.parseInt(ed1.getText().toString());
                int str2 = Integer.parseInt(ed2.getText().toString());

                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM);
                intent.putExtra(AlarmClock.EXTRA_HOUR, str1);
                intent.putExtra(AlarmClock.EXTRA_MINUTES, str2);

                if(str1 <= 24 && str2 <= 60)
                {
                    startActivity(intent);
                }

            }
        });
    }
}