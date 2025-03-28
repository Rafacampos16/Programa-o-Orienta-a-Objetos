/*
 * Matriz04.java
 * 
 */


public class Matriz04 {
	
	public static void main (String[] args) {
		
		int[][] matriz = new int[5][];
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			matriz[i] = new int[(int)(Math.random()*9)+1];
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}


