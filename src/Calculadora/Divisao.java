package Calculadora;

import java.util.Scanner;

public class Divisao implements Calculadora {
    static int contador = 0;
    private int primeiroNumero, segundoNumero;
    public Divisao(){

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
        int divisao = getPrimeiroNumero() / getSegundoNumero();
        System.out.println(primeiroNumero + " / " + segundoNumero + " = " + divisao);
    }

    @Override
    public int contador() {
       return Divisao.contador = Divisao.contador + 1;
    }
}
