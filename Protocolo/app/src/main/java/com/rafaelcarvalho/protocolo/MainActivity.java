package com.rafaelcarvalho.protocolo;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btnFrame,btnRelative,btnTable,btnGrid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFrame = (Button)findViewById(R.id.btnFrame);
        btnRelative = (Button) findViewById(R.id.btnRelative);
        btnTable = (Button) findViewById(R.id.btnTable);
        btnGrid = (Button) findViewById(R.id.btnGrid);


        btnFrame.setOnClickListener(this);
        btnRelative.setOnClickListener(this);
        btnTable.setOnClickListener(this);
        btnGrid.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnTable){
            startActivity(new Intent(this,TableActivity.class));
        }

        else if(v == btnGrid){
            startActivity(new Intent(this,GridActivity.class));
        }

        else if (v == btnRelative){
            startActivity(new Intent(this, RelativeActivity.class));
        }

        else if (v == btnFrame){
            startActivity(new Intent(this,FrameActivity.class));
        }
    }
}
