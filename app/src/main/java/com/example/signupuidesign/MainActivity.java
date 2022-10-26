package com.example.signupuidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText uname,email,password;
String username,uemail,upass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        uname = findViewById(R.id.username);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);

        username = uname.getText().toString();
        uemail = email.getText().toString();
        upass = password.getText().toString();


        if(username.isEmpty()){
            uname.setError("name can't be blank");
        }else if(username.length() > 2){
            Toast.makeText(this, "username most be greater 2 char", Toast.LENGTH_SHORT).show();
        }else if(uemail.isEmpty()){
            email.setError("Email most be required");
        }else if(upass.isEmpty()){
            password.setError("password most be required");
        }else{
            Toast.makeText(this, "your name is "+username+ " and email is "+uemail, Toast.LENGTH_SHORT).show();
        }

    }
}