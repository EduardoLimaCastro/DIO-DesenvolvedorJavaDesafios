package com.dio.Explorando_Padroes_de_Projeto_Java.Puro;

public class ComportamentoDefensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo-se Defensivamente");
    }
}
