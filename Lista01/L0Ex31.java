import java.util.Scanner;

public class  L0Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de linhas (N): ");
        int N = scanner.nextInt();
        System.out.print("Digite o numero de colunas (M): ");
        int M = scanner.nextInt();
        System.out.print("Digite o valor inicial da faixa: ");
        int inicio = scanner.nextInt();
        System.out.print("Digite o valor final da faixa: ");
        int fim = scanner.nextInt();

        int[][] matriz = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = inicio + (int)(Math.random() * (fim - inicio + 1));
            }
        }

        System.out.println("Matriz gerada:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
