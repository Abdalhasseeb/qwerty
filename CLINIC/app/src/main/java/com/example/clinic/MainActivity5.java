package com.example.clinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    public EditText Address,pathological_case;
    private int i =0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
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
            if(qwerty.Emergency_PATIENTS[i] == null) {
                qwerty.Emergency_PATIENTS[i]=qwerty.EID+") "+fn+" "+ln+" Age: "+ag+" phone: "+ph+"\n"+"Address: "+
                        address+"\n"+"Pathological Case: "+pathological;
                qwerty.EID++;


                Toast.makeText(this, "Report has benn sent successfully", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(this, MainActivity6.class);
                startActivity(intent);
                return;
            }







    }
}