package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class selfcheckadd extends AppCompatActivity {
    Button cancel,check;
    ImageButton plus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_22_selfcheckadd);

        cancel=(Button)findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), selfcheck.class);
                startActivity(intent);
            }
        });

        check=(Button)findViewById(R.id.check);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), selfcheck.class);
                startActivity(intent);
            }
        });
    }
}
