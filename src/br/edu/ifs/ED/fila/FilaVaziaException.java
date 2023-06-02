package br.edu.ifs.ED.fila;

public class FilaVaziaException extends Exception {
	
	public FilaVaziaException() {
		super("a fila está vazia");
	}
	public FilaVaziaException(String mensagem) {
		super(mensagem);
	}
	
}
