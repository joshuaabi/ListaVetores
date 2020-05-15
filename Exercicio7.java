package ListaVetor;
import java.util.Scanner;
public class Exercicio7 {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		
		int vetor[] = new int[10];
		int cont = 0;
		
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = ler.nextInt();
			
			if(vetor[i] % 2 == 0) {
				cont = cont + 1;
			}
		}
		System.out.println("Ele possui : " + cont + " Valores pares");
	}

}
