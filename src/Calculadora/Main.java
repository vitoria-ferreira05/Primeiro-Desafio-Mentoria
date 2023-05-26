import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int operacao;
        int qtdadeOperacoes = 0;
        int primeiroNumero = 0;
        int segundoNumero = 0;

        do {
            System.out.println("---CALCULADORA--- \n" +
                    "Qual operacao deseja realizar? \n" +
                    "1. Somar \n" +
                    "2. Subtrair \n" +
                    "3. Multiplicar \n" +
                    "4. Dividir \n" +
                    "5. Verificar quantas operações foram realizadas \n" +
                    "6. Sair");

            operacao = sc.nextInt();

            switch (operacao) {
                case 1:
                    primeiroNumero = Calculadora.entradaDeValoresDoUsuario();
                    segundoNumero = Calculadora.entradaDeValoresDoUsuario();
                    int resultadoSoma = Calculadora.operacaoSoma(primeiroNumero, segundoNumero);
                    System.out.println(primeiroNumero + " + " + segundoNumero + " = " + resultadoSoma);
                    qtdadeOperacoes++;
                    break;
                case 2:
                    primeiroNumero = Calculadora.entradaDeValoresDoUsuario();
                    segundoNumero = Calculadora.entradaDeValoresDoUsuario();
                    int resultadoSubtracao = Calculadora.operacaoSubtrair(primeiroNumero, segundoNumero);
                    System.out.println(primeiroNumero + " - " + segundoNumero + " = " + resultadoSubtracao);
                    qtdadeOperacoes++;
                    break;
                case 3:
                    primeiroNumero = Calculadora.entradaDeValoresDoUsuario();
                    segundoNumero = Calculadora.entradaDeValoresDoUsuario();
                    int resultadoMulticacao = Calculadora.operacaoMultiplicar(primeiroNumero, segundoNumero);
                    System.out.println(primeiroNumero + " * " + segundoNumero + " = " + resultadoMulticacao);
                    qtdadeOperacoes++;
                    break;
                case 4:
                    primeiroNumero = Calculadora.entradaDeValoresDoUsuario();
                    segundoNumero = Calculadora.entradaDeValoresDoUsuario();
                    int resultadoDivisao = Calculadora.operacaoDividir(primeiroNumero, segundoNumero);
                    System.out.println(primeiroNumero + " / " + segundoNumero + " = " + resultadoDivisao);
                    qtdadeOperacoes++;
                    break;
                case 5:
                    Calculadora.quantidadeDeOperacoesRealizadadas(qtdadeOperacoes);
                    break;
                case 6:
                    System.out.println("A calculadora foi encerrada!");
                    break;
                default:
                    System.out.println("Esta opcao esta incorreta, digite novamente.");
            }
        } while (operacao != 6);
    }


}
