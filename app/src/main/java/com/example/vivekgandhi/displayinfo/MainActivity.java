package com.example.vivekgandhi.displayinfo;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
 EditText username;
    EditText email;
    TextView dispname;
    EditText pass,c,s;
    String gender,uname,password,country,state,emailid,gen;
    RadioButton maleRadioButton, femaleRadioButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public String onRadioButtonClicked(View view)
    {
        maleRadioButton = (RadioButton) findViewById(R.id.male);
        femaleRadioButton = (RadioButton) findViewById(R.id.female);
        if(maleRadioButton.isChecked())
        {
            gender="male";

        }
        else if(femaleRadioButton.isChecked())
        {
            gender="female";
        }
        else
        {
            gender="null";
        }
        return gender;
    }
    public void display(View view)
    {
        Intent i = new Intent(this,SimpleLayout.class);
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
        gen = onRadioButtonClicked(view);


        if (emailid.isEmpty() || password.isEmpty() || uname.isEmpty() || country.isEmpty() || state.isEmpty() || gen.equals("null")) {
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setMessage(R.string.error_message)
                    .setTitle(R.string.error_title)
                    .setPositiveButton(android.R.string.ok, null);
            AlertDialog dialog = builder.create();
            dialog.show();
        }
        else {
             i.putExtra("username", uname);
            i.putExtra("password", password);
            i.putExtra("email", emailid);
            i.putExtra("country", country);
            i.putExtra("state", state);
            i.putExtra("gender", gender);

            startActivity(i);
        }
    }
}
