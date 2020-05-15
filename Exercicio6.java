package ListaVetor;
import java.util.Scanner;
public class Exercicio6 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vetor1[] = new int[10];
		int vetor2[] = new int[10];
		
		
		
		for(int i  = 0; i < vetor1.length; i++) {
			
			vetor1[i] = ler.nextInt();
			
			vetor2[i]= vetor1[i] * vetor1[i];
		}
		for(int i = 0; i< vetor2.length; i++) {
			
			System.out.println("O Quadrado do elemento na posição "+ i + " é: "+vetor2[i] );
		}
	}

}
