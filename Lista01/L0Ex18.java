import java.util.Random;
import java.util.Scanner;

public class L0Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o tamanho da matriz quadrada (N): ");
        int N = scanner.nextInt();

        int[][] R = new int[N][N];

        System.out.println("Matriz gerada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                R[i][j] = random.nextInt(100) + 1;
                System.out.print(R[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nElementos acima da diagonal principal e acima da diagonal secundária:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i <= j && i + j <= N - 1) {
                    System.out.print(R[i][j] + "\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
