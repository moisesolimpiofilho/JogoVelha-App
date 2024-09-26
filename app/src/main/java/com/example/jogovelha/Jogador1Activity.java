package com.example.jogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
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

            EditText etJogador1 = findViewById(R.id.etJogador1);

            Jogo jogo = new Jogo();
            jogo.setNomeJogador1(etJogador1.getText().toString());

            Intent telaJogador2 = new Intent(this, Jogador2Activity.class);
            telaJogador2.putExtra("jogo", jogo);

            startActivity(telaJogador2);
            finish();
        }
    }
}