import java.util.Scanner;
public class L0Ex03 {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner (System.in);
		
		int c [][] , dimensao;
		
		do {
			System.out.print("Entre com a dimensao da Matriz C: ");
			dimensao = scanner.nextInt();
			
			if(dimensao < 1 || dimensao > 20) {
				System.out.println("\n\tErro! Dimensao deve estar entre 1 e 20. \n");
			}
		} while (dimensao < 1 || dimensao > 20);
		
		
		
		c = new int [dimensao][dimensao];
		
		//Gerandoe imprimindo os elementos da Matriz C aleatoriamente (<100)
		
		
		System.out.println("\nMatriz C Original");
		
		for(int i = 0; i < c.length; i++) {
			for(int j = 0; j < c[i].length; j++) {
				c[i][j] = (int)(Math.random()*100);
				
				System.out.printf(" %3d ", c[i][j] );
			}
			System.out.println();
		}
		
		
	}
}

