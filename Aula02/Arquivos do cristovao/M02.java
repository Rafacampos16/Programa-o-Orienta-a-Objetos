/*
 * Matriz02.java
 * 
 * Matriz Quadrada
 * 
 * Linhas = Colunas
 * 
 *     0    1    2    3    4  (5)
 * 0 [0,0][0,1][0,2][0,3][0,4] 
 * 1 [1,0][1,1][1,2][1,3][1,4]
 * 2 [2,0][2,1][2,2][2,3][2,4]
 * 3 [3,0][3,1][3,2][3,3][3,4]
 * 4 [4,0][4,1][4,2][4,3][4,4]
 *(5) 
 * 
 * Diagonal Principal
 * Indice da linha == Indice da coluna
 * 
 *    0  1  2  3  4  (5)
 * 0 [*][ ][ ][ ][ ] 
 * 1 [ ][*][ ][ ][ ]
 * 2 [ ][ ][*][ ][ ]
 * 3 [ ][ ][ ][*][ ]
 * 4 [ ][ ][ ][ ][*]
 *(5) 
 * 
 * 
 * Diagonal Secundaria
 * Indice da linha + Indice da coluna == Dimensao - 1
 * 
 *       1  2  3  4  5
 * 0  1 [ ][ ][ ][ ][*]  (1,5) => 1+5 = 6 (D+1)
 * 1  2 [ ][ ][ ][*][ ]  (2,4) => 2+4 = 6
 * 2  3 [ ][ ][*][ ][ ]  (3,3) => 3+3 = 6
 * 3  4 [ ][*][ ][ ][ ]  (4,2) => 4+2 = 6
 * 4  5 [*][ ][ ][ ][ ]  (5,1) => 5+1 = 6
 *(5) 
 *                    D
 *    0  1  2  3  4  (5)
 * 0 [ ][ ][ ][ ][*]  (0,4) => 0+4 = 4 (D-1)
 * 1 [ ][ ][ ][*][ ]  (1,3) => 1+3 = 4
 * 2 [ ][ ][*][ ][ ]  (2,2) => 2+2 = 4
 * 3 [ ][*][ ][ ][ ]  (3,1) => 3+1 = 4
 * 4 [*][ ][ ][ ][ ]  (4,0) => 4+0 = 4
 *(5) 
 *
 * 
 */


public class M02 {
	
	public static void main (String[] args) {
		
		int dimensao = 5;
		
		int[][] matriz = new int[dimensao][dimensao];
		
		System.out.println("Matriz Quadrada de dimensao: " + dimensao);
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				matriz[i][j] = (int)(Math.random()*9)+1; // 1 ~ 9
				
				System.out.print("   " + matriz[i][j]);
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDiagonal Principal");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i == j ) {
					
					System.out.print("  [" + matriz[i][j]+ "]");
					
				} else {
					
					System.out.print("   " + matriz[i][j] + " ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDiagonal Secundaria");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i + j == dimensao - 1 ) {
					
					System.out.print("  [" + matriz[i][j]+ "]");
					
				} else {
					
					System.out.print("   " + matriz[i][j] + " ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDiagonal Principal e Secundaria");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i == j || i + j == dimensao - 1 ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDiagonal Principal e Abaixo");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i >= j ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDiagonal Principal e Acima");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i <= j ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDiagonal Secundaria e Abaixo");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i + j >= dimensao - 1 ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDiagonal Secundaria e Acima");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i + j <= dimensao - 1 ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDP e Acima E DS Acima ");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i <= j && i + j <= dimensao - 1 ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDP e Acima OU DS Acima ");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i <= j || i + j <= dimensao - 1 ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDP e Abaixo E DS Abaixo ");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i >= j && i + j >= dimensao - 1 ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDP e Abaixo OU DS Abaixo ");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i >= j || i + j >= dimensao - 1 ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDP e Abaixo E DS Acima ");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i >= j && i + j <= dimensao - 1 ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDP e Abaixo OU DS Acima ");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i >= j || i + j <= dimensao - 1 ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDP e Acima E DS Abaixo ");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i <= j && i + j >= dimensao - 1 ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nDP e Acima OU DS Abaixo ");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if ( i <= j || i + j >= dimensao - 1 ) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nAmpulheta ");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if (
						( i <= j && i + j <= dimensao - 1 ) // DP Acima e DS Acima
					|| 
						( i >= j && i + j >= dimensao - 1 ) // DP Abaixo e DS Abaixo
					) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
		
		
		
		System.out.println("\nAsa da Borboleta ");
		
		for ( int i = 0 ; i < matriz.length ; i++ ) {
			
			for ( int j = 0 ; j < matriz[i].length ; j++ ) {
				
				if (
						( i >= j && i + j <= dimensao - 1 ) // DP Abaixo e DS Acima
					|| 
						( i <= j && i + j >= dimensao - 1 ) // DP Acima e DS Abaixo
					) {
					
					System.out.print("   " + matriz[i][j]+ " ");
					
				} else {
					
					System.out.print("     ");
				}
			}
			
			System.out.println();
		}
	}
}
