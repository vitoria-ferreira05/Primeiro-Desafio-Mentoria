package Calculadora;

public class Soma implements Calculadora {

    public static int contador = 0;

    public Soma() {

    }

    @Override
    public void calcularOperacoes(int[] valores) {
        int soma = valores[0] + valores[1];
        System.out.println(valores[0] + " + " + valores[1] + " = " + soma);

        contador();
    }

    @Override
    public int contador() {
        return Soma.contador++;
    }
}
