import java.util.Scanner;

public class ExercicioVetor2 {

	private static final String mensagemAluno = "Chamar aluno para conversar. O nome dele ou dela é:";

	public static void main(String[] args) {
		// O professor Wuni Jim Yensonal precisa de um programa para ajudar com um
		// problema simples:
		// para uma turma com 50 alunos precisa calcular a média da sala
		// e descobrir quais são os alunos que precisarão de um atendimento
		// personalizado.
		// O fluxo do programa deve ser o seguinte:
		// A. Digitar as 50 notas em um vetor e, para cada nota digitada,
		// digitar o nome do aluno correspondente em outro vetor
		// B. Calcular a média das notas digitadas
		// C. Para cada uma das notas que foi digitada e ficou abaixo da média,
		// exibir uma mensagem que diga “Chamar o aluno para conversar”

		// Criar variáveis
		double notas[] = new double[2];
		// length retorna o tamanho do vetor
		String nomes[] = new String[notas.length];
		double media = 0;
		Scanner leitor = new Scanner(System.in);

		// Calcular as notas em um vetor e os nomes em outro
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Por favor, informe a nota do " + (i + 1) + "º aluno: ");
			notas[i] = leitor.nextDouble();
			System.out.print("Por favor, informe o nome deste aluno: ");
			nomes[i] = leitor.next();
			media = media + notas[i];
		}

		// Calcular a média
		media = media / (double) notas.length;
		System.out.println("A mêdia da turma é: " + media);

		// Para cada nota que estiver abaixo da média, exibir uma mensagem.
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] < media) {
				System.out.println(mensagemAluno + nomes[i]);
				System.out.println("===================================");

			}

		}

	}
}
