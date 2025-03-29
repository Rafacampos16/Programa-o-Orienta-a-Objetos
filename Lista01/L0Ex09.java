import java.util.Random;
import java.util.Scanner;

public class L0Ex09 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Digite o tamanho da matriz quadrada: ");
		int N = leia.nextInt();
		
		int[][] G = new int[N][N];
		
		System.out.println("Matriz Gerada: ");
		for(int i = 0; i < N; i++){
			for(int j = 0; j < N; j++){
				G[i][j] = random.nextInt(100) + 1;
				System.out.print(G[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("\n Elementos da diagonal Principal: ");
			for(int i = 0; i < N; i++){
				System.out.print(G[i][i] + " ");
			}
			leia.close();
	}
}

