package com.example.valet_parking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView forgetpass;
    TextView signup;
    Button signin;
    EditText username,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        forgetpass=findViewById(R.id.forgetbtn);
        signin=findViewById(R.id.signinbtn);
        username=findViewById(R.id.userin);
        password=findViewById(R.id.passin);
        signup=findViewById(R.id.signup_click);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(MainActivity.this,Signup.class);
                startActivity(intent);
                finish();
            }
        });

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(  username.getText().toString().equals("admin") && password.getText().toString().equals("admin")){
                    Intent intent=new Intent(MainActivity.this,Drawer.class);
                    startActivity(intent);
                    finish();

                }
                else{
                    Toast.makeText(MainActivity.this, "check your credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}