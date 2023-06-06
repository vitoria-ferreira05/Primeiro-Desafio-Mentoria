package Calculadora;

import java.util.Scanner;

public class Subtracao implements Calculadora {
    public static int contador = 0;
    private int primeiroNumero, segundoNumero;

    public Subtracao() {

    }

    public int getPrimeiroNumero() {
        return primeiroNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    @Override
    public void calcularOperacoes() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        primeiroNumero = sc.nextInt();
        System.out.print("Digite o segundo numero: ");
        segundoNumero = sc.nextInt();
        int subtracao = getPrimeiroNumero() - getSegundoNumero();
        System.out.println(primeiroNumero + " - " + segundoNumero + " = " + subtracao);
    }

    @Override
    public int contador() {
        return Subtracao.contador = Subtracao.contador + 1;
    }
}
