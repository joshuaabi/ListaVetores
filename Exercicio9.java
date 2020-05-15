package ListaVetor;
import java.util.Scanner;
public class Exercicio9 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		int uniao[] = new int[10];
		
		int cont = 0;
		
		for(int i = 0 ; i < vetor1.length; i++) {
			System.out.println("Qual valor do vetor 1 na posição " + i);
			vetor1[i] = ler.nextInt();
			
			for(int j = 0; j < vetor2.length; j++) {
			System.out.println("Qual valor do vetor 2 na posição " + j);
			vetor2[j] = ler.nextInt();
			
			if(vetor1[i] == vetor2[j]) {
				cont = vetor1[i];
				uniao[i] = cont;
				
				} 
				if(uniao[i] == uniao[j]) {
					System.out.println("Não pode haver numeros repetidos");
					break;
				}
			}
		}
		for(int i = 0 ; i< uniao.length; i++) {
			System.out.println(uniao[i]);
		}
	}
}
