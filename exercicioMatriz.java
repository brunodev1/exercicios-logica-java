package PacoteJava;

import java.util.Scanner;

public class exercicioMatriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][3];
		int i,j,numero,contSoma=0;
		Scanner leia = new Scanner(System.in);
		
		for (i=0;i<3;i++) {
			for (j=0;j<3;j++) {
				System.out.println("Entre com um número: ");
				numero = leia.nextInt();
				matriz[i][j]+=numero;
			
				if (matriz[i][j]>10) {
					contSoma++;
				}
			
			}
		
		}


		System.out.println("Numeros digitados maior que 10: "+contSoma);
		
	}

}
