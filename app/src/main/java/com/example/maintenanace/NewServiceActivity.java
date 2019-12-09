package com.example.maintenanace;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class NewServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newservice);


        //Intent intent = new Intent(getApplicationContext(),WelcomeActivity.class);
        //startActivity(intent);
    }


    public void processSignupLinkClick(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);

    }


}