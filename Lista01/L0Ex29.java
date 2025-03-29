import java.util.Scanner;

public class L0Ex29 {
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
        int numero = 2;

        for (int i = 0; i < quantidade; i++) {
            matriz[i] = new int[vetor[i] + 1];
            matriz[i][0] = vetor[i];
            for (int j = 1; j <= vetor[i]; j++) {
                while (!isPrimo(numero)) {
                    numero++;
                }
                matriz[i][j] = numero;
                numero++;
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

    public static boolean isPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
