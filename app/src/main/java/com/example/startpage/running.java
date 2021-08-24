package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class running extends AppCompatActivity {
    ImageButton kmbutton,metsbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_18_running);

        kmbutton =(ImageButton)findViewById(R.id.kmbutton);
        kmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), running_dm.class);
                startActivity(intent);
            }
        });

        metsbutton =(ImageButton)findViewById(R.id.metsbutton);
        metsbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), running_mets.class);
                startActivity(intent);
            }
        });

    }
}
