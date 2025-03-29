import java.util.Scanner;
public class L0Ex02 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int [][] b = new int [6][3];
		
		//Gerando os elementros da Matriz B aleatoriamente (<100)
		
		
		System.out.println("\nMatriz B Original");
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				b[i][j] = (int)(Math.random()*100);
				
				System.out.printf(" %3d ", b[i][j] );
			}
			System.out.println();
		}
		
		//Imprimindo a Matriz B em ordem invertida
		
		
		System.out.println("\nMatriz B Invertida");
		
		for(int i = b.length - 1; i >= 0; i--) {
			
			for(int j = b[i].length - 1; j >= 0; j--) {
				
			
				
				System.out.printf(" %3d ", b[i][j] );
			}
			System.out.println();
		}
	}
}

