package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        TextView paper=findViewById(R.id.textview1);

        int k  ;
        for (k=0;k<20;k++)
            if (qwerty.Emergency_PATIENTS[k]!=null) {
                paper.append(qwerty.Emergency_PATIENTS[k]+"\n");
            }
    }
    public void Back_to_firstpage(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
    public void Ambulance_car(View view) {
        TextView paper=findViewById(R.id.textview1);
        EditText pid = (EditText) findViewById(R.id.etpid);
        String PID= pid.getText().toString();
        int id = Integer.parseInt(PID);
        if (id==0)
        {
            Toast.makeText(this, "Incorrect ID!", Toast.LENGTH_SHORT).show();
            return;
        }
        id--;
        if (qwerty.Emergency_PATIENTS[id]==null)
        {
            Toast.makeText(this, "This Patient is not existed!", Toast.LENGTH_SHORT).show();
            return;
        }
        qwerty.Emergency_PATIENTS[id]=null;
        Toast.makeText(this, "Ambulance car has been successfully sent To this Patient", Toast.LENGTH_SHORT).show();
        paper.setText("");

        int k  ;
        for (k=0;k<20;k++)
            if (qwerty.Emergency_PATIENTS[k]!=null) {
                paper.append(qwerty.Emergency_PATIENTS[k]+"\n");
            }
        return;

    }
    public void send_a_reservation_request(View view) {
        TextView paper=findViewById(R.id.textview1);
        EditText pid = (EditText) findViewById(R.id.etpid);
        String PID= pid.getText().toString();
        int id = Integer.parseInt(PID);
        if (id==0)
        {
            Toast.makeText(this, "Incorrect ID!", Toast.LENGTH_SHORT).show();
            return;
        }
        id--;
        if (qwerty.Emergency_PATIENTS[id]==null)
        {
            Toast.makeText(this, "This Patient is not existed!", Toast.LENGTH_SHORT).show();
            return;
        }
        qwerty.Emergency_PATIENTS[id]=null;
        Toast.makeText(this, "Reservation request has been seccessfully sent To this Patient", Toast.LENGTH_SHORT).show();
        paper.setText("");

        int k  ;
        for (k=0;k<20;k++)
            if (qwerty.Emergency_PATIENTS[k]!=null) {
                paper.setText(qwerty.Emergency_PATIENTS[k]+"\n");
            }
        return;

    }

    public void Back_to_firstactivity(View view) {
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }


}
