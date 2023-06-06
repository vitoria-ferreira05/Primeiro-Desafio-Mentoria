package Calculadora;

public class Subtracao implements Calculadora {
    public static int contador = 0;

    public Subtracao() {

    }

    @Override
    public void calcularOperacoes(int[] valores) {
        int subtracao = valores[0] - valores[1];
        System.out.println(valores[0] + " - " + valores[1] + " = " + subtracao);

        contador();
    }

    @Override
    public int contador() {
        return Subtracao.contador++;
    }
}
