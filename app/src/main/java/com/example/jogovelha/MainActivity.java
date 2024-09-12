package com.example.jogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Som.executar(this, R.raw.start);

        ImageButton imageButtonAvancar = findViewById(R.id.imageButtonAvancar);
        imageButtonAvancar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.imageButtonAvancar) {
            Intent telaJogador = new Intent(this, Jogador1Activity.class);
            startActivity(telaJogador);
        }
    }
}