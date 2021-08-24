package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;

public class selfcheck extends AppCompatActivity {
    Button addbutton, editbutton;
    CheckBox selfchecklistbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_21_selfcheck);

        addbutton =(Button)findViewById(R.id.addbutton);
        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), selfcheckadd.class);
                startActivity(intent);
            }
        });

        editbutton =(Button) findViewById(R.id.editbutton);
        editbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), selfcheckedit.class);
                startActivity(intent);
            }
        });

        selfchecklistbutton =(CheckBox)findViewById(R.id.selfchecklistbutton);
        selfchecklistbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), selfchecklist.class);
                startActivity(intent);
            }
        });

    }
}
