import java.util.Scanner;
import java.util.Arrays;

public class L0Ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de linhas (N): ");
        int N = scanner.nextInt();
        System.out.print("Digite o numero de colunas (M): ");
        int M = scanner.nextInt();

        int[][] matriz = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        for (int j = 0; j < M; j++) {
            int[] coluna = new int[N];
            for (int i = 0; i < N; i++) {
                coluna[i] = matriz[i][j];
            }
            Arrays.sort(coluna);
            for (int i = 0; i < N; i++) {
                matriz[i][j] = coluna[i];
            }
        }

        System.out.println("\nMatriz com as colunas ordenadas de forma crescente:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
