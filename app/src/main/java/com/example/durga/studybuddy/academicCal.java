package com.example.durga.studybuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class academicCal extends AppCompatActivity {
ImageView ac;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic_cal);
        ac=(ImageView)findViewById(R.id.imageView_academicCal);
        ac.setImageResource(R.drawable.academiccalendar);
    }
}
