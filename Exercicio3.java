package ListaVetor;
import java.util.Scanner;

public class Exercicio3 {
public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	
	int vetor1[] = new int[10];
	int vetor2[] = new int[10];
	int vetor3[] = new int[10];
	int cont = 0;
	
	for(int i = 0; i < 10; i++) {
		vetor1[i] = ler.nextInt();
		vetor2[i] = ler.nextInt();
		
		cont = vetor1[i] * vetor2[i];
		
		vetor3[i] = cont;
		
	}for(int b = 0; b < 10; b++) {
	System.out.println(vetor3[b]);
	}
	
	}
}
