package com.example.durga.studybuddy;

import android.content.SharedPreferences;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class Timetable extends AppCompatActivity {
ImageView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);
        tt = (ImageView) findViewById(R.id.imageView_tt);


        SharedPreferences sp = getSharedPreferences("NEW_URL", MODE_PRIVATE);


        String str = sp.getString("course", "");

        String str2 = sp.getString("semester", "");


        String str3 = sp.getString("classs", "");


        if((str.equals("Comp")||str.equals("IT")||str.equals("ETC")) && (str2.equals("1")) && (str3.equals("1"))){
           // Toast.makeText(getApplicationContext(),"ce it entc  1 1",Toast.LENGTH_LONG).show();
            tt.setImageResource(R.drawable.all_1_1);
        }
        if((str.equals("Comp")||str.equals("IT")||str.equals("ETC")) && (str2.equals("1")) && (str3.equals("2"))){
            tt.setImageResource(R.drawable.all_1_2);
        }
        if((str.equals("Comp")||str.equals("IT")||str.equals("ETC")) && (str2.equals("1")) && (str3.equals("3"))){
            tt.setImageResource(R.drawable.all_1_3);
        }
        if((str.equals("Comp")||str.equals("IT")||str.equals("ETC")) && (str2.equals("2")) && (str3.equals("1")||str3.equals("2")||str3.equals("3"))){
            tt.setImageResource(R.drawable.not_available);
        }
        if((str.equals("Comp")||str.equals("IT")||str.equals("ETC")) && (str2.equals("4")) && (str3.equals("1")||str3.equals("2")||str3.equals("3"))){
            tt.setImageResource(R.drawable.not_available);
        }
        if((str.equals("Comp")||str.equals("IT")||str.equals("ETC")) && (str2.equals("6")) && (str3.equals("1")||str3.equals("2")||str3.equals("3"))){
            tt.setImageResource(R.drawable.not_available);
        }
        if((str.equals("Comp")||str.equals("IT")||str.equals("ETC")) && (str2.equals("8")) && (str3.equals("1")||str3.equals("2")||str3.equals("3"))){
            tt.setImageResource(R.drawable.not_available);
        }
        if((str.equals("Comp")) && (str2.equals("3")) && (str3.equals("1"))){
            tt.setImageResource(R.drawable.ce_3_1);
        }
        if((str.equals("Comp")) && (str2.equals("3")) && (str3.equals("2"))){
            tt.setImageResource(R.drawable.ce_3_2);
        }
        if((str.equals("Comp")) && (str2.equals("3")) && (str3.equals("3"))){
            tt.setImageResource(R.drawable.ce_3_3);
        }
        if((str.equals("Comp")) && (str2.equals("5")) && (str3.equals("1"))){
            tt.setImageResource(R.drawable.ce_5_1);
        }
        if((str.equals("Comp")) && (str2.equals("5")) && (str3.equals("2"))){
            tt.setImageResource(R.drawable.ce_5_2);
        }
        if((str.equals("Comp")) && (str2.equals("5")) && (str3.equals("3"))){
            tt.setImageResource(R.drawable.ce_5_3);
        }
        if((str.equals("Comp")) && (str2.equals("7")) && (str3.equals("1"))){
            tt.setImageResource(R.drawable.ce_7_1);
        }

        if((str.equals("Comp")) && (str2.equals("7")) && (str3.equals("2"))){
            tt.setImageResource(R.drawable.ce_7_2);
        }
        if((str.equals("Comp")) && (str2.equals("7")) && (str3.equals("3"))){
            tt.setImageResource(R.drawable.ce_7_3);
        }


        // it

        if((str.equals("IT")) && (str2.equals("3")) && (str3.equals("1"))){
            tt.setImageResource(R.drawable.it_3_1);
        }
        if((str.equals("IT")) && (str2.equals("3")) && (str3.equals("2"))){
            tt.setImageResource(R.drawable.it_3_2);
        }
        if((str.equals("IT")) && (str2.equals("3")) && (str3.equals("3"))){
            tt.setImageResource(R.drawable.it_3_3);
        }
        if((str.equals("IT")) && (str2.equals("5")) && (str3.equals("1"))){
            tt.setImageResource(R.drawable.it_5_1);
        }
        if((str.equals("IT")) && (str2.equals("5")) && (str3.equals("2"))){
            tt.setImageResource(R.drawable.it_5_2);
        }
        if((str.equals("IT")) && (str2.equals("5")) && (str3.equals("3"))){
            tt.setImageResource(R.drawable.it_5_3);
        }
        if((str.equals("IT")) && (str2.equals("7")) && (str3.equals("1"))){
            tt.setImageResource(R.drawable.it_7_1);
        }

        if((str.equals("IT")) && (str2.equals("7")) && (str3.equals("2"))){
            tt.setImageResource(R.drawable.it_7_2);
        }
        if((str.equals("IT")) && (str2.equals("7")) && (str3.equals("3"))){
            tt.setImageResource(R.drawable.not_available);
        }

        //e&tc
        if((str.equals("ETC")) && (str2.equals("3")) && (str3.equals("1"))){
            tt.setImageResource(R.drawable.etc_3_1);
        }
        if((str.equals("ETC")) && (str2.equals("3")) && (str3.equals("2"))){
            tt.setImageResource(R.drawable.etc_3_2);
        }
        if((str.equals("ETC")) && (str2.equals("3")) && (str3.equals("3"))){
            tt.setImageResource(R.drawable.etc_3_3);
        }
        if((str.equals("ETC")) && (str2.equals("5")) && (str3.equals("1"))){
            tt.setImageResource(R.drawable.etc_5_1);
        }
        if((str.equals("ETC")) && (str2.equals("5")) && (str3.equals("2"))){
            tt.setImageResource(R.drawable.etc_5_2);
        }
        if((str.equals("ETC")) && (str2.equals("5")) && (str3.equals("3"))){
            tt.setImageResource(R.drawable.etc_5_3);
        }
        if((str.equals("ETC")) && (str2.equals("7")) && (str3.equals("1"))){
            tt.setImageResource(R.drawable.etc_7_1);
        }

        if((str.equals("ETC")) && (str2.equals("7")) && (str3.equals("2"))){
            tt.setImageResource(R.drawable.etc_7_2);
        }
        if((str.equals("ETC")) && (str2.equals("7")) && (str3.equals("3"))){
            tt.setImageResource(R.drawable.not_available);
        }

    }
}
