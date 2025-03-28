import java.util.Scanner;
public class L0Ex06 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int linhas, colunas, valor, contador = 0;
		
		//Linhas
		
		do {
			System.out.print("Entre com a quantidade de Linhas da Matriz: ");
			linhas = scanner.nextInt();
			
			if(linhas < 1 || linhas > 100) {
				System.out.println("\n\tErro! A quantidade de linhas deve estar entre 1 e 100. \n");
			}
		} while (linhas < 1 || linhas > 100);
		
		//Colunas
		
		do {
			System.out.print("Entre com a quantidade de Colunas da Matriz: ");
			colunas = scanner.nextInt();
			
			if(colunas < 1 || colunas > 100) {
				System.out.println("\n\tErro! A quantidade de Colunas deve estar entre 1 e 100. \n");
			}
		} while (colunas < 1 || colunas > 100);
		
		int [][] matriz = new int [linhas] [colunas];
		
		System.out.print("\nEntre com um valor para localizar na Matriz: ");
		valor = scanner.nextInt();
		
		
		
		
		
		//Gerando e imprimindo os elementos da Matriz aleatoriamente
		
		System.out.println("\nMatriz");
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int)(Math.random() * 25) + 1; //1 - 25
				
				System.out.printf(" %3d ",  matriz[i][j] );
			}
			System.out.println();
		}
		
		
	
		
		System.out.println("\nProcurando na Matriz o valor: " + valor);
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j <  matriz[i].length; j++) {
				 if ( matriz[i][j] == valor ) {
					
					contador++;
					
					System.out.printf ( "(%d) posicao [%d][%d]\n", contador, i, j );
				}


				
				
			}
		
		}
			System.out.println("O valor " + valor + "foi encontrado " + contador + " vez(es)." );
			 
		
	}
}

