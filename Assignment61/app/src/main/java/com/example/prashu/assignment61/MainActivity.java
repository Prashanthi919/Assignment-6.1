package com.example.prashu.assignment61;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText e1,e2;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.email);
        e2 = (EditText)findViewById(R.id.password);
        login = (Button)findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if(e1.getText().toString().equals("prashu") && e2.getText().toString().equals("wwwwww") ){
            Toast.makeText(MainActivity.this,"Signed in successfully",Toast.LENGTH_SHORT).show();}
        else {
            Toast.makeText(MainActivity.this,"Try Again",Toast.LENGTH_SHORT).show();

        }
    }
}
