import java.util.Scanner;
public class InverteNumero {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int numero = 0;
		do{
		System.out.println("Entre com o numero para inverter");
		numero = leia.nextInt();
		
		if(numero < 0){
			System.out.println("\n\nO numero tem que ser maior ou igual a zero!");
		}
	}while(numero < 0);
		System.out.println("\n\t Numero Invertido: " + inverte(numero) + "\n");
	}
	
	static int inverte (int numero){
		String saidaStr = "",
			numeroStr = "" + numero;

		for (int atual = 0; atual < numeroStr.length(); atual++){
			saidaStr = numeroStr.charAt(atual) + saidaStr;
		}
		

		return Integer.parseInt (saidaStr);
	}
}

