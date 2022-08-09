package PacoteJava;

import java.util.Scanner;

public class ExercicioDoWhileDois {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero,somaNumero=0,contaMulti=0, media;
		
		do {
			numero = leia.nextInt();
			
			if (numero % 3 == 0) {
				somaNumero+=numero;
				if (numero!=0) {
					contaMulti+=1;
				}
			}
			
		}
		while(numero!=0);
	
		media = somaNumero / contaMulti;
		
		
		System.out.println("A Media dos números multiplos de 3 é: "+media);
		
	
	}

}
