package com.example.jogovelha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class JogoActivity extends AppCompatActivity implements View.OnClickListener {

    public Button button0, button1, button2, button3, button4;
    private Button button5, button6, button7, button8;
    private Jogo jogo;
    private TextView textViewJogadorAtual;
    private String tabuleiro[][] = {
            {"_", "_", "_"},
            {"_", "_", "_"},
            {"_", "_", "_"}
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogo);

        Som.parar();
        Som.executar(this, R.raw.sinister);

        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);

        textViewJogadorAtual = findViewById(R.id.textViewJogadorAtual);

        setarJogadores();
    }

    private void setarJogadores() {
        Intent telaJogador2 = getIntent();
        jogo = (Jogo) telaJogador2.getSerializableExtra("jogo");

        TextView textViewJogadores = findViewById(R.id.textViewJogadores);
        String jogadores = jogo.getNomeJogador1()
                .concat(" VS ")
                .concat(jogo.getNomeJogador2());
        textViewJogadores.setText(jogadores);

        String jogadorAtual = "Jogando ".concat(jogo.getNomeJogador1());
        textViewJogadorAtual.setText(jogadorAtual);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button0) {
            button0.setText(jogo.getMarcacao());
            tabuleiro[0][0] = jogo.getMarcacao();
        } else if (v.getId() == R.id.button1) {
            button1.setText(jogo.getMarcacao());
            tabuleiro[0][1] = jogo.getMarcacao();
        } else if (v.getId() == R.id.button2) {
            button2.setText(jogo.getMarcacao());
            tabuleiro[0][2] = jogo.getMarcacao();
        } else if (v.getId() == R.id.button3) {
            button3.setText(jogo.getMarcacao());
            tabuleiro[1][0] = jogo.getMarcacao();
        } else if (v.getId() == R.id.button4) {
            button4.setText(jogo.getMarcacao());
            tabuleiro[1][1] = jogo.getMarcacao();
        } else if (v.getId() == R.id.button5) {
            button5.setText(jogo.getMarcacao());
            tabuleiro[1][2] = jogo.getMarcacao();
        } else if (v.getId() == R.id.button6) {
            button6.setText(jogo.getMarcacao());
            tabuleiro[2][0] = jogo.getMarcacao();
        } else if (v.getId() == R.id.button7) {
            button7.setText(jogo.getMarcacao());
            tabuleiro[2][1] = jogo.getMarcacao();
        } else if (v.getId() == R.id.button8) {
            button8.setText(jogo.getMarcacao());
            tabuleiro[2][2] = jogo.getMarcacao();
        }

        int numeroJogadas = jogo.getQtdeJogadasDisponiveis() - 1;
        jogo.setQtdeJogadasDisponiveis(numeroJogadas);

        verificarGanhador();
    }

    private void verificarGanhador() {
        if (tabuleiro[0][0].equals(jogo.getMarcacao()) &&
            tabuleiro[0][1].equals(jogo.getMarcacao()) &&
            tabuleiro[0][2].equals(jogo.getMarcacao())) {
            jogo.setHouveGanhador(true);
        } else if (tabuleiro[1][0].equals(jogo.getMarcacao()) &&
                tabuleiro[1][1].equals(jogo.getMarcacao()) &&
                tabuleiro[1][2].equals(jogo.getMarcacao())) {
            jogo.setHouveGanhador(true);
        } else if (tabuleiro[2][0].equals(jogo.getMarcacao()) &&
                tabuleiro[2][1].equals(jogo.getMarcacao()) &&
                tabuleiro[2][2].equals(jogo.getMarcacao())) {
            jogo.setHouveGanhador(true);
        } else if (tabuleiro[0][0].equals(jogo.getMarcacao()) &&
                tabuleiro[1][0].equals(jogo.getMarcacao()) &&
                tabuleiro[2][0].equals(jogo.getMarcacao())) {
            jogo.setHouveGanhador(true);
        } else if (tabuleiro[0][1].equals(jogo.getMarcacao()) &&
                tabuleiro[1][1].equals(jogo.getMarcacao()) &&
                tabuleiro[2][1].equals(jogo.getMarcacao())) {
            jogo.setHouveGanhador(true);
        } else if (tabuleiro[0][2].equals(jogo.getMarcacao()) &&
                tabuleiro[1][2].equals(jogo.getMarcacao()) &&
                tabuleiro[2][2].equals(jogo.getMarcacao())) {
            jogo.setHouveGanhador(true);
        } else if (tabuleiro[0][0].equals(jogo.getMarcacao()) &&
                tabuleiro[1][1].equals(jogo.getMarcacao()) &&
                tabuleiro[2][2].equals(jogo.getMarcacao())) {
            jogo.setHouveGanhador(true);
        } else if (tabuleiro[0][2].equals(jogo.getMarcacao()) &&
                tabuleiro[1][1].equals(jogo.getMarcacao()) &&
                tabuleiro[2][0].equals(jogo.getMarcacao())) {
            jogo.setHouveGanhador(true);
        }

        if (jogo.isHouveGanhador() || jogo.getQtdeJogadasDisponiveis() == 0) {
            showModal();
        } else {
            jogo.alterarMarcacao();
            jogo.alterarJogador();
            textViewJogadorAtual.setText("Jogando: ".concat(jogo.getJogadorAtual()));
        }

    }

    private void showModal() {
        Som.parar();
        Som.executar(this, R.raw.success);
    }



}