package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


public class Personal extends AppCompatActivity {


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personal);
        Button PersToMain = findViewById(R.id.PersToMain);
        EditText nicknameResult = findViewById(R.id.NicknameResult);
        EditText emailResult = findViewById(R.id.EmailResult);
        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
        String email = intent.getStringExtra("email");

        if (username != null) {
            nicknameResult.setText(username);
        }

        if (email != null) {
            emailResult.setText(email);
        }

        PersToMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Main = new Intent(Personal.this, MainActivity.class);
                startActivity(Main);
            }
        });
    }
}

