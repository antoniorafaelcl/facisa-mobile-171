package com.rafaelcarvalho.protocolo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class TableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        Button btn_salvar = (Button) findViewById(R.id.btnSalvar);

        btn_salvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(TableActivity.this, "Salvo com Sucesso", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
