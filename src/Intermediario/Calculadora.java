//Classe Calculadora
//Crie uma classe Calculadora com métodos:
//somar(int a, int b)
//subtrair(int a, int b)
//multiplicar(int a, int b)
//dividir(int a, int b) (com verificação de divisão por zero).
//Teste no método main.
package Intermediario;

public class Calculadora {
    int a;
    int b;
    int soma;
    int subtracao;
    int multiplicar;
    int divisao;

    public int somar(int a, int b) {
        return a + b;

    }

    public int subtracao(int a, int b) {
        return a - b;
    }

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public double divisao(int a, int b) {
        if (b == 0) {
            System.out.println("Erro Matemático: Não é possível realizar uma divisão por 0");
            return 0;
        } else{
            return(double) a/b;
        }
    }
}
