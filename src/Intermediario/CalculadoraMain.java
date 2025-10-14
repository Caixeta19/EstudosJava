package Intermediario;

public class CalculadoraMain {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int n1 = 10;
        int n2 = 5;

        System.out.println("Soma: " + calculadora.somar(n1,n2));
        System.out.println("Subtração: " + calculadora.subtracao(n1,n2));
        System.out.println("Multiplicação: " + calculadora.multiplicar(n1,n2));
        System.out.println("Divisão: " + calculadora.divisao(n1,n2));





    }
}
