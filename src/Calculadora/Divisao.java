package Calculadora;

public class Divisao implements Calculadora {
    private int primeiroNumero, segundoNumero;

    public int getPrimeiroNumero() {
        return primeiroNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public Divisao(int primeiroNumero, int segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    @Override
    public void calcularOperacoes() {
     int divisao = getPrimeiroNumero() / getSegundoNumero();
        System.out.println(primeiroNumero + " / " + segundoNumero + " = " + divisao);
    }

}
