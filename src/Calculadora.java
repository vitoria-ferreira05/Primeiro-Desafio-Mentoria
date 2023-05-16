import java.util.Scanner;

public class Calculadora {
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
                    primeiroNumero = entradaDeValoresDoUsuario();
                    segundoNumero = entradaDeValoresDoUsuario();
                    int resultadoSoma = operacaoSoma(primeiroNumero, segundoNumero);
                    System.out.println(primeiroNumero + " + " + segundoNumero + " = " + resultadoSoma);
                    qtdadeOperacoes++;
                    break;
                case 2:
                    primeiroNumero = entradaDeValoresDoUsuario();
                    segundoNumero = entradaDeValoresDoUsuario();
                    int resultadoSubtracao = operacaoSubtrair(primeiroNumero, segundoNumero);
                    System.out.println(primeiroNumero + " - " + segundoNumero + " = " + resultadoSubtracao);
                    qtdadeOperacoes++;
                    break;
                case 3:
                    primeiroNumero = entradaDeValoresDoUsuario();
                    segundoNumero = entradaDeValoresDoUsuario();
                    int resultadoMulticacao = operacaoMultiplicar(primeiroNumero, segundoNumero);
                    System.out.println(primeiroNumero + " * " + segundoNumero + " = " + resultadoMulticacao);
                    qtdadeOperacoes++;
                    break;
                case 4:
                    primeiroNumero = entradaDeValoresDoUsuario();
                    segundoNumero = entradaDeValoresDoUsuario();
                    int resultadoDivisao = operacaoDividir(primeiroNumero, segundoNumero);
                    System.out.println(primeiroNumero + " / " + segundoNumero + " = " + resultadoDivisao);
                    qtdadeOperacoes++;
                    break;
                case 5:
                    quantidadeDeOperacoesRealizadadas(qtdadeOperacoes);
                    break;
                case 6:
                    System.out.println("A calculadora foi encerrada!");
                    break;
                default:
                    System.out.println("Esta opcao esta incorreta, digite novamente.");
            }
        } while (operacao != 6);
    }

    public static int operacaoSoma(int primeiroNumero, int segundoNumero) {
        return primeiroNumero + segundoNumero;
    }

    public static int operacaoSubtrair(int primeiroNumero, int segundoNumero) {
        return primeiroNumero - segundoNumero;
    }

    public static int operacaoMultiplicar(int primeiroNumero, int segundoNumero) {
        return primeiroNumero * segundoNumero;
    }

    public static int operacaoDividir(int primeiroNumero, int segundoNumero) {
        return primeiroNumero / segundoNumero;
    }

    public static void quantidadeDeOperacoesRealizadadas(int qtdadeOperacoes) {
        System.out.println("A quantidade de operacoes realizadas na calculadora foi: " + qtdadeOperacoes + " vezes");
    }

    public static int entradaDeValoresDoUsuario() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int numero = sc.nextInt();

        return numero;
    }
}
