package com.example.valet_parking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Signup extends AppCompatActivity {
     EditText email,password,username,retype;
     TextView signin;
     Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        email=findViewById(R.id.emailup);
        password=findViewById(R.id.passup);
        username=findViewById(R.id.userup);
        retype=findViewById(R.id.repassup);
        signin=findViewById(R.id.signin_click);
        signup=findViewById(R.id.signupbtn);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this,Drawer.class);
                startActivity(intent);
                finish();
            }
        });
        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 Intent intent=new Intent(Signup.this,MainActivity.class);
                 startActivity(intent);
                 finish();

            }
        });


    }
}