package com.example.durga.studybuddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;

import static com.example.durga.studybuddy.R.styleable.View;

public class website extends AppCompatActivity {
WebView myweb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_website);
        myweb=(WebView)findViewById(R.id.web1);
        myweb.loadUrl("http://www.pict.edu/");
        onBackPressed();





    }
    public void onBackPressed()
    {
        // do something on back.
        Intent i=new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }
}
