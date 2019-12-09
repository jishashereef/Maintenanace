package com.example.maintenanace;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class RegistrationActivity extends AppCompatActivity {
    private Context context;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }


    public void processSignInLinkClick(View view) {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);

    }


    /**public void processSignupLinkClick(View view) {
     Intent intent = new Intent(this,RegistrationActivity.class);
     startActivity(intent);
     */
}
