
public class Matriz07 {
	
	public static void main (String[] args) {
		
		

		int[][] matriz =
			{
					{1, 2, 3, 4, 5, 6, 7, 8, 9},
					{1, 3, 5, 7, 9},
					{2, 3, 5, 7},
					{9, 4, 2, 6, 3}
			};
		
		for (int i = 0; i < matriz.length; i++) {
			
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
			
		}
		
	}
}

