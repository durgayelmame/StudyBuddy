package com.example.durga.studybuddy;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
 RatingBar ratingBar;
Button updateButton;
    ImageButton notes,timetable,schedule,academic,expense,teachers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        notes=(ImageButton)findViewById(R.id.button_notes);

//        setSupportActionBar(toolbar);








        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Sending to your profile", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                Intent i=new Intent(getApplicationContext(),LoginPage.class);
                startActivity(i);

            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);



        notes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Notes.class);
                startActivity(i);

            }

        });
       timetable=(ImageButton)findViewById(R.id.button_timetable);
        timetable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),Timetable.class);
                startActivity(i);


            }

        });
      schedule=(ImageButton)findViewById(R.id.button_schedule);
        schedule.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),schedule.class);
                startActivity(i);


            }

        });
       academic=(ImageButton)findViewById(R.id.button_Academic_calendar);
       academic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),academicCal.class);
                startActivity(i);


            }

        });
       expense=(ImageButton)findViewById(R.id.button_Expense_planner);
        expense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),expensePlanner.class);
                startActivity(i);


            }

        });
       teachers=(ImageButton)findViewById(R.id.button_Teachers_info);
      teachers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),teachersInfo.class);
                startActivity(i);


            }

        });
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       /* if (id == R.id.action_settings) {
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override

    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_about) {
            // Handle the camera action
            Intent i=new Intent(getApplicationContext(),about_pict.class);
            startActivity(i);
            //finish();
this.onBackPressed();
        } else {
            if (id == R.id.nav_website) {
                Intent i = new Intent(getApplicationContext(), website.class);
                startActivity(i);
                finish();

            } else {
                if (id == R.id.nav_settings) {
                    Intent i = new Intent(getApplicationContext(), LoginPage.class);
                    startActivity(i);
                    this.onBackPressed();
                } else {
                    if (id == R.id.nav_feedback) {


                        final Dialog rankDialog = new Dialog(MainActivity.this, R.style.smallDialog);
                        rankDialog.setContentView(R.layout.rank_dialog);
                        rankDialog.setCancelable(true);
                        ratingBar = (RatingBar) rankDialog.findViewById(R.id.dialog_ratingbar);
                        // ratingBar.setRating(userRankValue);


                        updateButton = (Button) rankDialog.findViewById(R.id.rank_dialog_button);
                        updateButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                String rating=String.valueOf(ratingBar.getRating());
                                Toast.makeText(getApplication(),"Rating given:   "+rating,Toast.LENGTH_LONG).show();
                                rankDialog.dismiss();
                            }
                        });
                        //now that the dialog is set up, it's time to show it
                        rankDialog.show();
                    }
                }
            }
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
