/*
REVISÃO - AULA 2
 */

import java.util.Scanner;
public class Revisao02  {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int tamanho, contador, numero;
		
		do {
			System.out.print("Entre com o tamanho do vetor: ");
			tamanho = leia.nextInt();
			
			if(tamanho <=0 || tamanho > 20) {
				System.out.println("\n\tValor invalido! Entre com um numero entre 1 a 20!");
			}
		} while(tamanho <= 0 || tamanho > 20);
		
		
			
		int[] vetor = new int[tamanho];
		
		numero = 1;
		
		for ( int i = 0; i < vetor.length; ) {
			
			contador = 0;
			
			for (int j = 1; j <= numero; j++) {
				
				if ( numero % j == 0) {
					contador++;
				
				}
				
			}
			
			if (contador == 2) {
			vetor[i++] = numero;	
			}
			numero++;
			
			
		}
		
		
		
		
		
		
		System.out.print("\nVetor: ");
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}	
		
	}
}

