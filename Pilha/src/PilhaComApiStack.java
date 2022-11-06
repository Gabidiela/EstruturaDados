import java.util.Stack;

public class PilhaComApiStack {

	public static void main(String[] args) {
	
		/*
		 * Na linguagem Java temos uma Api j� desenvolvida para trabalharmos com pilha
		 * . O c�digo abaixo, demostra seu uso*/
		
		Stack<String> nomes = new Stack<String>();
		
		//Adicionando nomes (push)
		
		nomes.push("Mariana");
		nomes.push("Icaro");
		nomes.push("Hamilton");
		nomes.push("Gustavo");
		nomes.push("Gabriela");
		nomes.push("Brendo");
		nomes.push("Ariane");
		System.out.println("Nomes inseridos na Pilha: " + nomes);
		
		//Removendo elementos (pop)
		
		nomes.pop();
		nomes.pop();
		System.out.println("Ap�s remover 02 nomes a nova lista � : " + nomes);
		
		//Verificar elemento do topo
		String r1 = nomes.peek();
		System.out.println("O elemento do topo � : " + r1);
		
	}

}
