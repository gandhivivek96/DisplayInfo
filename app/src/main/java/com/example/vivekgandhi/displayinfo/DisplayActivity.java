package com.example.vivekgandhi.displayinfo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {
TextView uname;
    TextView email,pass,c,s;
    TextView gen;
    String emailid,name,password,country,state,gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Bundle firstData = getIntent().getExtras();
        uname = (TextView) findViewById(R.id.duname);
        pass = (TextView) findViewById(R.id.dpassword);
        email = (TextView) findViewById(R.id.demailid);
        c = (TextView) findViewById(R.id.dcountry);
        s = (TextView) findViewById(R.id.dstate);
        gen = (TextView) findViewById(R.id.dgender);

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
