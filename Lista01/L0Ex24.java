import java.util.Scanner;

public class L0Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de linhas (N): ");
        int N = scanner.nextInt();
        System.out.print("Digite o numero de colunas (M): ");
        int M = scanner.nextInt();

        int[][] matriz = new int[N][M];
        int a = 0, b = 1;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = a;
                int temp = a + b;
                a = b;
                b = temp;
            }
        }

        System.out.println("Matriz preenchida com a sequencia de Fibonacci:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
