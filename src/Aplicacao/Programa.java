package Aplicacao;

import Entidade.Conta;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Conta conta;

        // Programa
        System.out.println("Insira o número da conta: ");
        int numero = sc.nextInt();
        System.out.println("Insira o nome do titular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine();
        System.out.println("Irá depositar algum valor? s/n?");
        char resposta = sc.next().charAt(0);

        if (resposta == 's') {
            System.out.println("Insira a quantia a depositar: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(titular, numero, depositoInicial);
        } else {
            conta = new Conta(titular, numero);

        }
        System.out.println("Dados bancários: ");
        System.out.println(conta);
        System.out.println();

        System.out.println("Gostaria de realizar outra operação? s/n ");
        char newResposta = sc.next().charAt(0);

        if (newResposta == 's') {
            System.out.println("Seria depósito ou saque? d/s");
            sc.nextLine();
            char response = sc.next().charAt(0);

            if (response == 'd') {
                System.out.println("Insira o valor para deposito: ");
                sc.nextLine();
                double valorDeposito = sc.nextDouble();
                conta.deposito(valorDeposito);


            } else {
                System.out.println("Insira o valor para saque: ");
                sc.nextLine();
                double valorSaque = sc.nextDouble();
                conta.saque(valorSaque);



            }
            System.out.println(conta);

            sc.close();
        }
    }
}