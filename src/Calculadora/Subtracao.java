package Calculadora;

public class Subtracao implements Calculadora  {
    private int primeiroNumero, segundoNumero;

    public int getPrimeiroNumero() {
        return primeiroNumero;
    }

    public int getSegundoNumero() {
        return segundoNumero;
    }

    public Subtracao(int primeiroNumero, int segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    @Override
    public void calcularOperacoes() {
        int subtracao = getPrimeiroNumero() - getSegundoNumero();
        System.out.println(primeiroNumero + " - " + segundoNumero + " = " + subtracao);
    }
}
