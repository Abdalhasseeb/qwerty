package com.example.clinic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView paper=findViewById(R.id.textview1);

        int k  ;
        for (k=0;k<20;k++)
            if (Emergency.Patients[k]!=null) {
            paper.append(Emergency.Patients[k]+"\n");
            }
    }
    public void Back_to_firstpage(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    public void Ambulance_car(View view) {
        Intent intent = new Intent(this,MainActivity4.class);
        startActivity(intent);

    }


}
