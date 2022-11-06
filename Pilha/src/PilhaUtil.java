
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
		pilha.insere("Ícaro");
		pilha.insere("Mariana");
		System.out.println("Nomes inseridos: " + pilha);

		// Removendo nomes

		String nomeRemover = pilha.remove();
		System.out.println("O nome removido foi:  " + nomeRemover);

		// Apresentando após a remoção

		System.out.println("A nova pilha é : " + pilha);

		// Para verificar se a Pilha está vazia
		System.out.println(" A pilha está vazia: " + pilha.vazia());
		
		//Mostrar o nome que está no Topo
		String topo = pilha.pegaTopo();
		System.out.println("Qual Elemento que está no Topo : " + topo);
	}


}
