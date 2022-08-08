package PacoteJava;

import java.util.Scanner;

public class ExercicioSequencialDois {

	public static void main(String[] args) {
		
		double a,b,c,r,s,d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o calor de C: ");
		c = leia.nextDouble();
		
		r = Math.pow((a+b), 2);
		s = Math.pow((b+c), 2);
		
		d = (r + s) / 2;
		
		System.out.println("O resultado da expressão é: "+d);
	}

}
