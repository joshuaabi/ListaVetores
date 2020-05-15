package ListaVetor;
import java.util.Scanner;
public class Exercicio2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int numeros;
		int x[] = new int[10];
		int y[] = new int[10];
		int vetorZ[] = new int[20];
		int cont = 0;
		
		int total = 0;
		
		for(int i =0;i< 20;i++) {
			numeros =ler.nextInt();
			
			
			if(i > 10) {
				for(int j = 0; j < 10; j++) {
					y[j] = numeros;
				}
			} else if( i < 10) {
				for(int g = 0 ; g < 10;g++) {
					x[g] = numeros;
				}
			}
		
		}								
		
				
		for(int i = 0; i < 20; i++) {
			
			
			if(i == 0) {
				vetorZ[cont] = x[i];
				cont++;
			} else if(i%2 == 0) {
				vetorZ[cont] = x[i];
				cont++;
				
			}
			else 
				
				vetorZ[cont] = y[i];
				cont++;
			
				
		}
		System.out.println("Os Valores intercalados são: ");
		for(int i = 0;i < vetorZ.length; i++) {
			System.out.print(vetorZ[i]+ " ");
		}
		
	}
}
		
	

