package com.andela.philskiiiwalker.brighteventsandroidapp.registration.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.andela.philskiiiwalker.brighteventsandroidapp.R;
import com.andela.philskiiiwalker.brighteventsandroidapp.login.LoginActivity;

public class SignUpActivity extends AppCompatActivity {

    TextView gotToSignInLink;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        gotToSignInLink = findViewById(R.id.signUpToSignInLinkTextView);
        gotToSignInLink.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
