package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class withdrawalcheck extends AppCompatActivity {
    Button check2, cancel2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_12_withdrawalcheck);

        check2=(Button)findViewById(R.id.check2);
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), withdrawalcheck2.class);
                startActivity(intent);
            }
        });

        cancel2=(Button)findViewById(R.id.cancel2);
        cancel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), mainpage.class);
                startActivity(intent);
            }
        });
    }
}
