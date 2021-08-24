package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rvise extends AppCompatActivity {
    Button rvisecompelete,withdrawal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_11_rvise);

        rvisecompelete=(Button)findViewById(R.id.rvisecompelete);
        rvisecompelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mainpage.class);
                startActivity(intent);
            }
        });

        withdrawal=(Button)findViewById(R.id.withdrawal);
        withdrawal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), withdrawalcheck.class);
                startActivity(intent);
            }
        });
    }
}
