package com.example.vivekgandhi.displayinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 EditText username;
    EditText email;
    TextView dispname;
    EditText pass,c,s;
    String gender,uname,password,country,state,emailid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onRadioButtonClicked(View view)
    {

        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.male:
                if (checked) {

                    gender="male";
                    // Pirates are the best
                    break;
                }
            case R.id.female:
                if (checked) {

                    gender="female";
                    // Ninjas rule
                    break;
                }
        }


    }
    public void display(View view)
    {
        Intent i = new Intent(this,DisplayActivity.class);
        username=(EditText) findViewById(R.id.uname);
        email=(EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.password);
        c = (EditText) findViewById(R.id.country);
        s = (EditText) findViewById(R.id.state);

         uname = username.getText().toString().trim();
         emailid = email.getText().toString().trim();
        password = pass.getText().toString().trim();
        country = c.getText().toString().trim();
        state = s.getText().toString().trim();
        i.putExtra("username",uname);
        i.putExtra("password",password);
        i.putExtra("email",emailid);
        i.putExtra("country",country);
        i.putExtra("state",state);
        i.putExtra("gender",gender);

        startActivity(i);

    }
}
