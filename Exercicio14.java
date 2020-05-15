package ListaVetor;
import java.util.Scanner;
public class Exercicio14 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vetor1[] = new int[15];
		int cont = 0;
		int aux = 0;		
		
		for(int i = 0; i < 15; i++) {
			vetor1[i] = ler.nextInt();
		}
		
		
		for(int i = 0;i < vetor1.length; i++) {
			
				for(int j = i +1; j < i ;j++) {
					if(vetor1[i] == 0) {
				vetor1[j -1] = vetor1[j];
									
					}
				}				
		}
		System.out.println("Os valores do vetor são: ");
		for(int i = 0;i < vetor1.length; i++) {
			System.out.println(vetor1[i]);
		}
	}

}
