//Crie um vetor com 5 nomes e exiba todos eles.
//Peça 5 números ao usuário e calcule a média.
//Exiba o maior e o menor número de um vetor de 10 elementos.

package Basico;


import java.util.Arrays;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Família Caixeta:");
        String nomes[] = {"Guilherme", "Beatriz", "Wanderley", "José", "Maria Magnólia"};
        System.out.println(Arrays.toString(nomes));
        System.out.println("---------------------------------------------------------");
        double soma = 0;
        int numeros = 5;

        for (int i = 1; i <= numeros; i++) {
            System.out.println("Digite o " + i + " ° número:");
            double numero = scanner.nextDouble();
            soma += numero;
        }
        double media = soma / numeros;
        System.out.println("A média dos números digitados é: " + media);
        System.out.println("------------------------------------");

        int[] MeusNumeros = new int[10];
        for (int i = 0; i < MeusNumeros.length; i++) {
            System.out.println("Digite o " + (i + 1) + " ° número ");
            MeusNumeros[i] = scanner.nextInt();
        }
        int maior = MeusNumeros[0];
        int menor = MeusNumeros[0];
        for (int i = 1; i < MeusNumeros.length; i++) {
            if (MeusNumeros[i] > maior) {
                maior = MeusNumeros[i];
            }
            if (MeusNumeros[i] < menor) {
                menor = MeusNumeros[i];
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
scanner.close();

    }
}
