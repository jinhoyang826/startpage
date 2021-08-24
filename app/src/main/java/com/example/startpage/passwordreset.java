package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class passwordreset extends AppCompatActivity {
    Button cancel1,check11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_09_passwordreset);

        cancel1 = (Button)findViewById(R.id.cancel1);
        cancel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        check11 = (Button)findViewById(R.id.check11);  // check11 왜 빨간색으로 뜨는지 모르겠음 작동은 잘됨
        check11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


    }
}
