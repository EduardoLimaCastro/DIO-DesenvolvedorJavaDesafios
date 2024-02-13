package com.dio.Estrutura_de_dados_e_Api_de_streams_em_java;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String Descricao;
    private final LocalDate datainicio = LocalDate.now();
    private final LocalDate datafinal = datainicio.plusDays(45);
    private Set<Dev> inscritos = new HashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public LocalDate getDatainicio() {
        return datainicio;
    }

    public LocalDate getDatafinal() {
        return datafinal;
    }

    public Set<Dev> getInscritos() {
        return inscritos;
    }

    public void setInscritos(Set<Dev> inscritos) {
        this.inscritos = inscritos;
    }

    public Set<Conteudo> getConteudos() {
        return conteudos;
    }

    public void setConteudos(Set<Conteudo> conteudos) {
        this.conteudos = conteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bootcamp bootcamp = (Bootcamp) o;
        return Objects.equals(nome, bootcamp.nome) && Objects.equals(Descricao, bootcamp.Descricao) && Objects.equals(datainicio, bootcamp.datainicio) && Objects.equals(datafinal, bootcamp.datafinal) && Objects.equals(inscritos, bootcamp.inscritos) && Objects.equals(conteudos, bootcamp.conteudos);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nome, Descricao, datainicio, datafinal, inscritos, conteudos);
    }
}
