/*
 * Matriz05.java
 * 
 */


public class Matriz05 {
	
	public static void main (String[] args) {
		
		int vetor[] = { 9, 2, 7, 5, 3, 8 };
		
		int[][] matriz = new int[ vetor.length ][];
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			matriz[i] = new int[ vetor[i] ];
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
