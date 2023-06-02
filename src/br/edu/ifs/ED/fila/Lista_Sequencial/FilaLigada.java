package Lista_Sequencial;

public class FilaLigada implements FilaInterface {

	private Elemento primeiro;
	private int tamanho;
	private Elemento ultimo;

	public FilaLigada() {
		super();
		this.tamanho = 0;
	}

	public Elemento getPrimeiro() {
		return primeiro;
	}

	public Elemento getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento ultimo) {
		this.ultimo = ultimo;
	}

	public void setPrimeiro(Elemento primeiro) {
		this.primeiro = primeiro;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public void incluir(int valor) {
		Elemento novoElemento = new Elemento(valor);
		if (filaVazia()) {
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		} else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}
		this.tamanho++;
	}
	@Override
	public Elemento remover() throws FilaVaziaException {
		if (filaVazia()) {
			throw new FilaVaziaException("lista vazia");
		}
		Elemento removido = this.primeiro;
		this.primeiro = this.primeiro.getProximo();
		removido.setProximo(null);
		this.tamanho--;
		
		return removido;
	}

	@Override
	public boolean filaVazia() {
		return getTamanho() == 0;
	}

	@Override
	public void limpar(int posicao) {
		primeiro = null;
		this.tamanho = 0;
		
	}

}
