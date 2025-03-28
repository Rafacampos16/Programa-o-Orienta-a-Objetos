/*
 * CalculadeiraVerdadeira.java
 * 
 */

import java.util.Scanner;

public class CalculadeiraVerdadeira {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int n1 = 0, n2 = 0, opcao;
		
		do {
			
			menu();
			
			opcao = leia.nextInt();
			
			switch (opcao) {
				case 1:
					System.out.print("Entre com o primeiro numero: ");
					n1 = leia.nextInt();
					break;
				case 2:
					System.out.print("Entre com o segundo numero: ");
					n2 = leia.nextInt();
					break;
				case 3:
					System.out.println("Soma: " + soma(n1, n2));
					break;
				case 4:
					System.out.println("Diferenca: " + sub(n1, n2));
					break;
				case 5:
					System.out.println("Produto: " + mult(n1, n2));
					break;				
				case 6:
					System.out.println("Divisao: : " + div(n1, n2));
					break;
				case 7:
					System.out.println("Fim do programa!");
					break;
				default:
					System.out.println("Opcao invalida!!");
			}
			
		} while ( opcao != 7);
		
	}
	
	// Menu
	static void menu (){
		
		System.out.println("=========================");
		System.out.println(" M E N U ");
		System.out.println("=========================");
		System.out.println("1) Entrar com numero 1");
		System.out.println("2) Entrar com numero 2");
		System.out.println("3) Somar");
		System.out.println("4) Subtrair");
		System.out.println("5) Multiplicar");
		System.out.println("6) Dividir");
		System.out.println("7) Sair");
		System.out.println("========================");
		System.out.print("Opcao: ");
		
	}
	
	// Soma
	static int soma(int n1, int n2) {
	
		return n1 + n2;
		
	}
	
	// Subtração
	static int sub(int n1, int n2) {
	
		return n1 - n2;
		
	}
	
	// Multiplicação
	static int mult(int n1, int n2) {
	
		return n1 * n2;
		
	}
	
	// Divisão
	static double div(int n1, int n2) {
	
		return (double) n1 / n2;
		
	}
}
