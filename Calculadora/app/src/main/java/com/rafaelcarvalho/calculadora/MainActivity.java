package com.rafaelcarvalho.calculadora;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.rafaelcarvalho.calculadora.R.id.bt_c;
import static com.rafaelcarvalho.calculadora.R.id.bt_1;

public class MainActivity extends Activity implements View.OnClickListener {

    private double operador1;
    private double operador2;

    private String operadores;

    private EditText txt_visor;

    private Button bt_0;
    private Button bt_1;
    private Button bt_2;
    private Button bt_3;
    private Button bt_4;
    private Button bt_5;
    private Button bt_6;
    private Button bt_7;
    private Button bt_8;
    private Button bt_9;
    private Button bt_ponto;
    private Button bt_soma;
    private Button bt_subt;
    private Button bt_multi;
    private Button bt_divi;
    private Button bt_igual;
    private Button bt_limpar;
    private Button bt_sair;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicializar();
        listeners();

    }

    private void inicializar(){
        txt_visor = (EditText) findViewById(R.id.txt_visor);

        bt_0 = (Button) findViewById(R.id.bt_0);
        bt_1 = (Button) findViewById(R.id.bt_1);
        bt_2 = (Button) findViewById(R.id.bt_2);
        bt_3 = (Button) findViewById(R.id.bt_3);
        bt_4 = (Button) findViewById(R.id.bt_4);
        bt_5 = (Button) findViewById(R.id.bt_5);
        bt_6 = (Button) findViewById(R.id.bt_6);
        bt_7 = (Button) findViewById(R.id.bt_7);
        bt_8 = (Button) findViewById(R.id.bt_8);
        bt_9 = (Button) findViewById(R.id.bt_9);
        bt_ponto = (Button) findViewById(R.id.bt_ponto);
        bt_soma = (Button) findViewById(R.id.bt_soma);
        bt_subt = (Button) findViewById(R.id.bt_subt);
        bt_multi = (Button) findViewById(R.id.bt_multi);
        bt_divi = (Button) findViewById(R.id.bt_divi);
        bt_igual = (Button) findViewById(R.id.bt_igual);
        bt_limpar = (Button) findViewById(R.id.bt_c);
        bt_sair = (Button) findViewById(R.id.bt_sair);
    }

    private void listeners(){
        bt_0.setOnClickListener(this);
        bt_1.setOnClickListener(this);
        bt_2.setOnClickListener(this);
        bt_3.setOnClickListener(this);
        bt_4.setOnClickListener(this);
        bt_5.setOnClickListener(this);
        bt_6.setOnClickListener(this);
        bt_7.setOnClickListener(this);
        bt_8.setOnClickListener(this);
        bt_9.setOnClickListener(this);
        bt_limpar.setOnClickListener(this);
        bt_sair.setOnClickListener(this);
        bt_soma.setOnClickListener(this);
        bt_multi.setOnClickListener(this);
        bt_subt.setOnClickListener(this);
        bt_divi.setOnClickListener(this);
        bt_igual.setOnClickListener(this);
        bt_ponto.setOnClickListener(this);
    }

    private void tecladoNumerico(int leNumero){
        if (txt_visor.getText().toString().trim().equals("0.0")){
            limparVisor();
            txt_visor.setText(txt_visor.getText().toString() + String.valueOf(leNumero));
        }
        else {
            txt_visor.setText(txt_visor.getText().toString() + String.valueOf(leNumero));
        }
    }

    private void ponto(String ponto){
        txt_visor.setText(txt_visor.getText().toString() + ponto);
    }

    private void limparVisor(){
        txt_visor.setText("");
    }

    private void operacoes (String operadores){

        this.operadores = operadores;

        if (operadores == "+"){
            operador1 = Double.parseDouble(txt_visor.getText().toString().trim());
            limparVisor();
        }

        else if (operadores == "-"){
            operador1 = Double.parseDouble(txt_visor.getText().toString().trim());
            limparVisor();
        }
        else if (operadores == "*"){
            operador1 = Double.parseDouble(txt_visor.getText().toString().trim());
            limparVisor();
        }
        else if (operadores == "/"){
            operador1 = Double.parseDouble(txt_visor.getText().toString().trim());
            limparVisor();
        }
    }

    private void igual(){
        if (!txt_visor.getText().toString().trim().equals("")){

            if (operadores == "+"){
                operador2 = operador1 + Double.parseDouble(txt_visor.getText().toString().trim());
            }

            else if(operadores == "-"){
                operador2 = operador1 - Double.parseDouble(txt_visor.getText().toString().trim());
            }
            else if(operadores == "*"){
                operador2 = operador1 * Double.parseDouble(txt_visor.getText().toString().trim());
            }
            else if(operadores == "/"){
                if (operador1 == 0){
                    operador2 = 0;
                }

                else {
                    operador2 = operador1 / Double.parseDouble(txt_visor.getText().toString().trim());
                }
            }

            else {
                operador2 =0;
            }

            txt_visor.setText(String.valueOf(operador2));
        }
    }

    private void fechar(){
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);

        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               finish();
            }
        });

        dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });

        dialog.setTitle("Fechar");
        dialog.setMessage("Deseja realmente fechar o aplicativo ? ");
        dialog.setIcon(android.R.drawable.ic_menu_close_clear_cancel);
        dialog.show();
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.bt_0:
                tecladoNumerico(0);
                break;
            case R.id.bt_1:
                tecladoNumerico(1);
                break;
            case R.id.bt_2:
                tecladoNumerico(2);
                break;
            case R.id.bt_3:
                tecladoNumerico(3);
                break;
            case R.id.bt_4:
                tecladoNumerico(4);
                break;
            case R.id.bt_5:
                tecladoNumerico(5);
                break;
            case R.id.bt_6:
                tecladoNumerico(6);
                break;
            case R.id.bt_7:
                tecladoNumerico(7);
                break;
            case R.id.bt_8:
                tecladoNumerico(8);
                break;
            case R.id.bt_9:
                tecladoNumerico(9);
                break;
            case R.id.bt_c:
                limparVisor();
                break;
            case R.id.bt_ponto:
                ponto(".");
                break;
            case R.id.bt_sair:
                fechar();
                break;
            case R.id.bt_soma:
                operacoes("+");
                break;
            case R.id.bt_subt:
                operacoes("-");
                break;
            case R.id.bt_multi:
                operacoes("*");
                break;
            case R.id.bt_divi:
                operacoes("/");
                break;
            case R.id.bt_igual:
                igual();
                break;
        }
    }
}

