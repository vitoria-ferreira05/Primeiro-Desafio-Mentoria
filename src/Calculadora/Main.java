package Calculadora;

import java.util.Scanner;

import static Calculadora.QuantidadeOperacoes.quantidadeDeOperacoesRealizadadas;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QuantidadeOperacoes qtdadeOperacoes = new QuantidadeOperacoes();

        while (true) {
            System.out.println("---CALCULADORA--- \n" +
                    "Qual operacao deseja realizar? \n" +
                    "1. Somar \n" +
                    "2. Subtrair \n" +
                    "3. Multiplicar \n" +
                    "4. Dividir \n" +
                    "5. Verificar quantas operações foram realizadas \n" +
                    "6. Sair");

            int operacao = sc.nextInt();

            switch (operacao) {
                case 1:
                    Soma soma = new Soma(2, 2);
                    soma.calcularOperacoes();
                    break;
                case 2:
                    Subtracao subtracao = new Subtracao(3, 2);
                    subtracao.calcularOperacoes();
                    break;
                case 3:
                    Multiplicacao multiplicacao = new Multiplicacao(5, 5);
                    multiplicacao.calcularOperacoes();
                    break;
                case 4:
                    Divisao divisao = new Divisao(10, 5);
                    divisao.calcularOperacoes();
                    break;
                case 5:
                    quantidadeDeOperacoesRealizadadas();
                case 6:
                    System.out.println("A calculadora foi encerrada!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Esta opcao esta incorreta, digite novamente.");
                    break;
            }
        }
    }

}
