import java.util.Scanner;
public class AnoBissexto {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int ano;
		
		System.out.println("Entre com um ano: ");
		ano = leia.nextInt();
		
		System.out.println("O ano bissexto e: " + divisao(ano));
		
}
	
	static boolean divisao(int ano){	
		if(ano % 4 == 0 && ano % 100 != 0){
			return true;
		}else if(ano % 100 == 0 && ano % 4 == 0 && ano % 400 == 0){
			return true;
		}else if(ano % 100 == 0){
			return false;
		}else{
			return false;
		}
	}
}
	

