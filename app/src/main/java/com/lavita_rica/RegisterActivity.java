package com.lavita_rica;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.register);
        setContentView(R.layout.activity_register);

        ActionBar actionBar =  getSupportActionBar();
        actionBar.hide();
    }
}
