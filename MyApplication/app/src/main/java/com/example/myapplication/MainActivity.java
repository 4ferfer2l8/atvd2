package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView email = (TextView) findViewById(R.id.email_in);
        TextView senha = (TextView) findViewById(R.id.senha_in);
        Button loginbtn = (Button) findViewById(R.id.login_btn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("Admin") && senha.getText().toString().equals("Admin")){
                    Toast.makeText(MainActivity.this, "Login realizado com sucesso!!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, tela2.class));
                }else
                    Toast.makeText(MainActivity.this, "Usuário ou senha incorreto!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}