package com.dio.Programacao_Orientada_A_Objetos_Em_Java.iphone_user;

import com.dio.Programacao_Orientada_A_Objetos_Em_Java.Ipod.Ipod;
import com.dio.Programacao_Orientada_A_Objetos_Em_Java.Ipod.ReprodutorMusical;
import com.dio.Programacao_Orientada_A_Objetos_Em_Java.iphone.Iphone;
import com.dio.Programacao_Orientada_A_Objetos_Em_Java.phone.AparelhoTelefonico;
import com.dio.Programacao_Orientada_A_Objetos_Em_Java.phone.Phone;
import com.dio.Programacao_Orientada_A_Objetos_Em_Java.web.Browser;
import com.dio.Programacao_Orientada_A_Objetos_Em_Java.web.Navegador;

public class Iphone_user {
    public static void main(String[] args) {
        Ipod reprodutor = new ReprodutorMusical();
        Phone cell = new AparelhoTelefonico();
        Browser br = new Navegador();
        Ipod iphonerpr = new Iphone();
        Phone iphonepho = new Iphone();
        Browser iphonerweb = new Iphone();

        reprodutor.tocar();
        reprodutor.pausar();
        reprodutor.selecionarMusica();
        iphonerpr.tocar();
        iphonerpr.pausar();
        iphonerpr.selecionarMusica();
        cell.ligar();
        cell.atender();
        cell.iniciarCorreioVoz();
        iphonepho.ligar();
        iphonepho.atender();
        iphonepho.iniciarCorreioVoz();
        br.adicionarNovaAba();
        br.atualizarPagina();
        br.exibirPagina();
        iphonerweb.adicionarNovaAba();
        iphonerweb.atualizarPagina();
        iphonerweb.exibirPagina();
    }
}
