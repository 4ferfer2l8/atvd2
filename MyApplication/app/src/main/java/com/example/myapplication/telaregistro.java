package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class telaregistro extends AppCompatActivity {

    Button cadastrar;
    EditText nome, email, senha;
    TextView jatemconta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        cadastrar = findViewById(R.id.login_btn);
        nome = findViewById(R.id.nome_in);
        email = findViewById(R.id.email_in);
        senha = findViewById(R.id.senha_in);

        jatemconta=findViewById(R.id.jatemconta);

        jatemconta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(telaregistro.this, MainActivity.class));
            }
        });

        cadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(telaregistro.this, tela3.class));
            }
        });
    }
}