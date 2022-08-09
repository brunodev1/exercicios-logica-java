package PacoteJava;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		
		int idade,somaIdade=0,somaIdadeDois=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a  idade: ");
		idade = leia.nextInt();
		
		while (idade!=-99) {
			
			if (idade<=21){
				somaIdade+=1;
			}
			else if (idade>=50) {
				somaIdadeDois+=1;
			}
			
			System.out.println("Entre com a  idade: ");
			idade = leia.nextInt();
		
		}
		
		System.out.println("O total de pessoas com menos de 21 anos é: "+somaIdade);
		System.out.println("O total de pessoas com mais de 50 anos é: "+somaIdadeDois);

	}

}
