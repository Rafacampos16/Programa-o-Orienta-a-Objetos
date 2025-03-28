/*
 * AnoBissexto.java
 */

import java.util.Scanner;

public class AnoBissexto {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int ano = 0, op;
		
		do {
			
			menu();
			
			op = leia.nextInt();
			
			switch (op) {
				case 1:
					System.out.print("\n\tEntre com o ano: ");
					ano = leia.nextInt();
					System.out.println();
					break;
				case 2:
					if (verificar(ano)) {
						System.out.println("\n\tO ano " + ano + " eh bissexto!!\n" );
					} else {
						System.out.println("\n\tO ano " + ano + " NAO eh bissexto!!\n");					
					}
					break;
				case 3:
					System.out.println("\n\tFim do programa!!\n");
					break;
				default:
					System.out.println("\n\tOpcao invalida!!\n");
			}
			
		} while ( op != 3);		
	}
	
	// Menu
	static void menu (){
		
		System.out.println("=========================");
		System.out.println(" M E N U ");
		System.out.println("=========================");
		System.out.println("1) Informar o ano");
		System.out.println("2) Verificar se eh bissexto");
		System.out.println("3) Sair");
		System.out.println("-------------------------");
		System.out.print(">>> Opcao: ");
		
	}
	
	// Verificação
	static boolean verificar ( int ano ){
		
		boolean ver = false;
		
		if (ano % 4 == 0){
			if (ano % 100 == 0){
				if (ano % 400 == 0) {
					ver = true;
				} else {
					ver = false;
				}
			}			
		}
		return ver;
	}
}
	

