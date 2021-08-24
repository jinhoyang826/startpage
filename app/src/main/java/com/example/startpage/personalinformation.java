package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class personalinformation extends AppCompatActivity {
    CheckBox personalinformation, agreement;
    Button button, button2;
    TextView textView7,textViewLog,textViewLog1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_01_personalinformation);

        personalinformation = (CheckBox) findViewById(R.id.personalinformation);
        agreement = (CheckBox) findViewById(R.id.agreement);
        button = (Button) findViewById(R.id.addbutton);
        button2 = (Button) findViewById(R.id.editbutton);
        textView7 = (TextView)findViewById(R.id.textView7);

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(personalinformation.isChecked() && agreement.isChecked()){
                    Intent intent = new Intent(getApplicationContext(), singup.class);
                    startActivity(intent);
                }else{
                    textView7.setText("동의가 되지 않았습니다.");
                }
            }
        });

        button2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        textViewLog = findViewById(R.id.textViewLog);
        textViewLog.setMovementMethod(new ScrollingMovementMethod());

        textViewLog1 = findViewById(R.id.textViewLog1);
        textViewLog1.setMovementMethod(new ScrollingMovementMethod());


    }
}
