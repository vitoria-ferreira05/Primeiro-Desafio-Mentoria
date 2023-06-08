package Calculadora;

public class Multiplicacao extends Calculadora {

    public Multiplicacao() {

    }

    @Override
    public void calcularOperacoes(int[] valores) {
        int multiplicacao = valores[0] * valores[1];
        System.out.println(valores[0] + " * " + valores[1] + " = " + multiplicacao);

        somarContador();
    }
}