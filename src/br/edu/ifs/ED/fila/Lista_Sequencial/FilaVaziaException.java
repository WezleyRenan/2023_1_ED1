package Lista_Sequencial;

public class FilaVaziaException extends Exception {
	
	public FilaVaziaException() {
		super("fila vazia");
	}
	public FilaVaziaException(String mensagem) {
		super(mensagem);
	}
	
	

}
