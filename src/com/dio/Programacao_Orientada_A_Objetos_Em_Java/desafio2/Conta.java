package com.dio.Programacao_Orientada_A_Objetos_Em_Java.desafio2;

public abstract class Conta {

    private static int SEQUENCIAL = 0;
    private static final int AGENCIA_PADRAO = 1;
    protected int numero;
    protected int agencia;
    protected double saldo;

    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.saldo = 0;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if ((saldo - valor) < 0) {
            System.out.println("Saque não permitido, valor acima do saldo disponível");

        }
        else{

            saldo -= valor;
        }
    }



    public String getCliente() {
        return cliente.getNome();
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino) {
        if (saldo < valor) {
            System.out.println("Transferência não permitida, para a conta: " + contaDestino);
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Transferência realizada com sucesso para a conta: " + contaDestino.getNumero()+  " agência: " + contaDestino.getAgencia() );
    }

    public void imprimir() {
        System.out.println("Saldo da conta é: " + this.getSaldo());
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Número: " + this.getNumero());
        System.out.println("Cliente: " + this.getCliente());
    }


}
