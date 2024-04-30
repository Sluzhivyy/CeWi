package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class Titles extends AppCompatActivity {

    Button Titles ,ToWarhammer40K, ToScpFoundation, ToStarcraft,ToSTALKER;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.titles);
        Titles = (Button) findViewById(R.id.TitleToMain);
        Titles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MainActivity = new Intent(Titles.this, MainActivity.class);
                startActivity(MainActivity);
            }
        });
        ToWarhammer40K = findViewById(R.id.ToWarhammer40K);
        ToWarhammer40K.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Warhammer = new Intent(Titles.this, Warhammer40K.class);
                startActivity(Warhammer);
            }
        });
        ToScpFoundation = findViewById(R.id.ToScpFoundation);
        ToScpFoundation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SCP = new Intent(Titles.this, Scp.class);
                startActivity(SCP);
            }
        });
        ToSTALKER = findViewById(R.id.ToSTALKER);
        ToSTALKER.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent STALKER = new Intent(Titles.this, STALKER.class);
                startActivity(STALKER);
            }
        });
        ToStarcraft = findViewById(R.id.ToStarcraft);
        ToStarcraft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent StarCraft = new Intent(Titles.this, StarCraft.class);
                startActivity(StarCraft);
            }
        });



    }

}