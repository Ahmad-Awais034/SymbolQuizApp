package com.example.symbolquizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView totalQuestionsTextView;
    TextView questionTextView;
    Button ansA,ansB,ansC,ansD;
    Button submitBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        totalQuestionsTextView=findViewById(R.id.total_question);
        questionTextView = findViewById(R.id.question);
        ansA=findViewById(R.id.ans_a);
        ansB=findViewById(R.id.ans_b);
        ansC=findViewById(R.id.ans_c);
        ansD=findViewById(R.id.ans_d);
        submitBtn=findViewById(R.id.submit_btn);
    }
}