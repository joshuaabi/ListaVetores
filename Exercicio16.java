package ListaVetor;
import java.util.Scanner;

public class Exercicio16 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double n=0;
		double vetor[] = new double[10];
		double media = 0;
		double desvio = 1/(n-1);
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = ler.nextDouble();
			media = vetor[i] / (i/2);
		}
	}
}
