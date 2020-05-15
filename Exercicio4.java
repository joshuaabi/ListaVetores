package ListaVetor;
import java.util.Scanner;
public class Exercicio4 {
	public static void main(String [] args) {
		
		int vetor[] = new int[6];
		vetor[0] = 1;
		vetor[1] = 0;
		vetor[2] = 5;
		vetor[3] = -2;
		vetor[4] = -5;
		vetor[5] = 7;
		
		int soma = 0;
		soma = vetor[0] + vetor[1] + vetor[5];
		System.out.println("A Soma é: ");
		System.out.println(soma);
		
		vetor[4] = 100;
		System.out.println("Os valores são: ");

		for(int i = 0; i < vetor.length;i++) {
			System.out.println(vetor[i]);
			
		}
		
		
	}
}
 