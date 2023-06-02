package Lista_Sequencial;

public interface FilaInterface {

	public void incluir(int valor);
	
	public Elemento remover() throws FilaVaziaException;
	
	public boolean filaVazia() ;
	
	public void limpar(int posicao);



	
}
