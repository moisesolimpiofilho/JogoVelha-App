package com.example.jogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
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
            Intent telaJogo = new Intent(this, JogoActivity.class);
            startActivity(telaJogo);
        }
    }
}