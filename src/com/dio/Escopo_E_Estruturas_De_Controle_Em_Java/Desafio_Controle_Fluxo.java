package com.dio.Escopo_E_Estruturas_De_Controle_Em_Java;

import java.util.Scanner;

public class Desafio_Controle_Fluxo {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = sc.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = sc.nextInt();

        try {
            contar(numero1, numero2);
        } catch(ParametrosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
    static void contar(int numero1, int numero2) throws ParametrosInvalidosException{
        int contagem = numero2 - numero1;
        if(contagem <= 0 ){
            throw new ParametrosInvalidosException();
        }
        for (int i=0; i<contagem;i++) {
            System.out.println(i+1);
        }
    }


}
