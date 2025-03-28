/*
 * L0Ex07.java
 * 
 */


import java.util.Scanner;


public class L0Ex07 {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner ( System.in );
		
		int linhas, colunas, maior, menor, contador;
		
		linhas  = (int) ( Math.random() * 10 ) + 1;
		colunas = (int) ( Math.random() * 10 ) + 1;
		 
		int[][] e = new int [ linhas ][ colunas ];
		
		
		// Gerando e imprimindo os elementos da Matriz E aleatoriamente
		
		System.out.println("\nMatriz E[" + linhas + "][" + colunas + "]:");
		
		for ( int i = 0 ; i < e.length ; i++ ) {
			
			for ( int j = 0 ; j < e[i].length ; j++ ) {
				
				e[i][j] = (int) ( Math.random() * 25 ) + 1; // 1 ~ 100
				
				System.out.printf ( "%3d  ", e[i][j] );
			}
			
			System.out.println();
		}
		
		// Determinando quem eh o maior e o menor elemento da Matriz E
		
		maior = menor = e[0][0];
		
		for ( int i = 0 ; i < e.length ; i++ ) {
			
			for ( int j = 0 ; j < e[i].length ; j++ ) {
				
				// Descubro quem eh o menor
				if ( e[i][j] < menor ) {
					
					menor = e[i][j];
				}
				
				// Descubro quem eh o maior
				if ( e[i][j] > maior ) {
					
					maior = e[i][j];
				}
			}
		}
		
		System.out.println("\nMenor elemento: " + menor);
		System.out.println("Maior elemento: " + maior);
		
		
		System.out.println("\nMostrando a posicao do menor elemento da Matriz E");
		
		contador = 0;
		
		for ( int i = 0 ; i < e.length ; i++ ) {
			
			for ( int j = 0 ; j < e[i].length ; j++ ) {
				
				if ( e[i][j] == menor ) {
					
					contador++;
					
					System.out.printf ( "Posicao [%d][%d]\n", i, j );
				}
			}
		}
		
		System.out.println("O menor elemento foi encontrado " + contador + " vez(es).");
		
		
		System.out.println("\nMostrando a posicao do maior elemento da Matriz E");
		
		contador = 0;
		
		for ( int i = 0 ; i < e.length ; i++ ) {
			
			for ( int j = 0 ; j < e[i].length ; j++ ) {
				
				if ( e[i][j] == maior ) {
					
					contador++;
					
					System.out.printf ( "Posicao [%d][%d]\n", i, j );
				}
			}
		}
		
		System.out.println("O maior elemento foi encontrado " + contador + " vez(es).");
	}
}


