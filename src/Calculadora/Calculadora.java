package Calculadora;

public abstract class Calculadora {

    private static int contador;

    void calcularOperacoes(int[] valores) {

    }

    static int somarContador() {
       return contador++;
    }

    static int getContador(){
        return contador;
    }
}


