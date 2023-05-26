import java.util.Scanner;

public class Calculadora {

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
