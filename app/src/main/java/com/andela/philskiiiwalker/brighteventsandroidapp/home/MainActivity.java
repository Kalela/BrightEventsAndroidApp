package com.andela.philskiiiwalker.brighteventsandroidapp.home;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.andela.philskiiiwalker.brighteventsandroidapp.R;

public class MainActivity extends AppCompatActivity {
    Button getStarted;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getStarted = findViewById(R.id.signUpButton);
    }
}
