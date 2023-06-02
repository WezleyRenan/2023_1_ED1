package br.edu.ifs.ED.fila;

public class FilaCheiaException extends Exception {
	
	public FilaCheiaException() {
		super("fila está cheia");
	}

	public FilaCheiaException(String mensagem) {
		super(mensagem);
	}
}
