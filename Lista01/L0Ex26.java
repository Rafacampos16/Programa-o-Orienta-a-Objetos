import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class L0Ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero de linhas (N): ");
        int N = scanner.nextInt();
        System.out.print("Digite o numero de colunas (M): ");
        int M = scanner.nextInt();

        Integer[][] matriz = new Integer[N][M];
        Integer[] vetor = new Integer[N * M];
        int index = 0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = (int)(Math.random() * 100);
                vetor[index++] = matriz[i][j];
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        Arrays.sort(vetor, Collections.reverseOrder());
        index = 0;
        
        System.out.println("\nMatriz ordenada de forma decrescente:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matriz[i][j] = vetor[index++];
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
