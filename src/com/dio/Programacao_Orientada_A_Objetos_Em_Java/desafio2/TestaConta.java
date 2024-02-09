package com.dio.Programacao_Orientada_A_Objetos_Em_Java.desafio2;

public class TestaConta {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Eduardo");
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.sacar(98);
        cc.sacar(50);
        cc.imprimir();

        cp.depositar(5000);
        cp.sacar(500);
        cp.imprimir();

        cp.transferir(500, cc);

        cc.imprimir();
        cp.imprimir();
    }
}
