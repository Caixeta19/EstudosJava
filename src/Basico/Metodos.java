//Crie um método chamado somar(int a, int b) que retorne a soma dos dois números.
//Crie um método que receba o nome de uma pessoa e retorne uma saudação:
//"Olá, [nome]! Seja bem-vindo."
package Basico;

import java.util.Scanner;

public class Metodos {
    public static int somar(int a, int b) {
        return a + b;
    }
    public static String saudacao(String nome) {
        return "Olá," + nome + "! Seja Bem- Vindo";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 5;
        int num2 = 10;
        int resultadoSoma = somar(5, 10);
        System.out.println("A soma de " + num1 + " + " + num2 + " é igual a: " + resultadoSoma);
        System.out.println("------------------------------------");

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        String mensagem = saudacao(nome);
        System.out.println(mensagem);
        scanner.close();


    }

}

