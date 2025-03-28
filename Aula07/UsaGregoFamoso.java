/*
 * UsaGregoFamoso.java
 * 
 */


public class UsaGregoFamoso {
	
	public static void main (String[] args) {
		
		GregoFamoso dio = new GregoFamoso();
		
		dio.nome = "Rodrigus Dionesius";
		
		System.out.println("Nome: " + dio.nome);
		System.out.println("Idade: " + dio.idade);
		System.out.println("Altura: " + dio.altura);
		System.out.println("Motivo da fama: " + dio.motivoDaFama);
		
		System.out.println("\nClasse Nome: " + GregoFamoso.nome);
		
		GregoFamoso jujuis = new GregoFamoso("Jujuis", 19, 1.57, "Seus cabelhos");
		
		System.out.println("\nJujuis Nome: " + jujuis.nome);
		System.out.println("Idade: " + jujuis.idade);
		System.out.println("Altura: " + jujuis.altura);
		System.out.println("Motivo da fama: " + jujuis.motivoDaFama);
		
		System.out.println("\nDio Nome: " + dio.nome);
		System.out.println("Idade: " + dio.idade);
		System.out.println("Altura: " + dio.altura);
		System.out.println("Motivo da fama: " + dio.motivoDaFama);
	}
}

