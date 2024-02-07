package com.dio.JavaBasico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

        int numero;
        String agencia;
        String cliente;
        double saldo;
        final DecimalFormat df = new DecimalFormat("0.00");

        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scan.nextLine();
        System.out.println("Por favor, digite o número da sua Conta !");
        numero = scan.nextInt();
        scan.nextLine();
        System.out.println("Por favor, digite o seu nome !");
        cliente = scan.nextLine();
        System.out.println("Por favor, digite o valor do seu saldo !");
        saldo = scan.nextDouble();

    System.out.println("Olá " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +" , conta "+ numero + " e seu saldo " + df.format(saldo) + " já está disponível para saque");
    }
}