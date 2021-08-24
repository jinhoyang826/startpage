package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class alarmadd extends AppCompatActivity {
    Button cancel3, check;
    Switch For;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_16_alarmadd);

        cancel3=(Button)findViewById(R.id.cancel3);
        cancel3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), alarmlist.class);
                startActivity(intent);
            }
        });

        check=(Button)findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), alarmlist.class);
                startActivity(intent);
            }
        });

        For=(Switch)findViewById(R.id.For);
        For.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Forlist.class);
                startActivity(intent);
            }
        });
    }
}
