/*
 * Calculadeira.java
 * 
 */

/*
	Métodos --> devolvem um retorno

	Retorno nomeDoMetodo()
 
	Retorno nomeDoMetodo(int nome){
		Função ou procedimento
	}
	
	Retorno --> int, double, String, void;
	
	int soma (int n1, int n2){
		
		int resultado = n1 + n2;
		 
		return resultado;
		
	}
	
*/

public class Calculadeira {
	
	static int soma(int n1, int n2) {
	
		return n1 + n2;
		
	}
	
	public static void main (String[] args) {
		
		System.out.println(soma(4,5));
		System.out.println(soma(13,21));
		int minhaSoma = soma(61,89);
		System.out.println(minhaSoma);
		
	}
}

