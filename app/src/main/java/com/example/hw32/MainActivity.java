package com.example.hw32;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText text1,text2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text1=findViewById(R.id.editText);
        text2=findViewById(R.id.editText2);
        btn=findViewById(R.id.button);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1= text1.getText().toString();
                String num2 = text2.getText().toString();
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("key", num1);
                intent.putExtra("key2", num2);
                startActivity(intent);
            }
        });
    }
}
