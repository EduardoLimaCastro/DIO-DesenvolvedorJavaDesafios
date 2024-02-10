package com.dio.Estrutura_de_dados_e_Api_de_streams_em_java;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso(){

    }
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 15d;
    }
}
