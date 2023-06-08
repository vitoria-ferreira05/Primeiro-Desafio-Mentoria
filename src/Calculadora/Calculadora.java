package Calculadora;

public abstract class Calculadora {

    private static int contador;

    void calcularOperacoes(int[] valores) {

    }

    static int contador() {
       return Calculadora.contador++;
    }
}


