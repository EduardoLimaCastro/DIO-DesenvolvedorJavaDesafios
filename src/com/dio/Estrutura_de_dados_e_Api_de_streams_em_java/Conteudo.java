package com.dio.Estrutura_de_dados_e_Api_de_streams_em_java;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 10d;
    protected String titulo;
    protected String descricao;

    public Conteudo() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXp();

}
