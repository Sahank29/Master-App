package com.example.masterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button btn1 = (Button) findViewById(R.id.button);
        Button btn2 = (Button) findViewById(R.id.button2);
        Button btn3 = (Button) findViewById(R.id.button5);
        TextView textViewAns = (TextView) findViewById(R.id.textViewAns);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sum = new Intent(MainActivity6.this,MainActivity.class);
                startActivity(sum);
                MainActivity6.this.finish();
                System.exit(0);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value1=editText1.getText().toString();
                String value2=editText2.getText().toString();

                try {
                    int a,b,sum;
                    a = Integer.parseInt(value1);
                    b = Integer.parseInt(value2);
                    sum = a + b;
                    textViewAns.setText("Sum Result : "+Integer.toString(sum));
                    Toast.makeText(getApplicationContext(),"Sum :"+String.valueOf(sum),Toast.LENGTH_SHORT).show();
                }
                catch (NumberFormatException ex) {
                    Toast.makeText(getApplicationContext(),"A and B should be numbers only",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText1.setText("");
                editText2.setText("");
                textViewAns.setText("");
                Toast.makeText(getApplicationContext(),"Cleared",Toast.LENGTH_SHORT).show();
            }
        });
    }
}