
public class Matriz04 {
	
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
		System.out.println("\nDiagonal Principal e Acima");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i  <= j) {
				System.out.print(" [" + matriz[i][j] + "]");
				} else {
					System.out.print("  " + matriz[i][j] + " ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nDiagonal Principal e Abaixo");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i  >= j) {
				System.out.print(" [" + matriz[i][j] + "]");
				} else {
					System.out.print("  " + matriz[i][j] + " ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nDiagonal Secundaria");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i + j == dimensao - 1) {
				System.out.print(" [" + matriz[i][j] + "]");
				} else {
					System.out.print("  " + matriz[i][j] + " ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nDiagonal Secundaria e Abaixo");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i + j >= dimensao - 1) {
				System.out.print(" [" + matriz[i][j] + "]");
				} else {
					System.out.print("  " + matriz[i][j] + " ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nDiagonal Secundaria e Acima");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i + j <= dimensao - 1) {
				System.out.print(" [" + matriz[i][j] + "]");
				} else {
					System.out.print("  " + matriz[i][j] + " ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nDP e acima && DS Acima");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i <= j && i + j <= dimensao - 1) {
				System.out.print("  " + matriz[i][j] + " ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nDP e Acima OU DS Acima");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i <= j || i + j <= dimensao - 1) {
				System.out.print("  " + matriz[i][j] + " ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nDP e Abaixo && DS Abaixo");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i >= j && i + j >= dimensao - 1) {
				System.out.print("  " + matriz[i][j] + " ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nDP e Abaixo OU DS Abaixo");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i >= j || i + j >= dimensao - 1) {
				System.out.print("  " + matriz[i][j] + " ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nDP e Abaixo && DS Acima");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i >= j && i + j <= dimensao - 1) {
				System.out.print("  " + matriz[i][j] + " ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nDP e Abaixo OU DS Acima");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i >= j || i + j <= dimensao - 1) {
				System.out.print("  " + matriz[i][j] + " ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nDP e Acima && DS Abaixo ");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i <= j && i + j >= dimensao - 1) {
				System.out.print("  " + matriz[i][j] + " ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nDP e Acima OU DS Abaixo ");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if(i <= j || i + j >= dimensao - 1) {
				System.out.print("  " + matriz[i][j] + " ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nAmpulheta");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if ((i <= j && i + j <= dimensao - 1) //DP ACIMA E DS ACIMA
				|| 
					(i >= j && i + j >= dimensao - 1)) { //DP ABAIXO E DS ABAIXO
				System.out.print("  " + matriz[i][j] + " ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
			
		}
		
		System.out.println("\nAsa da Borboleta");
		
		for (int i = 0; i < matriz.length; i++) {
			
			for (int j = 0; j < matriz[i].length; j++) {
				
				
				if ((i <= j && i + j >= dimensao - 1) //DP ACIMA E DS ABAIXO
				|| 
					(i >= j && i + j <= dimensao - 1)) { //DP ABAIXO E DS ACIMA
				System.out.print("  " + matriz[i][j] + " ");
				} else {
					System.out.print("    ");
				}
			}
			System.out.println();
			
		}
	}
}

