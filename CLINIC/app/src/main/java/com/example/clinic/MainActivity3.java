package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import static com.example.clinic.qwerty.i;


public class MainActivity3 extends AppCompatActivity {
    public TextView textView1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);



        textView1 = (TextView)findViewById(R.id.editTextt);
        for (i=0; i<20 ;i++){
            if (qwerty.PATIENTS[i]!=null)
                textView1.append(qwerty.PATIENTS[i]+"\n");
        }

    }


    public void ADD(View view) {

        Intent inte = new Intent(this,MainActivity.class);
        startActivity(inte);

    }


    public void Remove(View view) {
        textView1 = (TextView)findViewById(R.id.editTextt);
        EditText PatientID;
        PatientID=(EditText)findViewById(R.id.etpid);
        String PID = PatientID.getText().toString();
        int id=Integer.parseInt(PID);
        if (id==0)
        {
            Toast.makeText(this, "Incorrect ID", Toast.LENGTH_SHORT).show();
            return;
        }
        id--;
        if ( qwerty.PATIENTS[id]!=null) {
            textView1.setText("");
            qwerty.PATIENTS[id]=null;
            Toast.makeText(this, "This Patient has been removed successfully", Toast.LENGTH_SHORT).show();
            for (i=0; i<20 ;i++){
                if (qwerty.PATIENTS[i]!=null)
                    textView1.append(qwerty.PATIENTS[i]+"\n");
            }
            return;}

        else{
            Toast.makeText(this, "This patient is not existed", Toast.LENGTH_SHORT).show();
            return;
        }


    }

    public void Emergency_Case(View view) {
        Intent intent = new Intent(this, MainActivity4.class);
        startActivity(intent);
    }
}