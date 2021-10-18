import java.util.Scanner;

public class EntendendoVetor {

	public static void main(String[] args) {

		// new int[50] = 50 é um tamanho... vetor vai guardar 50 números
		int vetor[] = new int[50];
		Scanner leitor = new Scanner(System.in);

		vetor[0] = 1977;
		System.out.println("Digite um valor: ");
		vetor[1] = leitor.nextInt();

		System.out.println("Na primeira posição tem: " + vetor[0]);
		System.out.println("Na segunda posição tem: " + vetor[1]);
		leitor.close();
	}

}
