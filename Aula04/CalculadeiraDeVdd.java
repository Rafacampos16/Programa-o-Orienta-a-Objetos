import java.util.Scanner;

public class CalculadeiraDeVdd {
	
	public static void main (String[] args) {		
		Scanner leia = new Scanner(System.in);
		int n1 = 0, n2 = 0, opcao;
		
		do{
			menu();
			
			opcao  = leia.nextInt();
			
			switch (opcao){
				case 1: 
					System.out.println("Entre com o numero 1");
					n1 = leia.nextInt();
					break;
				case 2:
					System.out.println("Entre com o numero 2");
					n2 = leia.nextInt();
					break;
				case 3:
					System.out.println("Soma: " + soma(n1, n2));
					break;
				case 4:
					System.out.println("Subtracao: " + subtracao(n1, n2));
					break;
				case 5:
					System.out.println("Multiplicacao: " + multiplicacao(n1, n2));
					break;
				case 6:
					System.out.println("Divisao: " + divisao(n1, n2));
					break;
				case 7:
					System.out.println("Fim do programa");
					break;
				default:
					System.out.println("Opcao Invalida!!");
				
			}
			
		}while(opcao != 7);
	}
	
	static void menu(){
		System.out.println("---------------");
		System.out.println(" M E N U ");
		System.out.println("---------------");
		System.out.println("(1) Entre com numero 1");
		System.out.println("(2) Entre com numero 2");
		System.out.println("(3) Somar");
		System.out.println("(4) Subtrair");
		System.out.println("(5) Multiplicar");
		System.out.println("(6) Dividir");
		System.out.println("(7) Sair");
		System.out.println("---------------");
	}
	
	static int soma(int n1, int n2){		
		return n1 + n2;
	}
	
	static int subtracao(int n1, int n2){		
		return n1 - n2;
	}
	
	static double divisao(int n1, int n2){		
		return (double) n1 / n2;
	}
	
	static int multiplicacao(int n1, int n2){		
		return n1 * n2;
	}
}

