package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHloWorld =(Button) findViewById(R.id.btnHelloWorld);
        Button btnDefault = (Button) findViewById(R.id.btnDefaultToast);
        Button btnClickOnToast = (Button) findViewById(R.id.btnOnClickToast);
        Button btnLifeCycle = (Button) findViewById(R.id.btnLifeCycle);
        Button btnSum = (Button) findViewById(R.id.btnSumNum);
        Button btnUserInfo = (Button) findViewById(R.id.btnUserInfo);
        Button btnCal = (Button) findViewById(R.id.btnCal);
        Button btnExit = (Button) findViewById(R.id.btnExit);

        btnHloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hello = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(hello);
            }
        });
        btnDefault.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent default1 = new Intent(MainActivity.this,MainActivity3.class);
                startActivity(default1);
            }
        });
        btnClickOnToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clickOnToast = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(clickOnToast);
            }
        });
        btnLifeCycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent clickLifeCycle = new Intent(MainActivity.this,MainActivity5.class);
                startActivity(clickLifeCycle);
            }
        });
        btnSum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sum = new Intent(MainActivity.this,MainActivity6.class);
                startActivity(sum);
            }
        });
        btnUserInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent user = new Intent(MainActivity.this,MainActivity7.class);
                startActivity(user);
            }
        });
        btnCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cal = new Intent(MainActivity.this,MainActivity8.class);
                startActivity(cal);
            }
        });
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();
                System.exit(0);
            }
        });
    }
}