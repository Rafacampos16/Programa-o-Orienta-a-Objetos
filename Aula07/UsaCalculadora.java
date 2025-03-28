/*
 * UsaCalculadora.java
 * 
 */

import java.util.Scanner;

public class UsaCalculadora {
	
	public static void main (String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		Calculadora calc = new Calculadora();
		
		System.out.println(calc.soma());
		
		System.out.print("Numero1: ");
		calc.num1 = leia.nextInt();
		
		System.out.print("Numero2: ");
		calc.num2 = leia.nextInt();
		
		System.out.println("Soma: " + calc.soma());
		
		System.out.println("Soma: " + calc.soma(8, 7));
		
		System.out.println("Soma: " + Calculadora.soma(8, 9));
		
		Calculadora.soma(5,6,7);
		
	}
}

