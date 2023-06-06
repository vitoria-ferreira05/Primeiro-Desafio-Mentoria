package Calculadora;

import java.util.Scanner;

public class Soma implements Calculadora {
    public static int contador = 0;
    private int primeiroNumero, segundoNumero;

    public Soma() {

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
        int soma = getPrimeiroNumero() + getSegundoNumero();
        System.out.println(primeiroNumero + " + " + segundoNumero + " = " + soma);
    }

    @Override
    public int contador() {
        return Soma.contador = Soma.contador + 1;
    }
}
