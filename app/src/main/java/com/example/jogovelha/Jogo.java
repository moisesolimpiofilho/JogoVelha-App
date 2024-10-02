package com.example.jogovelha;

import java.io.Serializable;

public class Jogo implements Serializable {

    private String nomeJogador1;
    private String nomeJogador2;
    private String jogadorAtual;
    private String nomeDoVencedor;
    private String marcacao;
    private boolean houveGanhador;
    private int qtdeJogadasDisponiveis;

    public Jogo() {
        this.houveGanhador = false;
        this.qtdeJogadasDisponiveis = 9;
        this.marcacao = "X";
        this.nomeDoVencedor = "";
        this.nomeJogador1 = "";
        this.nomeJogador2 = "";
        this.jogadorAtual = "";
    }

    public String getNomeJogador1() {
        return nomeJogador1;
    }

    public void setNomeJogador1(String nomeJogador1) {
        this.nomeJogador1 = nomeJogador1;
    }

    public String getNomeJogador2() {
        return nomeJogador2;
    }

    public void setNomeJogador2(String nomeJogador2) {
        this.nomeJogador2 = nomeJogador2;
    }

    public String getJogadorAtual() {
        return jogadorAtual;
    }

    public void setJogadorAtual(String jogadorAtual) {
        this.jogadorAtual = jogadorAtual;
    }

    public String getNomeDoVencedor() {
        return nomeDoVencedor;
    }

    public void setNomeDoVencedor(String nomeDoVencedor) {
        this.nomeDoVencedor = nomeDoVencedor;
    }

    public String getMarcacao() {
        return marcacao;
    }

    public void setMarcacao(String marcacao) {
        this.marcacao = marcacao;
    }

    public boolean isHouveGanhador() {
        return houveGanhador;
    }

    public void setHouveGanhador(boolean houveGanhador) {
        this.houveGanhador = houveGanhador;
    }

    public int getQtdeJogadasDisponiveis() {
        return qtdeJogadasDisponiveis;
    }

    public void setQtdeJogadasDisponiveis(int qtdeJogadasDisponiveis) {
        this.qtdeJogadasDisponiveis = qtdeJogadasDisponiveis;
    }

    public void alterarMarcacao() {
        if (this.marcacao.equals("X")) this.marcacao = "O";
        else this.marcacao = "X";
    }

    public void alterarJogador() {
        if (this.jogadorAtual.equals(this.nomeJogador1)) {
            this.jogadorAtual = this.nomeJogador2;
        } else {
            this.jogadorAtual = this.nomeJogador1;
        }
    }
}