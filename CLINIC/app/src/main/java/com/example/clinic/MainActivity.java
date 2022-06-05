package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_TEXT="com.example.application.example.EXTRA_TEXT";
    public EditText firstname ,lastname  ,Age ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connect ();


    }



    private void connect() {
        firstname = findViewById(R.id.etfirstnamee);
        lastname = findViewById(R.id.etlastname);
        Age = findViewById(R.id.etAge);


    }

    public void btnnextpage(View view) {
        String  Mfirstname ,Mlastname ,MAge;
        Mfirstname = firstname.getText().toString();
        Mlastname = lastname.getText().toString();
        MAge =Age.getText().toString();


        if (Mfirstname.trim().isEmpty() || Mlastname.trim().isEmpty() || MAge.trim().isEmpty() ) {
            Toast.makeText(this, "This fields are missing!", Toast.LENGTH_SHORT).show();
            return;
        }
        if ( Integer.parseInt(MAge)>=100){
            Toast.makeText(this, "Incorrect age ", Toast.LENGTH_SHORT).show();
            return;}



        Intent intent = new Intent (this,MainActivity2.class);



        Bundle p= new Bundle();
        p.putString("fname", Mfirstname);
        p.putString("lname", Mlastname);
        p.putString("pAge", MAge);





        intent.putExtras(p);
        startActivity(intent);

    }

}