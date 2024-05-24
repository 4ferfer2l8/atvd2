package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseAuthInvalidUserException;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    TextView criarnovaconta;
    EditText email, senha;
    Button login;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        auth = ConfiguracaoBD.Fireautenticacao();

        email=findViewById(R.id.email_in);
        senha=findViewById(R.id.senha_in);
        login=findViewById(R.id.login_btn);

        criarnovaconta=findViewById(R.id.criarnovaconta);

        criarnovaconta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, telaregistro.class));
            }
        });



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(email.getText().toString().equals("Admin") && senha.getText().toString().equals("Admin")){
                    Toast.makeText(MainActivity.this, "Login realizado com sucesso!!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, tela3.class));
                }else
                    Toast.makeText(MainActivity.this, "Usuário ou senha incorreto!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}