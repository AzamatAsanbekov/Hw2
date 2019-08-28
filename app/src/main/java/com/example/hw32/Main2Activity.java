package com.example.hw32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView text1, text2;
    Button btn1, btn2, btn3, btn4;
    Intent intent;
    int sum;
    int num1;
    int num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        text1 = findViewById(R.id.textView);
        text2 = findViewById(R.id.textView2);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);


        intent = getIntent();
        String el1 = intent.getStringExtra("key");
        String el2 = intent.getStringExtra("key2");
        num1 = Integer.parseInt(el1);
        text1.setText(el1);
        num2 = Integer.parseInt(el2);
        text2.setText(el2);


    }


    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button:
                sum = num1 + num2;
                Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                intent.putExtra("sum", sum);
                startActivity(intent);
                break;
            case R.id.button2:
                sum = num1 - num2;
                Intent intent1 = new Intent(Main2Activity.this, Main3Activity.class);
                intent1.putExtra("sum", sum);
                startActivity(intent1);
                break;

            case R.id.button3:
                sum = num1 / num2;
                Intent intent2 = new Intent(Main2Activity.this, Main3Activity.class);
                intent2.putExtra("sum", sum);
                startActivity(intent2);
                break;

            case R.id.button4:
                sum = num1 * num2;
                Intent intent3 = new Intent(Main2Activity.this, Main2Activity.class);
                intent3.putExtra("sum", sum);
                startActivity(intent3);
                break;

        }
    }
}
