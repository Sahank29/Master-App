package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button button = (Button) findViewById(R.id.button3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(MainActivity4.this,MainActivity.class);
                startActivity(main);
                MainActivity4.this.finish();
                System.exit(0);
            }
        });
    }
    public void callFunction(View v)
    {
        Toast.makeText(getApplicationContext(), "Toast Message", Toast.LENGTH_SHORT).show();
    }
}