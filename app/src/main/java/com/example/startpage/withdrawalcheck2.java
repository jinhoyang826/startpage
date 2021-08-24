package com.example.startpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class withdrawalcheck2 extends AppCompatActivity {
    Button check2, cancel2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_13_withdrawalcheck2);

        check2=(Button)findViewById(R.id.check2);
        check2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                Toast.makeText(withdrawalcheck2.this, "회원탈퇴가 완료되었습니다.", Toast.LENGTH_LONG).show();
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
