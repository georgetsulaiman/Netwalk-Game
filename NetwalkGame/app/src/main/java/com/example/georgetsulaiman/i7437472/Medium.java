package com.example.georgetsulaiman.i7437472;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Medium extends AppCompatActivity {

    static Context mDialogContext=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.medium);

        mDialogContext = this;

        NetwalkView2 view = new NetwalkView2(getApplicationContext());
        setContentView(view);
    }
}