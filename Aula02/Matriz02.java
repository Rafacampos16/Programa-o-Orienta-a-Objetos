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
        
         System.out.println("\nDiagonal Principal: ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j){
					System.out.print(" " + matriz[i][j]);
				}
            }
            //System.out.println();

        }
        
         System.out.println("\n\nDiagonal Secundaria: ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == dimensao - 1){
					System.out.print(" " + matriz[i][j]);
				}
            }
            //System.out.println();

        }
        
        System.out.println("\n\nDiagonal Principal e secundaria: ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j || i + j == dimensao - 1){
					System.out.print(" [" + matriz[i][j] + "]");
				}else
				{
					System.out.print("  " + matriz[i][j] + " ");
				}
            }
            System.out.println();

        }
        
        System.out.println("\n\nDiagonal Principal abaixo: ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i >= j){
					System.out.print(" " + matriz[i][j] + " ");
				}else
				{
					System.out.print("   ");
				}
            }
            System.out.println();

        }
        
        System.out.println("\n\nDiagonal Principal acima: ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i <= j){
					System.out.print(" " + matriz[i][j] + " ");
				}else
				{
					System.out.print("   ");
				}
            }
            System.out.println();

        }
        
         System.out.println("\n\nDiagonal Secundaria acima: ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j <= dimensao - 1){
					System.out.print(" " + matriz[i][j] + " ");
				}else
				{
					System.out.print("   ");
				}
            }
            System.out.println();

        }
        
         System.out.println("\n\nDiagonal Secundaria abaixo: ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j <= dimensao - 1){
					System.out.print(" " + matriz[i][j] + " ");
				}else
				{
					System.out.print("   ");
				}
            }
            System.out.println();

        }
        
        System.out.println("\n\nDP acima + DS acima: ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i <= j && i + j <= dimensao - 1){
					System.out.print(" " + matriz[i][j] + " ");
				}else
				{
					System.out.print("   ");
				}
            }
            System.out.println();

        }
        
        System.out.println("\n\nDP abaixo + DS Acima: ");
	
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (i >= j && i + j >= dimensao - 1){
					System.out.print(" " + matriz[i][j] + " ");
				}else
				{
					System.out.print("   ");
				}
            }
            System.out.println();

        }
        
        System.out.println("\n\nAMPULHETA: ");

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
                if (
						(i <= j && i + j <= dimensao - 1) //DP Acima e DS Acima
					||
						(i >= j && i + j >= dimensao - 1) //DP Abaixo e DS Abaixo
				    ){
						System.out.print(" " + matriz[i][j] + " ");
				}else{
					System.out.print("   ");
				}
            }
            System.out.println();

        }
        
         System.out.println("\n\nBORBOLETA: ");
	
        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {
				
                if  (
						(i >= j && i + j <= dimensao - 1) //DP Abaixo e DS Acima
					||
						(i <= j && i + j >= dimensao - 1) //DP Acima e DS Abaixo
				    ){
						System.out.print(" " + matriz[i][j] + " ");
				}else
				{
					System.out.print("   ");
				}
            }
            System.out.println();

        }
    }
}
