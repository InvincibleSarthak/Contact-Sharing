package com.sarthaksharma.contactcard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class OTP extends Activity {
    EditText otp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
        otp = findViewById(R.id.otp);
        String mobile_number = getIntent().getStringExtra("phone_number");
    }

    public void Login(View view) {
        Intent intent = new Intent(OTP.this, Main4Activity.class);
        startActivity(intent);
    }
}
