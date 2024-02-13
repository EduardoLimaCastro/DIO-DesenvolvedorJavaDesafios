package com.dio.Explorando_Padroes_de_Projeto_Java.Puro;

/** SINGLETON */

public class Singleton {


    private static class singletonHolder {
        public static Singleton instancia = new Singleton();
    }

    private Singleton() {
        super();
    }
    public static Singleton getInstancia() {

        return singletonHolder.instancia;
    }
}
