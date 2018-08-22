package com.andela.philskiiiwalker.brighteventsandroidapp.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.andela.philskiiiwalker.brighteventsandroidapp.R;
import com.andela.philskiiiwalker.brighteventsandroidapp.registration.view.SignUpActivity;

public class LoginActivity extends AppCompatActivity {
    TextView gotToSignUpLink;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);

        gotToSignUpLink = findViewById(R.id.signInToSignUpLinkTextView);
        gotToSignUpLink.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
