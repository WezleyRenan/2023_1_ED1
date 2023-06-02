package Fila;

public class FilaCheiaException extends Exception {
	
	public FilaCheiaException() {
		super("fila está cheia");
	}

	public FilaCheiaException(String mensagem) {
		super(mensagem);
	}
}
