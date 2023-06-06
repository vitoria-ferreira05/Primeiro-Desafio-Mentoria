package Calculadora;

public class Multiplicacao implements Calculadora {
    static int contador = 0;

    public Multiplicacao() {

    }

    @Override
    public void calcularOperacoes(int[] valores) {
        int multiplicacao = valores[0] * valores[1];
        System.out.println(valores[0] + " * " + valores[1] + " = " + multiplicacao);

        contador();
    }

    @Override
    public int contador() {
        return Multiplicacao.contador++;
    }
}
