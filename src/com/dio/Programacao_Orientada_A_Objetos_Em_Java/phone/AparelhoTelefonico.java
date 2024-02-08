package com.dio.Programacao_Orientada_A_Objetos_Em_Java.phone;

public class AparelhoTelefonico implements Phone{
    @Override
    public void ligar() {
        System.out.println("LIGANDO");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ");
    }
}
