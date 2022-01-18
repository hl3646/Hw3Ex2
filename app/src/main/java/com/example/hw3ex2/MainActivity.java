package com.example.hw3ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    int count = 1;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button2);
        btn.setText("Click Me !");
    }

    public void clickCount(View view)
    {
        btn.setText("You clicked: "+ count+ " times");
        count++;

    }
}