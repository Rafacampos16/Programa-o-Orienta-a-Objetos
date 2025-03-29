import java.util.Scanner;

public class L0Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de linhas (N): ");
        int N = scanner.nextInt();
        System.out.print("Digite o numero de colunas (M): ");
        int M = scanner.nextInt();

        int[][] matriz = new int[N][M];
        int numero = 2;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                while (!isPrimo(numero)) {
                    numero++;
                }
                matriz[i][j] = numero;
                numero++;
            }
        }

        System.out.println("Matriz preenchida com numeros primos:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }

    public static boolean isPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
