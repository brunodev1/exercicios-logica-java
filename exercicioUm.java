package PacoteJava;

import java.util.Scanner;

public class exercicioUm {

	public static void main(String[] args) {
		
		int a,b,c;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		a = leia.nextInt();
		
		System.out.println("Digite outro valor: ");
		b = leia.nextInt();
		
		System.out.println("Digite outro valor: ");
		c = leia.nextInt();
	
		if (a>b && a>c) {
			System.out.println("O maior número é: "+a);
		}
		else if (a<b && b>c){
			System.out.println("O maior número é: "+b);
		}
		else {
			System.out.println("O maior número é: "+c);
		}
	}

}
