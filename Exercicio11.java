package ListaVetor;
import java.util.Scanner;
import java.util.Random;
public class Exercicio11 {
public static void main(String [] args) {
	Scanner ler = new Scanner(System.in);
	Random rand = new Random();
	int cont = 0;
	
	
	int vetor[] = new int[10];
	int vetorImpar[] = new int[10];
	
	for(int i = 0; i < vetor.length; i++) {
		int numeros	=rand.nextInt(50);
		vetor[i] = numeros;
		if(vetor[i] % 2 != 0) {
			cont = cont+1;
		}
			
	}
	
	
	for(int i = 0; i< vetor.length; i++) {
		if(vetor[i] % 2 != 0) {
			vetorImpar[i] = vetor[i];
		}
	}
	
	
	for (int i = 0; i < vetor.length; i++) {
		System.out.println(vetor[i] +" " + vetorImpar[i]);
	
	}
	
	
	}
}
