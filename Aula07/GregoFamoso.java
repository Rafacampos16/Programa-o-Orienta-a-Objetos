/*
 * GregoFamoso.java
 * 
 */

public class GregoFamoso {
	
	static String nome = "Dionesius";
	int idade;
	double altura;
	String motivoDaFama;
	
	// METODO CONSTRUTOR
	public GregoFamoso () {
		
		//nome = "Dionesius";
		idade = 57;
		altura = 1.69;
		motivoDaFama = "Beijo do Dionesius";
		
	}
	
	public GregoFamoso (String nome, int idade, double altura, String motivoDaFama) {
		
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.motivoDaFama = motivoDaFama;
		
	}
	
}

