package com.example.durga.studybuddy;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class teachersInfo extends AppCompatActivity {
    ListView lv;
    TextView no;

    String string, num;
    String[] names = new String[]{
            "Prof. B.A.Jadhav",
            "Prof. K.A.Shinde",
            "Prof. S.B.Pawar",
            "Prof. A.B.Trivedi",
            "Prof. S.K.Ved",
            "Prof. D.P.Vishwanath",
            "Prof. R.S.Kadam"

    };

    int[] numbers = new int[]
            {
                    98764535,
                    98732190,
                    93345787,
                    87690123,
                    75690345,
                    85439021,
                    99876548

            };

    String[] subjects = new String[]{
            "DEL",
            "DSL",
            "OOP",
            "SSL",
            "DM",
            "COA",
            "OOPL"

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teachers_info);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < 7; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("name", " " + names[i]);
            hm.put("number", " " + numbers[i]);
            hm.put("subjects", " " + subjects[i]);
            aList.add(hm);
        }


        String[] from = {"name", "number", "subjects"};
        int[] to = {R.id.name, R.id.number, R.id.subjects};


        lv = (ListView) findViewById(R.id.ListView_1);
        final SimpleAdapter adpt = new SimpleAdapter(getBaseContext(), aList, R.layout.mylistlayout, from, to);
        lv.setAdapter(adpt);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                int str = position;
                //  String str=adpt..toString();

                switch (str) {
                    case 0:
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);

                        callIntent.setData(Uri.parse("tel:98764535"));
                        startActivity(callIntent);

                        break;
                    case 1:

                        Intent callIntent1 = new Intent(Intent.ACTION_DIAL);

                        callIntent1.setData(Uri.parse("tel:98732190"));
                        startActivity(callIntent1);



                        break;
                    case 2:
                        Intent callIntent2 = new Intent(Intent.ACTION_DIAL);

                        callIntent2.setData(Uri.parse("tel:93345787"));
                        startActivity(callIntent2);

                        break;
                    case 3:
                        Intent callIntent3 = new Intent(Intent.ACTION_DIAL);

                        callIntent3.setData(Uri.parse("tel:87690123"));
                        startActivity(callIntent3);

                        break;
                    case 4:
                        Intent callIntent4 = new Intent(Intent.ACTION_DIAL);

                        callIntent4.setData(Uri.parse("tel:75690345"));
                        startActivity(callIntent4);

                        break;
                    case 5:
                        Intent callIntent5 = new Intent(Intent.ACTION_DIAL);

                        callIntent5.setData(Uri.parse("tel:85439021"));
                        startActivity(callIntent5);

                        break;
                    case 6:
                        Intent callIntent6 = new Intent(Intent.ACTION_DIAL);

                        callIntent6.setData(Uri.parse("tel:99876548"));
                        startActivity(callIntent6);

                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"******SORRY  !!!!! WRONG CHOICE !!!!!******",Toast.LENGTH_LONG).show();
                        break;



                }



            }
        });

    }
}
