package ListaVetor;
import java.util.Scanner;
public class Exercicio10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int numeros;
		int cont = 0;
		for(int i = 0; i < 10;i++) {
			vetor[i] = ler.nextInt();
			cont = vetor[i];
			
			for(int j = 0; j < i ; j++) {
				if(vetor[j] == cont) {
					System.out.println("Informe o valor novamente");
					vetor[i] = ler.nextInt();
				}
					
			}
			
		}
		System.out.println("Os valores do vetor são: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+ " ");
			
		}
	}

}
