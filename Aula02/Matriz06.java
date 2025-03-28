
public class Matriz06 {
	
	public static void main (String[] args) {
		
		int vetor[] = {9, 2, 7, 5, 3};

		int[][] matriz = new int [5][];
		
		for (int i = 0; i < matriz.length; i++) {
			
			matriz[i] = new int[vetor[i]];
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}
}

