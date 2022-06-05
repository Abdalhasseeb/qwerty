package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.clinic.qwerty.i;

public class MainActivity5 extends AppCompatActivity {
    public EditText PatientID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        connect();
    }
    private void connect() {
       PatientID=(EditText)findViewById(R.id.etpid);
    }

    public void remove(View view) {
        String PID = PatientID.getText().toString();
      int id=Integer.parseInt(PID);
            if (id==0)
            {
                Toast.makeText(this, "Incorrect ID", Toast.LENGTH_SHORT).show();
                return;
            }
            id--;
          if ( qwerty.PATIENTS[id]!=null) {
              qwerty.PATIENTS[id]=null;
        Toast.makeText(this, "This Patient has been removed successfully", Toast.LENGTH_SHORT).show();
                return;}

           else{
               Toast.makeText(this, "This patient is not existed", Toast.LENGTH_SHORT).show();
               return;
           }

    }

    public void patients2(View view) {
        Intent intent = new Intent(this,MainActivity3.class);
       startActivity(intent);
    }
}