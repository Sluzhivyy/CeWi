package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;



public class MainActivity extends AppCompatActivity {

    Button ToTitle, ToFav, ToBrow,ToReg;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ToTitle = findViewById(R.id.ToTitle);
        ToFav = findViewById(R.id.ToFav);
        ToBrow = findViewById(R.id.ToBrow);
        ToReg = findViewById(R.id.ToReg);


        ToBrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Browser = new Intent(MainActivity.this, Browser.class);
                startActivity(Browser);
            }
        });

        ToFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Personal = new Intent(MainActivity.this, Personal.class);
                startActivity(Personal);
            }
        });

        ToTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Titles = new Intent(MainActivity.this, Titles.class);
                startActivity(Titles);
            }
        });
        ToReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Registration = new Intent(MainActivity.this, Registration.class);
                startActivity(Registration);
            }
        });

        }
    }



