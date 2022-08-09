package PacoteJava;

import java.util.Scanner;

public class exerciciofor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero,x,somaPar=0,somaImpar=0;
		
		for (x=1;x<=10;x++) {
			numero = leia.nextInt();
			
			if (numero % 2 == 0) {
				somaPar+=1;
			}
		
			else {
				somaImpar+=1;
			}
		
		}	

		System.out.println("Existem "+somaPar+" pares");
		System.out.println("Existem "+somaImpar+" impares");
	}

}
