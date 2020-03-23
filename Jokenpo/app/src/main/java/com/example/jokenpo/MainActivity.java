package com.example.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void papel (View view) {

        ImageView enemy = findViewById(R.id.enemy);
        ImageView player = findViewById(R.id.player);

        TextView txtResultado = findViewById(R.id.txtResultado);

        int papel = new Random().nextInt(3) + 1;

        switch (papel) {
            case 1:
                player.setImageResource(R.drawable.papel);
                enemy.setImageResource(R.drawable.pedra);
                txtResultado.setText("Você ganhou!!!");
                break;
            case 2:
                player.setImageResource(R.drawable.papel);
                enemy.setImageResource(R.drawable.papel);
                txtResultado.setText("Você empatou!!!");
                break;
            case 3:
                player.setImageResource(R.drawable.papel);
                enemy.setImageResource(R.drawable.tesoura);
                txtResultado.setText("Você perdeu!!!");
                break;
        }

    }

    public void pedra (View view) {

        ImageView enemy = findViewById(R.id.enemy);
        ImageView player = findViewById(R.id.player);

        TextView txtResultado = findViewById(R.id.txtResultado);

        int pedra = new Random().nextInt(3) + 1;

        switch (pedra) {
            case 1:
                player.setImageResource(R.drawable.pedra);
                enemy.setImageResource(R.drawable.pedra);
                txtResultado.setText("Você empatou!!!");
                break;
            case 2:
                player.setImageResource(R.drawable.pedra);
                enemy.setImageResource(R.drawable.papel);
                txtResultado.setText("Você perdeu!!!");
                break;
            case 3:
                player.setImageResource(R.drawable.pedra);
                enemy.setImageResource(R.drawable.tesoura);
                txtResultado.setText("Você ganhou!!!");
                break;
        }
    }

    public void tesoura (View view) {

        ImageView enemy = findViewById(R.id.enemy);
        ImageView player = findViewById(R.id.player);

        TextView txtResultado = findViewById(R.id.txtResultado);

        int tesoura = new Random().nextInt(3) + 1;

        switch (tesoura) {
            case 1:
                player.setImageResource(R.drawable.tesoura);
                enemy.setImageResource(R.drawable.pedra);
                txtResultado.setText("Você perdeu!!!");
                break;
            case 2:
                player.setImageResource(R.drawable.tesoura);
                enemy.setImageResource(R.drawable.papel);
                txtResultado.setText("Você ganhou!!!");
                break;
            case 3:
                player.setImageResource(R.drawable.tesoura);
                enemy.setImageResource(R.drawable.tesoura);
                txtResultado.setText("Você empatou!!!");
                break;
        }
    }
}
