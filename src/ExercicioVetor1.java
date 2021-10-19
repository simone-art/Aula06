import java.util.Scanner;

public class ExercicioVetor1 {

	public static void main(String[] args) {
		// Faça um programa que permita ao usuário digitar 30 atividades que ele
		// realizou no dia.
		// Ao final, o programa deve possibilitar que o usuário escolha
		// se quer exibir as atividades na ordem em que digitou ou em ordem reversa.

		String atividade[] = new String[3];
		Scanner leitor = new Scanner(System.in);
		int opcao;

		for (int i = 0; i < atividade.length; i++) {
			System.out.println("Por favor digite a " + (i + 1) + " atividade: ");
			atividade[i] = leitor.nextLine();
		}
		
		System.out.println("Voce deseja exibir a suas atividades na ordem em que foram digitadas ou inversa? 1. Ordem, 2. Inversa");
		opcao= leitor.nextInt();
		if(opcao == 1) {
			//Exibir as atividades em ordem
			for (int i = 0; i < atividade.length; i++) {
				System.out.println(atividade[i]);
			}
		}else if(opcao == 2) {
			//Exibir as atividades em ordem inversa
			for (int i = atividade.length-1; i>=0; i--) {
				System.out.println(atividade[i]);
			}
			
		}else {
            System.out.println("Opção inválida");
        }
		
		//leitor.close();
	}
}