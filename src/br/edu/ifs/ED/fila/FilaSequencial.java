package br.edu.ifs.ED.fila;

public class FilaSequencial<T> implements IFila<T> {
    private int max;
    private T[] dados;
    private int qtd;
    public FilaSequencial(Class<T> dataType){
        this.max = 10;
        this.dados = (T[]) java.lang.reflect.Array.newInstance(dataType, this.max);
        this.qtd = 0;

    }
    public void incluir(T valor) throws FilaCheiaException {
    	if (getQtdMaxSuportada() == getQtd() ) {
    		throw new FilaCheiaException("fila está cheia. não é possivel incluir!!!");
    	}
    	dados[qtd] = valor; //Adicionar elementos na ultima posiçao
    	qtd++;

    }
    public T remover() throws FilaVaziaException{
    	if (estaVazia()) {
    		throw new FilaVaziaException("fila está vazia. não é possivel remover!!!");
    	}
    	T elementoRemovido = dados[0];

        // Deslocar os elementos restantes para preencher o espaço vazio no início
        for (int i = 0; i < qtd - 1; i++) {
            dados[i] = dados[i + 1];
        }

        qtd--;
        dados[qtd] = null; // Limpar a última posição

        return elementoRemovido;
    }

    
    public int getQtd() {
        return  qtd;
    }

    @Override
    public int getQtdMaxSuportada() {
        return max;
    }

    public boolean estaVazia() {
        return qtd == 0;
    }
    
    public void limpar(){
    	for (int i = 0; i < qtd; i++) {
            dados[i] = null;
        }

        qtd = 0;
    }
    public T visualizarProximo() throws FilaVaziaException{
    	if (estaVazia()) {
    		throw new FilaVaziaException("fila está vazia. não foi possivel vizualizar");
    	}
        return dados[0];
    }

}
