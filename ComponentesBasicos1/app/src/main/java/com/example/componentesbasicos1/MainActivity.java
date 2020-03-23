package com.example.componentesbasicos1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    TextView txProduto, txCores;
    EditText edNome;
    CheckBox ckBranco, ckVerde, ckVermelho;

    //Cria lista de tamanho dinâmico
    List<String> lista = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txProduto = findViewById(R.id.txProduto);
        txCores = findViewById(R.id.txCores);
        edNome = findViewById(R.id.edNome);
        ckBranco = findViewById(R.id.ckBranco);
        ckVerde = findViewById(R.id.ckVerde);
        ckVermelho = findViewById(R.id.ckVermelho);
    }

    public void  enviar (View view) {
        //passar o nome do produto para o txProduto
        txProduto.setText(edNome.getText().toString());

        //passar as cores selecionadas para o txCores
        verificarChecks(); // verifica as cores escolhidas e preenche a lista
        txCores.setText(lista.toString());
    }

    public void verificarChecks() {
        lista.clear();
        if (ckBranco.isChecked()) {
            lista.add(ckBranco.getText().toString());
        }
        if (ckVerde.isChecked()) {
            lista.add(ckVerde.getText().toString());
        }
        if (ckVermelho.isChecked()) {
            lista.add(ckVermelho.getText().toString());
        }
    }
}
