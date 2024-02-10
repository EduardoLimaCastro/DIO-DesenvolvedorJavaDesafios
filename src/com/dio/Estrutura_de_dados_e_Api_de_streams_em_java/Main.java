package com.dio.Estrutura_de_dados_e_Api_de_streams_em_java;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso sobre Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso sobre JavaScript");
        curso2.setCargaHoraria(6);

        System.out.println(curso1);
        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria Java");
        mentoria1.setDescricao("Mentoria Java na carreira");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        Curso curso3 = new Curso();
        curso3.setTitulo("React");
        curso3.setDescricao("Curso de React");
        curso3.setCargaHoraria(9);

        System.out.println(curso3);

        Bootcamp boot1 = new Bootcamp();
        Dev dev1 = new Dev();
        Dev dev2 = new Dev();

        boot1.setNome("Bootcamp Java");
        boot1.setNome("Bootcamp JavaDeveloper");
        boot1.getConteudos().add(curso1);
        boot1.getConteudos().add(curso2);
        boot1.getConteudos().add(mentoria1);

        dev1.setNome("Eduardo");
        dev1.inscreverBootcamp(boot1);
        System.out.println("Conteúdos inscritos: " + dev1.getNome() +" " + dev1.getConteudosInscritos());
        dev1.progredir();
        System.out.println("Conteúdos conculidos: " + dev1.getNome() +" " + dev1.getConteudosConcluidos());
        System.out.println("XP total: " + dev1.calcularTotalXp());
        dev2.setNome("Manuela");
        dev2.inscreverBootcamp(boot1);
        System.out.println("Conteúdos inscritos: " + dev2.getNome() +" " + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Conteúdos concluidos: " + dev2.getNome() +" " + dev2.getConteudosConcluidos());
        System.out.println("XP total: " + dev2.calcularTotalXp());


    }
}
