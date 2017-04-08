package com.rafaelcarvalho.cariocaeveralda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView tv_numPegacao = (TextView) findViewById(R.id.tv_numPegacao);
        Button btn_pegacao = (Button) findViewById(R.id.btn_pegacao);

        btn_pegacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num_pegacao = Integer.parseInt(tv_numPegacao.getText().toString());
                num_pegacao++;
                tv_numPegacao.setText(String.valueOf(num_pegacao));
            }
        });

    }
}
