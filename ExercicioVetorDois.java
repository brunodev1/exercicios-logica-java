package PacoteJava;

public class ExercicioVetorDois {

	public static void main(String[] args) {
		
		int[] A = new int[6];
		int soma=0,i;
		
		A[0]=1; A[1]=0; A[2]=5; A[3]=-2; A[4]=-5; A[5]=7;
		
		soma = A[0] + A[1] + A[5];
		
		System.out.println(soma);
		
		A[4]=100;
		
		for (i=0;i<6;i++) {
			System.out.println("\n"+A[i]);
		}

	}

}
