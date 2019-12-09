package com.example.maintenanace;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Intent intent = new Intent(getApplicationContext(),NewServiceActivity.class);
        startActivity(intent);
    }


    public void processSignupLinkClick(View view) {
        Intent intent = new Intent(this, RegistrationActivity.class);
        startActivity(intent);

    }


}