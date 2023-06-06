package Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

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
                    soma.calcularOperacoes();
                    soma.contador();
                    break;
                case 2:
                    subtracao.calcularOperacoes();
                    subtracao.contador();
                    break;
                case 3:
                    multiplicacao.calcularOperacoes();
                    multiplicacao.contador();
                    break;
                case 4:
                    divisao.calcularOperacoes();
                    divisao.contador();
                    break;
                case 5:
                    System.out.println(Soma.contador + Multiplicacao.contador + Divisao.contador + Subtracao.contador);
                    break;
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
