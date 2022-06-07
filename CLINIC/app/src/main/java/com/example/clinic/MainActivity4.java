package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    public EditText firstname,lastname,Age,phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        connect();
    }

    private void connect() {
        firstname= findViewById(R.id.etfirstnamee);
        lastname= findViewById(R.id.etlastname);
        Age= findViewById(R.id.etAge);
        phone= findViewById(R.id.etphone);


    }

    public void btnnextpage(View view) {
        String fname,lname,agee,phonee;
        fname=firstname.getText().toString();
        lname=lastname.getText().toString();
        agee=Age.getText().toString();
        phonee=phone.getText().toString();
        if (fname.trim().isEmpty() || lname.trim().isEmpty() || agee.trim().isEmpty() ) {
            Toast.makeText(this, "This fields are missing!", Toast.LENGTH_SHORT).show();
            return;
        }
        if ( Integer.parseInt(agee)>=100){
            Toast.makeText(this, "Incorrect age ", Toast.LENGTH_SHORT).show();
            return;}
        if (phonee.trim().isEmpty()) {
            Toast.makeText(this, "This field are missing!", Toast.LENGTH_SHORT).show();
            return;
        }
        if (phonee.length()!=10){
            Toast.makeText(this, "Phone number is wrong!", Toast.LENGTH_SHORT).show();
            return;
        }



        Intent intent = new Intent(this, MainActivity5.class);
        Bundle s = new Bundle();
        s.putString("firstname", fname);
        s.putString("lastname", lname);
        s.putString("phone", phonee);
        s.putString("Age", agee);
        intent.putExtras(s);
        startActivity(intent);
    }
}