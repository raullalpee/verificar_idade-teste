package dev.raullalpee.verificaIdade;

import java.util.Scanner;

public class Executer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IdadePessoa cliente = new IdadePessoa();

        cliente.setTipoDeConta("Indefinido");
        cliente.setNomePessoa("Seu Nome");

        System.out.println("========================");
        System.out.println("NOME DO CLIENTE: " + cliente.getNomePessoa());
        System.out.println("TIPO DE CONTA: " + cliente.getTipoDeConta());
        System.out.println("========================");

        while (cliente.escolha != 2) {
            System.out.println("----- Menu -----");
            System.out.println("1. Verificar Idade");
            System.out.println("2. Encerrar Programa");
            System.out.println("----------------");
            cliente.escolha = scanner.nextInt();

            if (cliente.escolha == 1) {
                System.out.println("Qual sua Idade?");
                cliente.setIdade(scanner.nextInt());
                if (cliente.getIdade() >= 18) {
                    cliente.verificarIdade();
                } else if (cliente.getIdade() < 18) {
                    cliente.verificarIdade();
                }
            } else if (cliente.escolha == 2) {
                System.out.println("Encerrando Programa...");
            } else if (cliente.escolha >= 3) {
                System.out.println("Não é possível realizar essa ação");
            } else if (cliente.escolha <= 0) {
                System.out.println("Não é possível realizar essa ação");
            }
        }
    }
}