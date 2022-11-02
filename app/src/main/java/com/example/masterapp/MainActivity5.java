package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Button button = (Button) findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main = new Intent(MainActivity5.this,MainActivity.class);
                startActivity(main);
                MainActivity5.this.finish();
                System.exit(0);
            }
        });
    }
    @Override
    protected void onStart(){
        super.onStart();
        Log.d("Activity LifeCycle", "onStart invoked");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d("Activity LifeCycle", "onResume invoked");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d("Activity LifeCycle", "onPause invoked");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d("Activity LifeCycle", "onStop invoked");
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("Activity LifeCycle", "onDestroy invoked");
    }
}