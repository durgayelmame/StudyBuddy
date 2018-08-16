package com.example.durga.studybuddy;

import android.app.Dialog;
import android.icu.text.SimpleDateFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Locale;

public class schedule extends AppCompatActivity {
   Button addEvent,updateButton;
    TextView eventDisplay;
    EditText time,event;
    String str="",str2="",str3="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
addEvent=(Button)findViewById(R.id.button_addEvent);
        eventDisplay=(TextView)findViewById(R.id.textView_EventDisplay);


        addEvent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Dialog AddDialog = new Dialog(schedule.this, R.style.AddDialog);
                AddDialog.setContentView(R.layout.add_dialog);
                AddDialog.setCancelable(true);

                time=(EditText) AddDialog.findViewById(R.id.editText_add_time);
                event=(EditText) AddDialog.findViewById(R.id.editText_Add_event_name);
                updateButton = (Button) AddDialog.findViewById(R.id.button_updateButn);
                updateButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //Toast.makeText(getApplicationContext()," event entered",Toast.LENGTH_LONG).show();

                          str=time.getText().toString();
                       str2=event.getText().toString();
                         str3=str3+("\n"+str+"    "+str2);
                        eventDisplay.setText(str3);
                       AddDialog.dismiss();
                    }
                });

              AddDialog.show();
            }
        });

    }

}
