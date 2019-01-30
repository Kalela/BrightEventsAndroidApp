package com.andela.philskiiiwalker.brighteventsandroidapp.registration.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.andela.philskiiiwalker.brighteventsandroidapp.R;
import com.andela.philskiiiwalker.brighteventsandroidapp.login.LoginActivity;
import com.andela.philskiiiwalker.brighteventsandroidapp.registration.contract.RegisterContract;
import com.andela.philskiiiwalker.brighteventsandroidapp.registration.presenter.RegisterPresenter;

import com.andela.philskiiiwalker.brighteventsandroidapp.util.services.RetrofitInjector;

public class SignUpActivity extends AppCompatActivity implements RegisterContract.RegisterView {

    TextView gotToSignInLink;
    Button signUpButton;
    EditText usernameEditText;
    EditText emailEditText;
    EditText passwordEditText;
    EditText confirmPasswordEditText;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        gotToSignInLink = findViewById(R.id.signUpToSignInLinkTextView);
        signUpButton = findViewById(R.id.signUpNowButton);
        usernameEditText = findViewById(R.id.signupUsernameEditText);
        emailEditText = findViewById(R.id.signupEmailEditText);
        passwordEditText = findViewById(R.id.signupPasswordEditText);
        confirmPasswordEditText = findViewById(R.id.signupConfirmPasswordEditText);


        final RegisterPresenter registerPresenter = new RegisterPresenter(this,
                RetrofitInjector.provideUsersService());

        gotToSignInLink.setOnClickListener(new Button.OnClickListener(){

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        signUpButton.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerPresenter.registerUser(emailEditText.getText().toString(),
                        usernameEditText.getText().toString(),
                        passwordEditText.getText().toString(),
                        confirmPasswordEditText.getText().toString());
            }
        });
    }

    @Override
    public void showPasswordToast() {
        Toast.makeText(this, "Passwords do not match!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void navigateSuccess() {
        Toast.makeText(this, "Registration Successful, please log in", Toast.LENGTH_SHORT).show();
        Thread waitThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(1000);
                    Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                    startActivity(intent);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        waitThread.start();
    }

    @Override
    public void showErrorMessage() {
        Toast.makeText(this, "Something went wrong. Please check your connection.", Toast.LENGTH_LONG).show();
    }
}
