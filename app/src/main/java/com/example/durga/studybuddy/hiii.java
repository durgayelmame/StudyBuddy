package com.example.durga.studybuddy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class hiii extends AppCompatActivity {
    private final int TIME=1000;
    TextView hii_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiii);

        hii_name=(TextView)findViewById(R.id.textView_hiii);
        SharedPreferences sp = getSharedPreferences("NEW_URL", MODE_PRIVATE);


String str= sp.getString("name", "");
       str="Hi "+str;
        hii_name.setText(str);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
                finish();
            }
        },TIME);
    }
}
