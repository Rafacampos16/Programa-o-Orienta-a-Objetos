
public class GeraPrimo {
	
	public static void main (String[] args) {
		for (int numero = 1; numero <=1000; numero++){
			if (isPrimo (numero)){
				System.out.print(numero + " ");
			}
		}
	}
	
		static boolean isPrimo (int numero){
				int contador = 0;
				
				for (int atual = 1; atual <= numero; atual++){
				
					if(numero % atual == 0){
						contador++;
					}
				}
				return(contador == 2);
	}
}

