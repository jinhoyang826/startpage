package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button singup, idserch, pwdserch, login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_05_main);

        singup = (Button) findViewById(R.id.singup);
        singup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), personalinformation.class);
                startActivity(intent);
            }
        });

        idserch=(Button)findViewById(R.id.idserch);
        idserch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), idserch.class);
                startActivity(intent);
            }
        });
        pwdserch=(Button)findViewById(R.id.pwdserch);
        pwdserch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), pwdserch.class);
                startActivity(intent);
            }
        });

        login=(Button)findViewById(R.id.login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mainpage.class);
                startActivity(intent);
            }
        });


    }
}
