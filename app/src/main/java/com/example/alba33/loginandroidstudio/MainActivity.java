package com.example.alba33.loginandroidstudio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.etUsername);
        password = (EditText)findViewById(R.id.etPassword);
        login = (Button)findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nUser = username.getText().toString();
                String nPassword = password.getText().toString();

                if (nUser.isEmpty()){
                    username.setError("Username Tidak Boleh Kosong");
                    username.requestFocus();
                }else if (nPassword.isEmpty()){
                    password.setError("Password Tidak Boleh Kosong");
                    password.requestFocus();
                } else {
                    if (nUser.equalsIgnoreCase("AlBa") && nPassword.equalsIgnoreCase("Persib")){
                        startActivity(new Intent(MainActivity.this, ActivitySucces.class));
                        finish();
                    }else {
                        Toast.makeText(getApplicationContext(), "Try to Enter Again", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
