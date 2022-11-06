import java.util.LinkedList;
import java.util.List;

public class PilhasComList {
	/*
	 * Fazendo a implementação de uma Pilha com a Lista Duplamente Ligada
	 * 
	 * => Primeiramente criamos a Lista nomes => Criamos os métodos básicos de uma
	 * pIlha =>Inserir => Remover =>Verificar se está Vazia => Método toString para
	 * não mostrar o endereço de memória
	 */

	private List<String> nomes = new LinkedList<>();

	// Para inserir elementos da Pilha
	public void insere(String nome) {
		this.nomes.add(nome);

	}

	// Para remover elementos da Pilha
	public String remove() {
		return nomes.remove(nomes.size() - 1);
	}

	// Para verificar se a pilha está vazia
	public boolean vazia() {
		return nomes.size() == 0;
	}

	// Método toString
	@Override
	public String toString() {
		return this.nomes.toString();
	}

}
