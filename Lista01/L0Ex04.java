import java.util.Scanner;
public class L0Ex04 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int d [][] , linhas, colunas, tamanhoMaximo;
		
		//Linhas
		
		do {
			System.out.print("Entre com a quantidade de Linhas da Matriz D: ");
			linhas = scanner.nextInt();
			
			if(linhas < 1 || linhas > 100) {
				System.out.println("\n\tErro! A quantidade de linhas deve estar entre 1 e 100. \n");
			}
		} while (linhas < 1 || linhas > 100);
		
		//Colunas
		
		do {
			System.out.print("Entre com a quantidade de Colunas da Matriz D: ");
			colunas = scanner.nextInt();
			
			if(colunas < 1 || colunas > 100) {
				System.out.println("\n\tErro! A quantidade de Colunas deve estar entre 1 e 100. \n");
			}
		} while (colunas < 1 || colunas > 100);
		
		d = new int [linhas] [colunas];
		
		//Tamanho Maximo
		
		do {
			System.out.print("Entre com o Tamanho Maximo dos elementos da Matriz D: ");
			tamanhoMaximo = scanner.nextInt();
			
			if(tamanhoMaximo < 1) {
				System.out.println("\n\tErro! O Tamanho Maximo deve ser maior ou igual a 1. \n");
			}
		} while (tamanhoMaximo < 1);
		
		
		
		
		
		//Gerando e imprimindo os elementos da Matriz D aleatoriamente ate o tamanho maximo
		
		
		System.out.println("\nMatriz D Original");
		
		for(int i = 0; i < d.length; i++) {
			for(int j = 0; j < d[i].length; j++) {
				d[i][j] = (int)(Math.random() * tamanhoMaximo) + 1;
				
				System.out.printf(" %3d ", d[i][j] );
			}
			System.out.println();
		}
		
		
	}
}

