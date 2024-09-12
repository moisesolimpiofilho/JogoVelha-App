package com.example.jogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Jogador1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogador1);

        Som.parar();
        Som.executar(this, R.raw.keyboard);
    }
}