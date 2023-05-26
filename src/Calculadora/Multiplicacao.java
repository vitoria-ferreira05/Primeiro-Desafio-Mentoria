package Calculadora;

public class Multiplicacao implements Calculadora {
    private int primeiroNumero, segundoNumero;

    public int getPrimeiroNumero() {
        return primeiroNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public Multiplicacao(int primeiroNumero, int segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    @Override
    public void calcularOperacoes() {
        int multiplicacao = getPrimeiroNumero() * getSegundoNumero();
        System.out.println(primeiroNumero + " * " + segundoNumero + " = " + multiplicacao);
    }

}
