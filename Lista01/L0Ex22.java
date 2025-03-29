import java.util.Random;
import java.util.Scanner;

public class L0Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o número de linhas (N): ");
        int N = scanner.nextInt();
        
        System.out.print("Digite o número de colunas da primeira matriz (M): ");
        int M = scanner.nextInt();
        
        System.out.print("Digite o número de colunas da segunda matriz (P): ");
        int P = scanner.nextInt();

        // matrizes A (N x M) e B (N x P)
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

        // matriz C (N x (M + P)) para armazenar a intercalagem das duas matrizes
        int[][] C = new int[N][M + P];

        // Intercalar as matrizes A e B na matriz C
        for (int i = 0; i < N; i++) {
            int colA = 0, colB = 0;
            for (int j = 0; j < M + P; j++) {
                if (j % 2 == 0 && colA < M) {  // Colunas da matriz A (de forma alternada)
                    C[i][j] = A[i][colA++];
                } else if (colB < P) {  // Colunas da matriz B (de forma alternada)
                    C[i][j] = B[i][colB++];
                }
            }
        }

        System.out.println("\nMatriz C (N x (M + P)) - Resultado da intercalagem:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M + P; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
