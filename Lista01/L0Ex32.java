import java.util.Scanner;

public class L0Ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de linhas (N): ");
        int N = scanner.nextInt();
        System.out.print("Digite o numero de colunas (M): ");
        int M = scanner.nextInt();

        int[][] matriz = new int[N + 1][M + 1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
            }
        }

        for (int i = 0; i < N; i++) {
            int somaLinha = 0;
            for (int j = 0; j < M; j++) {
                somaLinha += matriz[i][j];
            }
            matriz[i][M] = somaLinha;
        }

        for (int j = 0; j < M; j++) {
            int somaColuna = 0;
            for (int i = 0; i < N; i++) {
                somaColuna += matriz[i][j];
            }
            matriz[N][j] = somaColuna;
        }

        int somaDiagonal = 0;
        for (int i = 0; i < N; i++) {
            somaDiagonal += matriz[i][i];
        }
        matriz[N][M] = somaDiagonal;

        System.out.println("Matriz com somas:");
        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < M + 1; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
