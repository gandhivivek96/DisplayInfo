package com.example.vivekgandhi.displayinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SimpleLayout extends AppCompatActivity {


    TextView uname;
    TextView email,pass,c,s;
    TextView gen;
    String emailid,name,password,country,state,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_layout);


        Bundle firstData = getIntent().getExtras();
        uname = (TextView) findViewById(R.id.dduname);
        pass = (TextView) findViewById(R.id.ddpassword);
        email = (TextView) findViewById(R.id.ddemailid);
        c = (TextView) findViewById(R.id.ddcountry);
        s = (TextView) findViewById(R.id.ddstate);
        gen = (TextView) findViewById(R.id.ddgender);

        emailid = firstData.getString("email");
        name = firstData.getString("username");
        password = firstData.getString("password");
        country = firstData.getString("country");
        state = firstData.getString("state");
        gender = firstData.getString("gender");

        uname.setText(name);
        pass.setText(password);
        c.setText(country);
        s.setText(state);
        gen.setText(gender);
        email.setText(emailid);

    }
}
