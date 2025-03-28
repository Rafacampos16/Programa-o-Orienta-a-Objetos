
public class Calculadeira {
	
	public static void main (String[] args) {
		System.out.println(soma(4, 5));
		
		System.out.println(soma(13, 21));
		
		int minhasoma = soma(31, 69);
		
		System.out.println(minhasoma);
	}
	
	static int soma(int n1, int n2){		
		return n1 + n2;
	}
}

