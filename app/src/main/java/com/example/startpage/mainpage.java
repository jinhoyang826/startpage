package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mainpage extends AppCompatActivity {
    ImageButton rvise;
    ImageButton selfbutton,bodybutton,kcalbutton,alambutton,runningbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10_mainpage);


        rvise=(ImageButton)findViewById(R.id.rvise);
        rvise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), rvise.class);
                startActivity(intent);
            }
        });

        selfbutton=(ImageButton)findViewById(R.id.selfbutton);
        selfbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), selfcheck.class);
                startActivity(intent);
            }
        });

        bodybutton=(ImageButton)findViewById(R.id.bodybutton);
        bodybutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), exercise.class);
                startActivity(intent);
            }
        });


        alambutton=(ImageButton)findViewById(R.id.alambutton);
        alambutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), alarmlist.class);
                startActivity(intent);
            }
        });

        runningbutton=(ImageButton)findViewById(R.id.runningbutton);
        runningbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), running.class);
                startActivity(intent);
            }
        });
    }
}
