package ListaVetor;
import java.util.Scanner;
import java.util.Random;
public class Exercicio5 {
	public static void main(String[] args) {
		Random rand = new Random();
		int vetor[] = new int[1000];
		
		int maior = 0;
		int menor = 0;
		int soma = 0;
		int media = 0;
		int cont = 0;
		
		for(int i = 0 ; i < vetor.length; i++) {
			vetor[i] = rand.nextInt();
			maior = i;
			menor = i;
			
			if(vetor[i] > maior ) {
				maior = vetor[i];
			} else if(menor > vetor[i]) {
				menor = vetor[i];
			}
			
			soma = vetor[i] + soma;
			cont++;
			
		}
		
		media = soma / cont;
		
		System.out.println("A media é:" +media);
		System.out.println(" O maior é: "+maior);
		System.out.println("O menor é: " +menor);
		
		
		
	}
}
