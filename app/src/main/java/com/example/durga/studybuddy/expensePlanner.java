package com.example.durga.studybuddy;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class expensePlanner extends AppCompatActivity {
Button add,delete,reset;
    EditText total,item,price;
    TextView list,moneyLeft;
    int totalint,priceint;
   int endResult=0;
    String str="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expense_planner);

        add=(Button)findViewById(R.id.button_add_item);
        delete=(Button)findViewById(R.id.button_delete_item);
        reset=(Button)findViewById(R.id.button_Reset);

        total=(EditText)findViewById(R.id.editText_total_amount);
        item=(EditText)findViewById(R.id.editText_item_name);
        price=(EditText)findViewById(R.id.editText_Item_price);

        list=(TextView)findViewById(R.id.textView_budget_list);
        moneyLeft=(TextView)findViewById(R.id.textView_money_left);



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((total.getText().toString().trim().length() > 0) && (item.getText().toString().trim().length() > 0 ) && (price.getText().toString().trim().length() > 0 ))
                {
                    totalint=Integer.valueOf(total.getText().toString());
                    priceint=Integer.valueOf(price.getText().toString());
                    if(endResult==0)
                    {
                        endResult=totalint;
                    }

                   endResult=(endResult-priceint);
Toast.makeText(getApplicationContext(),""+endResult,Toast.LENGTH_LONG).show();
                       str=str+("\n"+item.getText().toString()+"    -"+priceint+"  ");
list.setText(str);
                    String left= Integer.toString(endResult);

                    moneyLeft.setText(left);
                    if(endResult<=0)
                    {
                        AlertDialog.Builder alert = new AlertDialog.Builder(expensePlanner.this);
                        alert.setTitle("Ohhh Nooo!!");
                        alert.setMessage("You have used all your money...");
                        // alert.setIcon(R.drawable.icon_alert);
                        alert.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                //Toast.makeText(getApplicationContext(),"Cancel button Clicked",Toast.LENGTH_LONG).show();
                                Log.i("Code2care ","Ok button Clicked!");
                                dialog.dismiss();
                            }
                        });
                        alert.show();
                    }

                }

                else
                {
                    AlertDialog.Builder alert = new AlertDialog.Builder(expensePlanner.this);
                    alert.setTitle("Error!!");
                    alert.setMessage("Fill all the fields");
                   // alert.setIcon(R.drawable.icon_alert);
                    alert.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Toast.makeText(getApplicationContext(),"Cancel button Clicked",Toast.LENGTH_LONG).show();
                            Log.i("Code2care ","Ok button Clicked!");
                            dialog.dismiss();
                        }
                    });
                    alert.show();
                }




        }
        });



        //delete


        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((total.getText().toString().trim().length() > 0) && (item.getText().toString().trim().length() > 0 ) && (price.getText().toString().trim().length() > 0 )&&(endResult!=0))
                {
                    totalint=Integer.valueOf(total.getText().toString());
                    priceint=Integer.valueOf(price.getText().toString());

endResult=Integer.valueOf(moneyLeft.getText().toString());
                    endResult=(endResult+priceint);
                    Toast.makeText(getApplicationContext(),""+endResult,Toast.LENGTH_LONG).show();
                    str=str+("\n"+item.getText().toString()+"    +"+priceint+"  ");
                    list.setText(str);
                    String left= Integer.toString(endResult);

                    moneyLeft.setText(left);

                }

                else
                {
                    AlertDialog.Builder alert = new AlertDialog.Builder(expensePlanner.this);
                    alert.setTitle("Error!!");
                    alert.setMessage("check the following: \n 1.Fill all fields \n 2.There are no expenses to delete");
                    // alert.setIcon(R.drawable.icon_alert);
                    alert.setNeutralButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //Toast.makeText(getApplicationContext(),"Cancel button Clicked",Toast.LENGTH_LONG).show();
                            Log.i("Code2care ","Ok button Clicked!");
                            dialog.dismiss();
                        }
                    });
                    alert.show();
                }

            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                list.setText("Displayed here");

                        moneyLeft.setText("");
                total.setText("");
                        item.setText("");
                price.setText("");
                endResult=0;
                totalint=0;
                        priceint=0;
                str="";
            }
        });

    }
}
