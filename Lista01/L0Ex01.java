 
import java.util.Scanner;
public class L0Ex01 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int [][] a = new int [4][5];
		
		System.out.println("Entre com os elementros da matriz A");
		
		for(int linha = 0; linha < 4; linha++) {
			for(int coluna = 0; coluna < 5; coluna++) {
				System.out.print("Elemento [" + (linha + 1) + "][" + (coluna + 1) + "]: ");
				a[linha][coluna] = scanner.nextInt();
			}
			
		}
		
		System.out.println("\nMatriz A: ");
		
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[i].length; j++){
				System.out.print( a[i][j] + " ");
			
			
			}
			System.out.println();
			
		}
	}
}

