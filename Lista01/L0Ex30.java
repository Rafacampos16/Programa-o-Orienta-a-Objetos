import java.util.Scanner;

public class L0Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de elementos do vetor: ");
        int quantidade = scanner.nextInt();

        int[] vetor = new int[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o " + (i + 1) + "º elemento do vetor: ");
            vetor[i] = scanner.nextInt();
        }

        int[][] matriz = new int[quantidade][];
        int a = 0, b = 1;

        for (int i = 0; i < quantidade; i++) {
            matriz[i] = new int[vetor[i] + 1];
            matriz[i][0] = vetor[i];
            for (int j = 1; j <= vetor[i]; j++) {
                matriz[i][j] = a;
                int temp = a + b;
                a = b;
                b = temp;
            }
        }

        System.out.println("Matriz gerada:");
        for (int i = 0; i < quantidade; i++) {
            for (int j = 0; j <= vetor[i]; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
        scanner.close();
    }
}
