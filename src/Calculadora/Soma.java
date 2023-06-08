package Calculadora;

public class Soma extends Calculadora {

    public Soma() {

    }

    @Override
    public void calcularOperacoes(int[] valores) {
        int soma = valores[0] + valores[1];
        System.out.println(valores[0] + " + " + valores[1] + " = " + soma);

        somarContador();
    }
}