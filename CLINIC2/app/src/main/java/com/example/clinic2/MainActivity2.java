package com.example.clinic2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    public EditText Address,pathological_case;
    private int i =0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        connect();
    }

    private void connect() {
        Address=findViewById(R.id.etaddress);
        pathological_case=findViewById(R.id.etpathological);
    }

    public void btnsendreport(View view) {

        String address,pathological,fn,ln,ag,ph;
        address=Address.getText().toString();
        pathological=pathological_case.getText().toString();

        Bundle s = getIntent().getExtras();
        fn= s.getString("firstname");
        ln= s.getString("lastname");
        ag= s.getString("Age");
        ph= s.getString("phone");

        for (i = 0; i < 20; i++)
            if(Emergency.Patients[i] == null) {
                Emergency.Patients[i]=Emergency.ID+") "+fn+" "+ln+" Age: "+ag+" phone: "+ph+"\n"+"Address: "+
                        address+"\n"+"Pathological Case: "+pathological;
                Emergency.ID++;
                Emergency.i++;

                Toast.makeText(this, "Report has benn sent successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this,MainActivity3.class);
                startActivity(intent);
                return;
            }







    }
}