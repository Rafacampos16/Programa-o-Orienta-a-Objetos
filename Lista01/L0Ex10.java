import java.util.Random;
import java.util.Scanner;

public class L0Ex10 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
		System.out.print("Digite o tamanho da matriz quadrada (N): ");
        int N = scanner.nextInt();

        int[][] H = new int[N][N];
       
        System.out.println("Matriz gerada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                H[i][j] = random.nextInt(100) + 1;
                System.out.print(H[i][j] + "\t"); 
            }
            System.out.println();
        }

        
        System.out.println("\nElementos da diagonal secundaria:");
        for (int i = 0; i < N; i++) {
            System.out.print(H[i][N - 1 - i] + " "); 
        }

        scanner.close();
    }
}
	
