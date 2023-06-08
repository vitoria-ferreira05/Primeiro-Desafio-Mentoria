package Calculadora;

import java.util.Scanner;

import static Calculadora.Calculadora.getContador;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Soma soma = new Soma();
    private static Subtracao subtracao = new Subtracao();
    private static Multiplicacao multiplicacao = new Multiplicacao();
    private static Divisao divisao = new Divisao();

    public static void main(String[] args) {

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
                    soma.calcularOperacoes(getValoresDoUsuario());
                    break;
                case 2:
                    subtracao.calcularOperacoes(getValoresDoUsuario());
                    break;
                case 3:
                    multiplicacao.calcularOperacoes(getValoresDoUsuario());
                    break;
                case 4:
                    divisao.calcularOperacoes(getValoresDoUsuario());
                    break;
                case 5:
                    System.out.println(getContador());
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

    public static int[] getValoresDoUsuario() {
        int[] valores = new int[2];
        System.out.print("Digite o primeiro numero: ");
        valores[0] = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        valores[1] = sc.nextInt();

        return valores;
    }
}
