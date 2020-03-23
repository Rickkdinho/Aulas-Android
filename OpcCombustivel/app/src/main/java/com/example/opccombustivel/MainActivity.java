package com.example.opccombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText pAlcool, pGasolina;
    TextView txResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pAlcool = findViewById(R.id.pAlcool);
        pGasolina = findViewById(R.id.pGasolina);
        txResultado = findViewById(R.id.txResultado);
    }

    public void calcular (View view) {

        double precoA = Double.parseDouble(pAlcool.getText().toString());
        double precoG = Double.parseDouble(pGasolina.getText().toString());
        double resultado;

        resultado = precoA/precoG;

        if (resultado < 0.7) {
            txResultado.setText("O Álcool é a melhor opção para abastecer");
        } else {
            txResultado.setText("A Gasolina é a melhor opção para abastecer");
        }

    }
}
