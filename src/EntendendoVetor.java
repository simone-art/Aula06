import java.util.Scanner;

public class EntendendoVetor {

	public static void main(String[] args) {

		// new int[50] = 50 � um tamanho... vetor vai guardar 50 n�meros
		int vetor[] = new int[50];
		Scanner leitor = new Scanner(System.in);

		vetor[0] = 1977;
		System.out.println("Digite um valor: ");
		vetor[1] = leitor.nextInt();

		System.out.println("Na primeira posi��o tem: " + vetor[0]);
		System.out.println("Na segunda posi��o tem: " + vetor[1]);
		leitor.close();
	}

}
