import java.util.Scanner;
public class L0Ex05 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int linhas, colunas;
		
		//Linhas
		
		do {
			System.out.print("Entre com a quantidade de Linhas da Matrizes: ");
			linhas = scanner.nextInt();
			
			if(linhas < 1 || linhas > 100) {
				System.out.println("\n\tErro! A quantidade de linhas deve estar entre 1 e 100. \n");
			}
		} while (linhas < 1 || linhas > 100);
		
		//Colunas
		
		do {
			System.out.print("Entre com a quantidade de Colunas da Matrizes: ");
			colunas = scanner.nextInt();
			
			if(colunas < 1 || colunas > 100) {
				System.out.println("\n\tErro! A quantidade de Colunas deve estar entre 1 e 100. \n");
			}
		} while (colunas < 1 || colunas > 100);
		
		int [][] matriz1, matriz2, soma; 
		matriz1 = new int [linhas] [colunas];
		matriz2 = new int [linhas] [colunas];
		soma = new int [linhas] [colunas];
		
		
		
		
		
		//Gerando e imprimindo os elementos da Matriz 1 aleatoriamente
		
		System.out.println("\nMatriz 1");
		
		for(int i = 0; i < matriz1.length; i++) {
			for(int j = 0; j < matriz1[i].length; j++) {
				matriz1[i][j] = (int)(Math.random() * 100);
				
				System.out.printf(" %3d ",  matriz1[i][j] );
			}
			System.out.println();
		}
		
		System.out.println("\nMatriz 2");
		
		for(int i = 0; i < matriz2.length; i++) {
			for(int j = 0; j < matriz2[i].length; j++) {
				 matriz2[i][j] = (int)(Math.random() * 100);
				 
				 soma[i][j] = matriz1[i][j] + matriz2[i][j];
				
				System.out.printf(" %3d ",  matriz2[i][j] );
			}
			System.out.println();
		}
		
		System.out.println("\nSoma da Matriz 1 com a Matriz 2");
		
		for(int i = 0; i < soma.length; i++) {
			for(int j = 0; j <  soma[i].length; j++) {
				  
				
				System.out.printf(" %3d ",  soma[i][j] );
			}
			System.out.println();
		}
		
		
	}
}

