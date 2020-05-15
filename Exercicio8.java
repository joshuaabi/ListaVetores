package ListaVetor;
import java.util.Scanner;
public class Exercicio8 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vetor[] = new int[5];
		int vetor2[] = new int[5];
		
		System.out.println("Entre com os valores do vetor");
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = ler.nextInt();
		}
		
		//invertendo o vetor
		for(int i = 0; i < vetor.length; i++) {
			vetor2[i] = vetor[4 - i];
		}
		
		System.out.println("Insira o valor de código");
		int cod = ler.nextInt();
				
		switch(cod) {
		case 0:
			System.out.println("Encerrando o programa");
			break;
				
		case 1:
			System.out.println("O vetor na ordem direta é: ");
			for(int i = 0; i < vetor.length; i++) {
				System.out.println(vetor[i] + " ");
			}
			break;
			
		case 2:
			System.out.println("O vetor invertido é: ");
			for(int i = 0; i < vetor.length; i++) {
				System.out.println(vetor2[i] + " ");
			}
			break;
			
		default:
			System.out.println("O código é inválido");
			break;
		}
				
	}

}
