import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int operacao;
        int primeiroNumero = 2, segundoNumero = 3;
        do {
            System.out.println("---CALCULADORA--- \n" +
                    "Qual operacao deseja realizar? \n" +
                    "1. Somar \n" +
                    "2. Subtrair \n" +
                    "3. Multiplicar \n" +
                    "4. Dividir \n" +
                    "5. Sair");

            operacao = sc.nextInt();

//            System.out.print("Digite o primeiro numero: ");
//            int primeiroNumero = sc.nextInt();
//
//            System.out.print("Digite o segundo numero: ");
//            int segundoNumero = sc.nextInt();

            switch (operacao) {
                case 1:
                    int resultadoSoma = operacaoSoma(primeiroNumero, segundoNumero);
                    System.out.println(primeiroNumero + " + " + segundoNumero + " = " + resultadoSoma);
                    break;
                case 2:
                    int resultadoSubtracao = operacaoSubtrair(primeiroNumero, segundoNumero);
                    System.out.println(primeiroNumero + " - " + segundoNumero + " = " + resultadoSubtracao);
                    break;
                case 3:
                    int resultadoMulticacao = operacaoMultiplicar(primeiroNumero, segundoNumero);
                    System.out.println(primeiroNumero + " * " + segundoNumero + " = " + resultadoMulticacao);
                    break;
                case 4:
                    int resultadoDivisao = operacaoDividir(primeiroNumero, segundoNumero);
                    System.out.println(primeiroNumero + " / " + segundoNumero + " = " + resultadoDivisao);
                    break;
                case 5:
                    System.out.println("A calculadora foi encerrada!");
                    break;
                default:
                    System.out.println("Esta opcao esta incorreta, digite novamente.");
            }
        } while (operacao != 5);
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
}
