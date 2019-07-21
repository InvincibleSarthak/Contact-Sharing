package com.sarthaksharma.contactcard;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.login);
    }

    public void login(View view) {
        btn.setVisibility(View.GONE);
        Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show();
        FragmentManager fm = getSupportFragmentManager();
        OTPScreen otp = new OTPScreen();
        fm.beginTransaction().replace(R.id.Main, otp).commit();
    }
}
