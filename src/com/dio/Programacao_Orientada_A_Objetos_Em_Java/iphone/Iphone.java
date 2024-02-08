package com.dio.Programacao_Orientada_A_Objetos_Em_Java.iphone;

import com.dio.Programacao_Orientada_A_Objetos_Em_Java.Ipod.Ipod;
import com.dio.Programacao_Orientada_A_Objetos_Em_Java.phone.Phone;
import com.dio.Programacao_Orientada_A_Objetos_Em_Java.web.Browser;

public class Iphone implements Ipod, Phone, Browser {


    @Override
    public void tocar() {
        System.out.println("TOCANDO MÚSICA COM O IPHONE");
    }

    @Override
    public void pausar() {
        System.out.println("PAUSANDO MÚSICA COM O IPHONE");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA COM O IPHONE");
    }

    @Override
    public void ligar() {
        System.out.println("LIGANDO COM O IPHONE");
    }

    @Override
    public void atender() {
        System.out.println("ATENDENDO COM O IPHONE");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ COM O IPHONE");
    }

    @Override
    public void exibirPagina() {
        System.out.println("EXIBINDO PÁGINA COM O IPHONE");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA COM O IPHONE");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("ATUALIZANDO PÁGINA COM O IPHONE");
    }
}
