package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;



import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.application.example.EXTRA_TEXT";
    private int  n=0;
    public EditText phone;
    public String Mphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

    }

    public void btnreservation(View view)  {

        phone = findViewById(R.id.et);
        Mphone = phone.getText().toString();

        if (Mphone.trim().isEmpty()  ) {
            Toast.makeText(this, "This field are missing!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (Mphone.length()!=10){
            Toast.makeText(this, "Phone number is wrong!", Toast.LENGTH_SHORT).show();
            return;
        }

        Bundle p = getIntent().getExtras();
        String fnn = p.getString("fname");
        String lnn = p.getString("lname");
        String Agee=p.getString("pAge");



        if ( n==0)  {

            TextView date = findViewById(R.id.textView4);

            String prit = "your reservation date at " + qwerty.hour + ":00" + "  in:  " + qwerty.day + "/" + qwerty.month + "/2022";
            qwerty.PATIENTS[0]=(qwerty.ID+") "+fnn+"  "+lnn+" Age:"+Agee+" phone:"+Mphone+" "+prit);
            date.setText(prit);
            n++;
            qwerty.hour++;
            qwerty.ID++;


        }else {
            Toast.makeText(this, "This is your Reservertion ", Toast.LENGTH_SHORT).show();
            return;

        }

    }



    public void btnnextpagee(View view) {

        EditText ph = (EditText) findViewById(R.id.et);
        TextView dd= (TextView) findViewById(R.id.textView4);
        Intent intente = new Intent (this,MainActivity3.class);
        Bundle p = getIntent().getExtras();
        String fnn= p.getString("fname");
        String lnn= p.getString("lname");
        String Agee=p.getString("pAge");



        Bundle b = new Bundle();
        b.putString("phone",ph.getText().toString());
        b.putString("date", dd.getText().toString());
        b.putString("ffname", fnn);
        b.putString("llname", lnn);
        b.putString("AAge", Agee);

        intente.putExtras(b);
        startActivity(intente);

    }

}

