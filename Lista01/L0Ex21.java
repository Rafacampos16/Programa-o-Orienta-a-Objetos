import java.util.Random;
import java.util.Scanner;

public class L0Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        
        System.out.print("Digite o número de linhas (N): ");
        int N = scanner.nextInt();
        
        System.out.print("Digite o número de colunas da primeira matriz (M): ");
        int M = scanner.nextInt();
        
        System.out.print("Digite o número de colunas da segunda matriz (P): ");
        int P = scanner.nextInt();

        
        int[][] A = new int[N][M];
        int[][] B = new int[N][P];

        
        System.out.println("Matriz A (N x M):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = random.nextInt(100) + 1;
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMatriz B (N x P):");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < P; j++) {
                B[i][j] = random.nextInt(100) + 1;
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        
        int[][] C = new int[N][M + P];

        // Concatenar as matrizes A e B na matriz C
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                C[i][j] = A[i][j];  
            }
            for (int j = 0; j < P; j++) {
                C[i][M + j] = B[i][j];  
            }
        }

        
        System.out.println("\nMatriz C (N x (M + P)) - Resultado da concatenação:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M + P; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
