package com.dio.Programacao_Orientada_A_Objetos_Em_Java.Ipod;

public class ReprodutorMusical implements Ipod{

    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA");
    }
}
