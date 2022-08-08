package PacoteJava;

import java.util.Scanner;

public class ExercicioSequencialUm {

	public static void main(String[] args) {
		
		double notaUm,notaDois,notaTres,media;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		notaUm = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		notaDois = leia.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		notaTres = leia.nextDouble();
		
		media = ((notaUm * 2) + (notaDois * 3) + (notaTres * 5)) / 10;
		
		System.out.println("A media final é: "+media);
	
	}

}
