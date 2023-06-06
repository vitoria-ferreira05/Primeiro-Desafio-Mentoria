package Calculadora;

public class Divisao implements Calculadora {
    static int contador = 0;

    public Divisao() {

    }

    @Override
    public void calcularOperacoes(int[] valores) {
        int divisao = valores[0] / valores[1];
        System.out.println(valores[0] + " / " + valores[1] + " = " + divisao);

        contador();
    }

    @Override
    public int contador() {
        return Divisao.contador++;
    }
}
