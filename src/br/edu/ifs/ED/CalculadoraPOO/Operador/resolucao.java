package Operador;

public abstract class Resolucao implements Leitor {

	public Resolucao() {
		super();

	}

	public static double getOperacoes(int O, double N, double M) throws Exception {
		double resultado = 0;

		if (O == 1) {
			resultado = N + M;
		}
		if (O == 2) {
			resultado = N - M;
		}
		if (O == 3) {
			if (M == 0) {
				throw new Exception("Não pode ser dividido por 0");
			}
			resultado = N / M;
			
		}
		if (O == 4) {
			resultado = N * M;
		}
		if (O == 5) {
			if ((N + M) < 0) {
				throw new Exception("Não existe Raiz quadrada para numero negativo");
			}
			resultado = Math.sqrt(N + M);
		}
		if (O == 6) {
			resultado = Math.pow(N, M);
		}
		return resultado;

	}
}