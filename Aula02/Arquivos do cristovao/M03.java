/*
 * Matriz03.java
 * 
 */


public class M03 {
	
	public static void main (String[] args) {
		
		int[][] matriz = new int[5][];
		
		matriz[0] = new int[10];
		matriz[1] = new int[2];
		matriz[2] = new int[7];
		matriz[3] = new int[5];
		matriz[4] = new int[8];
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				System.out.print(matriz[i][j] + " ");
			}
			
			System.out.println();
		}
	}
}
