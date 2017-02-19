package com.example.georgetsulaiman.i7437472;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Hard extends AppCompatActivity {

    static Context mDialogContext=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hard);

        mDialogContext = this;

        NetwalkView3 view = new NetwalkView3(getApplicationContext());
        setContentView(view);
    }
}