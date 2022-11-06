import java.util.LinkedList;
import java.util.List;

public class PilhasComList {
	/*
	 * Fazendo a implementa��o de uma Pilha com a Lista Duplamente Ligada
	 * 
	 * => Primeiramente criamos a Lista nomes => Criamos os m�todos b�sicos de uma
	 * pIlha =>Inserir => Remover =>Verificar se est� Vazia => M�todo toString para
	 * n�o mostrar o endere�o de mem�ria
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

	// Para verificar se a pilha est� vazia
	public boolean vazia() {
		return nomes.size() == 0;
	}

	// M�todo toString
	@Override
	public String toString() {
		return this.nomes.toString();
	}

}
