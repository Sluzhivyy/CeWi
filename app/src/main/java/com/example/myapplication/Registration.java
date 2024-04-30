package com.example.myapplication;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Registration extends AppCompatActivity {

    private EditText editTextNickname, editTextEmail, editTextPassword;
    private Button buttonRegister;

    private static final int REQUEST_IMAGE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        editTextNickname = findViewById(R.id.editTextNickname);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonRegister = findViewById(R.id.buttonRegister);

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextNickname.getText().toString();
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();

                if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
                    // Проверяем, что все поля заполнены
                    Toast.makeText(Registration.this, "Заполните все поля.", Toast.LENGTH_SHORT).show();
                } else {
                    // Создаем Intent для перехода на следующее Activity
                    Intent intent = new Intent(Registration.this, Personal.class);
                    // Передаем данные о пользователе через Intent
                    intent.putExtra("username", username);
                    intent.putExtra("email", email);
                    Toast.makeText(Registration.this, "Регистрация завершена", Toast.LENGTH_SHORT).show();
                    // Запускаем следующее Activity
                    startActivity(intent);
                }
            }
        });
    }
}



