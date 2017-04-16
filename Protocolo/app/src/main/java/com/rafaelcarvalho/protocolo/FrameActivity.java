package com.rafaelcarvalho.protocolo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class FrameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);
    }

    public void enviar(View v) {
        FrameLayout fl = (FrameLayout) findViewById(R.id.frame2);
        fl.setVisibility(View.VISIBLE);
    }
}
