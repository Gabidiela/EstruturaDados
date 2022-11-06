
public class PilhaUtil {

	public static void main(String[] args) {

		PilhasComList pilha = new PilhasComList();
		// Usando a classe Pilhas com List

		// Inserindo nomes

		pilha.insere("Ariane");
		pilha.insere("Brendo");
		pilha.insere("Gabriela");
		pilha.insere("Gustavo");
		pilha.insere("Hamilton");
		pilha.insere("�caro");
		pilha.insere("Mariana");
		System.out.println("Nomes inseridos: " + pilha);

		// Removendo nomes

		String nomeRemover = pilha.remove();
		System.out.println("O nome removido foi:  " + nomeRemover);

		// Apresentando ap�s a remo��o

		System.out.println("A nova pilha � : " + pilha);

		// Para verificar se a Pilha est� vazia
		System.out.println(" A pilha est� vazia: " + pilha.vazia());
		
		//Mostrar o nome que est� no Topo
		String topo = pilha.pegaTopo();
		System.out.println("Qual Elemento que est� no Topo : " + topo);
	}


}
