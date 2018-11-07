package com.andela.philskiiiwalker.brighteventsandroidapp.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.andela.philskiiiwalker.brighteventsandroidapp.R;

public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("check", "onCreate: I am here");
        setContentView(R.layout.activity_main);

    }
}
