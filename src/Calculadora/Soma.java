package Calculadora;

public class Soma implements Calculadora {
    private int primeiroNumero, segundoNumero;

    public Soma(int primeiroNumero, int segundoNumero) {
        this.primeiroNumero = primeiroNumero;
        this.segundoNumero = segundoNumero;
    }

    public int getPrimeiroNumero() {
        return primeiroNumero;
    }


    public int getSegundoNumero() {
        return segundoNumero;
    }

    @Override
    public void calcularOperacoes() {
       int soma = getPrimeiroNumero() + getSegundoNumero();
        System.out.println(primeiroNumero + " + " + segundoNumero + " = " + soma );
    }

}
