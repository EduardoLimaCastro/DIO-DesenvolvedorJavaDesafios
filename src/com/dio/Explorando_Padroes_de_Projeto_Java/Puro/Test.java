package com.dio.Explorando_Padroes_de_Projeto_Java.Puro;

public class Test {
    public static void main(String[] args) {
        Singleton sing = Singleton.getInstancia();
        System.out.println(sing);


        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();
        Comportamento defensivo = new ComportamentoDefensivo();

        Robo robo = new Robo();
        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();

        Facade facade = new Facade();
        facade.migrarCliente("Eduardo","61771800");
    }


}
