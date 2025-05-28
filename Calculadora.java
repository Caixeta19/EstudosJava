package Exercicios;
import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1;
		int n2;
		int soma;
		int mult;
		int div;
		int subtracao;
		int operacao;
		double resultado;
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Digite  um número:");
		n1 = numero.nextInt();
		System.out.println("Digite outro número:");
		n2 = numero.nextInt();
		
		System.out.println("------Calculadora-------");
		System.out.println("1- Soma");
		System.out.println("-------------------");
		System.out.println("2- Subtração");
		System.out.println("-------------------");
        System.out.println("3- Multiplicação");
        System.out.println("-------------------");
        System.out.println("4- Divisão");
        System.out.println("-------------------");
        System.out.println("5- Potenciação");
        System.out.println("-------------------");
        System.out.println("6- Exponenciação");
        System.out.println("-------------------");
        
        System.out.println("Digite a operação:");
        
        operacao = numero.nextInt();
        
        switch (operacao) {
        case 1:
        	resultado = n1 + n2;
        	System.out.println("O resultado da soma é:"+ resultado);
        break;
        case 2:
        	resultado = n1 - n2;
        	System.out.println("O resultado da subtração é:" + resultado);
        break; 	
        case 3:
        	resultado = n1 * n2;
        	System.out.println("O resultado da multiplicação é:" + resultado);
        break;	
        case 4:
        	resultado = n1/n2;
        	System.out.println("O resultado da divisão é:" + resultado);
        case 5:
        	resultado = Math.pow(n1, n2);
        	System.out.println("O resultado da potenciação é:" + resultado);
        	break;
        case 6:
        	resultado = Math.sqrt(n1);
        	System.out.println("A raiz quadrada de "+ n1 + ":" +resultado);
        	break;
        	
        }
        
		
	}

}
