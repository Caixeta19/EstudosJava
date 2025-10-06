//4. Estruturas de Repetição
//Exiba os números de 1 a 10 usando um for.
//Exiba os números pares de 0 a 20 usando while.
//Peça ao usuário um número e exiba sua tabuada (de 1 a 10).
//Calcule a soma de todos os números de 1 até N, onde N é informado pelo usuário.
package Basico;
import java.util.Scanner;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Números de 1 a 10 usando for
        System.out.println("Números de 1 a 10:");
        for (int n = 1; n <= 10; n++) {
            System.out.println(n);
        }
        System.out.println("---------------");

        // 2. Números pares de 0 a 20 usando while
        System.out.println("Números pares de 0 a 20:");
        int i = 0;
        while (i <= 20) {
            System.out.println(i);
            i += 2; // incrementa de 2 em 2
        }
        System.out.println("---------------");

        // 3. Tabuada
        System.out.println("Digite um número para ver a tabuada:");
        int numero = scanner.nextInt();
        System.out.println("Tabuada do " + numero + ":");
        for (int i1 = 1; i1 <= 10; i1++) {
            System.out.println(numero + " x " + i1 + " = " + (numero * i1));
        }
        System.out.println("---------------");

        // 4. Soma de 1 até N
        System.out.println("Digite um número N para calcularmos a soma de 1 até N:");
        int N = scanner.nextInt();
        int soma = 0;
        for (int g = 1; g<= N;g++){
            soma+=g;
        }
        System.out.println(" A soma de 1 até "+ N + " é igual a: " + soma);
        scanner.close();
    }
}
