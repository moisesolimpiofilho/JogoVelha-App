package com.example.jogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Jogador1Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogador1);

        Som.parar();
        Som.executar(this, R.raw.keyboard);

        ImageButton ib1 = findViewById(R.id.ib1);
        ib1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ib1) {
            Intent telaJogador2 = new Intent(this, Jogador2Activity.class);
            startActivity(telaJogador2);
            finish();
        }
    }
}