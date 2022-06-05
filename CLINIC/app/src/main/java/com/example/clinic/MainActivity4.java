package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.clinic.qwerty.i;

public class MainActivity4 extends AppCompatActivity {
    public EditText firstname ,lastname  ,Age,phone ;
    private int n =0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        connect();

    }

    private void connect() {
        firstname = findViewById(R.id.etfirstnamee);
        lastname = findViewById(R.id.etlastname);
        Age = findViewById(R.id.etAge);
        phone= findViewById(R.id.et);

    }

    public void add(View view) {
        String Mfirstname=firstname.getText().toString();
        String Mlastname=lastname.getText().toString();
        String MAge=Age.getText().toString();
        String Mphone =phone.getText().toString();



        if (Mfirstname.trim().isEmpty() || Mlastname.trim().isEmpty() || MAge.trim().isEmpty() ) {
            Toast.makeText(this, "This fields are missing!", Toast.LENGTH_SHORT).show();
            return;
        }
        if ( Integer.parseInt(MAge)>=100){
            Toast.makeText(this, "Incorrect age ", Toast.LENGTH_SHORT).show();
            return;}
        if (Mphone.trim().isEmpty()) {
            Toast.makeText(this, "This field are missing!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (Mphone.length()!=10){
            Toast.makeText(this, "Phone number is wrong!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (n==0) {
            if (qwerty.hour == 15) {
                qwerty.day++;
                qwerty.hour = 9;
                if (qwerty.day == 31) {
                    qwerty.month++;
                    qwerty.day = 1;
                }

            }


            TextView reservationdate2 = (TextView) findViewById(R.id.TextView5);


            String prit = "your reservation date at " + qwerty.hour + ":00" + "  in:  " + qwerty.day + "/" + qwerty.month + "/2022";
            reservationdate2.setText(prit);
            for (i = 0; i < 20; i++)
                if (qwerty.PATIENTS[i] == null) {
                    qwerty.PATIENTS[i] = (qwerty.ID + ") " + Mfirstname + "  " + Mlastname + " Age:" + MAge + " phone:" + Mphone + " " + prit);
                    qwerty.hour++;
                    qwerty.ID++;
                    n++;
                    return;
                }

        }
        else
        {
            Toast.makeText(this, "This is your reservation !", Toast.LENGTH_SHORT).show();
            return;
        }


    }


    public void patients(View view) {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);

    }
}