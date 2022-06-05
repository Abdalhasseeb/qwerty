package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;






import static com.example.clinic.qwerty.PATIENTS;
import static com.example.clinic.qwerty.i;


public class MainActivity3 extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        TextView textView1 = (TextView)findViewById(R.id.editTextt);


        for (i=0; i<20 ;i++){
            if (qwerty.PATIENTS[i]!=null)
                textView1.append(qwerty.PATIENTS[i]+"\n");
        }

    }


    public void ADD(View view) {

        Intent inte = new Intent(this,MainActivity4.class);
        startActivity(inte);

    }


    public void Remove(View view) {
        Intent intent = new Intent(this,MainActivity5.class);
        startActivity(intent);


    }
}