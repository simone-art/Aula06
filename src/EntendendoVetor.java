import java.util.Scanner;

public class EntendendoVetor {

	public static void main(String[] args) {

		// new int[50] = 50 é um tamanho... vetor vai guardar 6 anos de files
		int vetor[] = new int[6];
		Scanner leitor = new Scanner(System.in);
		System.out.println("O tamanho do vetor é: " + vetor.length);

		for(int i = 0; i<6; i++) {
			System.out.println("Digite o ano de lançamento de um filme: ");
			vetor[i] = leitor.nextInt();
		}
		
		for(int i = 0; i<6; i++) {
			System.out.println("O filme foi lançado em: " + vetor[i]);
		}
		
		leitor.close();
	}

}
