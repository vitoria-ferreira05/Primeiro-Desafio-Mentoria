package Calculadora;

public class Subtracao extends Calculadora {

    public Subtracao() {

    }

    @Override
    public void calcularOperacoes(int[] valores) {
        int subtracao = valores[0] - valores[1];
        System.out.println(valores[0] + " - " + valores[1] + " = " + subtracao);

        contador();
    }
}