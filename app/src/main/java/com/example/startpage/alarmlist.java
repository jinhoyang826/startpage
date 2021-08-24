package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alarmlist extends AppCompatActivity {
    Button addbutton,cancel,deletebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_15_alarmlist);

        addbutton=(Button)findViewById(R.id.addbutton);
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), alarmadd.class);
                startActivity(intent);
            }
        });

        cancel=(Button)findViewById(R.id.cancel);
        deletebutton=(Button)findViewById(R.id.deletebutton);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if (view == cancel) {
                        deletebutton.setVisibility(View.VISIBLE);
                    } else if (view == cancel) {
                        deletebutton.setVisibility(View.INVISIBLE);
                    }
                }

        });
    }
}
