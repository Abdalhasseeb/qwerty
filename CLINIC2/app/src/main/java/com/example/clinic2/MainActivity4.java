package com.example.clinic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

    }

    public void Send_Ambulance_Car(View view) {
        EditText pid = (EditText) findViewById(R.id.etpid);
        String PID= pid.getText().toString();
        int id = Integer.parseInt(PID);
        if (id==0)
        {
            Toast.makeText(this, "Incorrect ID!", Toast.LENGTH_SHORT).show();
            return;
        }
        id--;
        if (Emergency.Patients[id]==null)
        {
            Toast.makeText(this, "This Patient is not existed!", Toast.LENGTH_SHORT).show();
            return;
        }
        Emergency.Patients[id]=null;
        Toast.makeText(this, "Ambulance car has been seccessfully sent To this Patient", Toast.LENGTH_SHORT).show();
        return;
    }

    public void Back_to_Patients(View view) {
        Intent intent = new Intent(this,MainActivity3.class);
        startActivity(intent);

    }

}