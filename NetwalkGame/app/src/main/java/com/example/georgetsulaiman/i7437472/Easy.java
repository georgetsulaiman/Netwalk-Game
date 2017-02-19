package com.example.georgetsulaiman.i7437472;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Easy extends AppCompatActivity {

    static Context mDialogContext=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.easy);

        mDialogContext = this;

        NetwalkView view = new NetwalkView(getApplicationContext());
        setContentView(view);


    }
}

