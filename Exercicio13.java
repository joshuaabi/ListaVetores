package ListaVetor;
import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int vetorX[]= new int[10];
		int vetorY[] = new int[10];
		int vetorRS[] = new int[10];
		int vetorRP[] = new int[10];
		int vetorRI[] = new int[10];
		int vetorRD[] = new int[10];
		int cont = 0;
		int aux = 0;
		System.out.println("Informe os valores do vetor X, Não repetir");
		for(int i = 0; i < vetorX.length; i++) {
			vetorX[i] = ler.nextInt();
			
		}System.out.println("Informe os valores do vetor Y, Não repetir");
		for(int i = 0 ; i <vetorY.length; i++) {
			vetorY[i] = ler.nextInt();
		}
		
		for(int i = 0 ; i < vetorRS.length; i++) {
			vetorRS[i] = vetorX[i] + vetorY[i];
			
		}
		for(int i = 0; i < vetorRP.length; i++) {
			vetorRP[i] = vetorX[i]*vetorY[i];
		}
		
		for(int i = 0; i < vetorX.length;i++) {
			for(int j = 0; j < vetorY.length;j++) {
				if(vetorX[i] == vetorY[j]) {
				vetorRI[i] = vetorX[i];
				cont = cont +1;
				} 
					
					
			}
		}
		System.out.println("O Resultado da Soma é :");
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(vetorRS[i]);
		}
		System.out.println("O resultado do Produto é: ");
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(vetorRP[i]);
		}
		System.out.println("O resultado da Intersecção é: ");
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(vetorRI[i]);
		}
		System.out.println("O resultado da Diferença é: ");
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(vetorRD[i]);
		}
	}
}
