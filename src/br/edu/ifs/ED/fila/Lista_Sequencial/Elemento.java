package Lista_Sequencial;

public class Elemento {
	
	private Integer valor;
	private int ordem;
	private Elemento proximo;

	public Elemento(int valor) {
		this.valor = valor;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Elemento getProximo() {
		return proximo;
	}
	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}
	
	

}
