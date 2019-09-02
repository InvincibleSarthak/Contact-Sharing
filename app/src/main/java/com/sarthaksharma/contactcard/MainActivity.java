package com.sarthaksharma.contactcard;
import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
public class MainActivity extends AppCompatActivity {
    EditText mobile_number;
    Button btn,loginBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.login);
        loginBtn=findViewById(R.id.login_button);
        mobile_number = findViewById((R.id.phone_number));
    }

    public void login(View view) {
        String number = mobile_number.getText().toString().trim();
        if(number.isEmpty()){
            mobile_number.setError("Number is required!");
            mobile_number.requestFocus();
            return;
        }
        else if(number.length() < 10){
            mobile_number.setError("Minimum 10 digits required!");
            mobile_number.requestFocus();
            return;
        }
        btn.setVisibility(View.GONE);
        Intent intent = new Intent(MainActivity.this, OTP.class);
        intent.putExtra("phone_number",number);
        startActivity(intent);
//        FragmentManager fm = getSupportFragmentManager();
//        OTPScreen otp = new OTPScreen();
//        fm.beginTransaction().replace(R.id.Main, otp).commit();
    }

}
