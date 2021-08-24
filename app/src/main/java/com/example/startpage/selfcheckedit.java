package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class selfcheckedit extends AppCompatActivity {
    Button canecel2,check2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_24_selfcheckedit);

        canecel2=(Button)findViewById(R.id.cancel2);
        canecel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), selfcheck.class);
                startActivity(intent);
            }
        });

        check2=(Button)findViewById(R.id.check2);
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), selfcheck.class);
                startActivity(intent);
            }
        });
    }
}
