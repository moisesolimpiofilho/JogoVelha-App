package com.example.jogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

public class Jogador2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogador2);

        ImageButton ib2 = findViewById(R.id.ib2);
        ib2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.ib2) {

            EditText etJogador2 = findViewById(R.id.etJogador2);

            Intent telaAnterior = getIntent();
            Jogo jogo = (Jogo) telaAnterior.getSerializableExtra("jogo");
            jogo.setNomeJogador2(etJogador2.getText().toString());

            Intent telaJogo = new Intent(this, JogoActivity.class);
            telaJogo.putExtra("jogo", jogo);
            startActivity(telaJogo);
            finish();
        }
    }
}