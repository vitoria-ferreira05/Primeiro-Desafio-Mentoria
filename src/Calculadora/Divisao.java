package Calculadora;

public class Divisao extends Calculadora {

    public Divisao() {

    }

    @Override
    public void calcularOperacoes(int[] valores) {
        int divisao = valores[0] / valores[1];
        System.out.println(valores[0] + " / " + valores[1] + " = " + divisao);

        contador();
    }
}
