package Calculadora;

import java.util.Scanner;

public class Multiplicacao implements Calculadora {
    static int contador = 0;
    private int primeiroNumero, segundoNumero;

    public Multiplicacao() {

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
        int multiplicacao = getPrimeiroNumero() * getSegundoNumero();
        System.out.println(primeiroNumero + " * " + segundoNumero + " = " + multiplicacao);
    }

    @Override
    public int contador() {
        return Multiplicacao.contador = Multiplicacao.contador + 1;
    }
}
