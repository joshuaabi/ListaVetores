package ListaVetor;
import java.util.Scanner;
public class Exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vetor[] = new int[20];
		int cont = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = ler.nextInt();
						
		}
		System.out.println("Os valores do vetor são: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
				
		for(int i =0; i < 20; i++) {
			cont = vetor[i];
			vetor[i] = vetor[19 - i];
			vetor[19 - i] = cont;
							
		}
		System.out.println("O novo vetor é: ");
		for(int i  = 0; i < vetor.length;i++) {
			System.out.println(vetor[i]);
		}
			
	}

}
