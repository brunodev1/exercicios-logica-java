package PacoteJava;

import java.util.Scanner;

public class ExercicioDoWhile {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		int numero,somaNumero=0;
		
		do {
			numero = leia.nextInt();
			somaNumero+=numero;
		}
		while (numero!=0);
	
	
		System.out.println("A soma dos números digitados é: "+somaNumero);
	}

}
