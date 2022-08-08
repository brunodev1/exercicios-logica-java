package PacoteJava;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		int num,par;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		num = leia.nextInt();
		
		par = num % 2;
		
		if (par==0) {
			System.out.println("Esse número é par");
			System.out.println("A raiz quadrada de "+num+" é "+Math.sqrt(num));
		}
		else {
			System.out.println("Esse número é impar");
			System.out.println(num+" elevado a 2 é "+Math.pow(num, 2));
		}
	}

}
