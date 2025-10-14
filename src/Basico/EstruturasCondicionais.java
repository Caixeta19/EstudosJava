//Peça ao usuário sua idade e diga se ele é maior de idade ou menor de idade.
//Solicite um número e diga se ele é positivo, negativo ou zero.
//Peça ao usuário um número de 1 a 7 e mostre o dia da semana correspondente (1 = Domingo, 2 = Segunda...).
package Basico;
import java.util.Scanner;
public class EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você é menor de idade!");
        }
        System.out.println("-------------------------------");

        System.out.println("Digite um número:");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("O número digitado é positivo!");
        } else if (numero < 0) {
            System.out.println("O número digitado é negativo!");
        } else {
            System.out.println("O número digitado é igual a zero");
        }
        System.out.println("----------------------------------");
            System.out.println("Digite um número de 1 a 7");
            int diasemana = scanner.nextInt();

            if (diasemana == 1){
                System.out.println("Domingo");
            } else if (diasemana == 2) {
                System.out.println("Segunda-Feira");
            } else if (diasemana == 3) {
                System.out.println("Terça-Feira");
            } else if (diasemana == 4) {
                System.out.println("Quarta-Feira");
            } else if (diasemana == 5) {
                System.out.println("Quinta-Feira");
            } else if (diasemana == 6) {
                System.out.println("Sexta-Feira");
            } else if (diasemana == 7) {
                System.out.println("Sábado");
            }
            scanner.close();
    }
    }


