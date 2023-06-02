package Lista_Sequencial;

import java.util.Scanner;

public class Programa{

	public static void main(String[] args) {

		FilaLigada fila = new FilaLigada();
		Scanner input = new Scanner(System.in);
		char opcao = 's';
		int numero;

		while(opcao == 's') {
			System.out.println("adicione um numero");
			numero = input.nextInt();
			fila.incluir(numero);
			System.out.println("deseja continuar adicionando? s/n");
			opcao = input.next().charAt(0);
		}
		System.out.println(fila.getTamanho());
		try {
			System.out.println("liberando a fila");
			while (fila.getTamanho() > 0) {
				System.out.println(fila.getPrimeiro().getValor());
				fila.remover();
			}
		} catch (FilaVaziaException erro) {
			System.out.println(erro.getMessage());

		}
	}

}
