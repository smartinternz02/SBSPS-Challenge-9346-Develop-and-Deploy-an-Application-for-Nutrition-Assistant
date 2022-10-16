package com.example.healthcareapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {

    EditText ed1,ed2;
    TextView textView;
    Button b1;
    DatabaseReference databaseReference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textView = (TextView) findViewById(R.id.txt2);

        ed1 = (EditText) findViewById(R.id.editTextTextPersonName2);
        ed2 = (EditText) findViewById(R.id.editTextTextPassword2);

        b1 = (Button) findViewById(R.id.button2);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getApplicationContext(), MainDashboard.class);
                //startActivity(intent);
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String s1 = ed1.getText().toString();
                String s2 = ed2.getText().toString();
                databaseReference = FirebaseDatabase.getInstance().getReference().child("users").child(s1);
                databaseReference.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot snapshot) {
                        String getname = snapshot.child("name").getValue().toString();
                        String getpass = snapshot.child("password").getValue().toString();

                        if(s1.equals(getname) && s2.equals(getpass))
                        {
                            Toast.makeText(Login.this, "Login Successful", Toast.LENGTH_SHORT).show();
                            Intent intent = new Intent(getApplicationContext(), MainDashboard.class);
                            startActivity(intent);
                        }

                        else
                        {
                            Toast.makeText(Login.this, "Error", Toast.LENGTH_SHORT).show();
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError error) {

                    }
                });
            }
        });
    }
}