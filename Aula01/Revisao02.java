public class Matriz02 {

    public static void main (String[] args) {
        int dimensao = 5;
        int[][] matriz = new int [dimensao][dimensao];

        System.out.println("Matriz Quadrada de dimensao:" + dimensao);

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*9)+1; // gerando 1-9

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();

        }
    }
}
