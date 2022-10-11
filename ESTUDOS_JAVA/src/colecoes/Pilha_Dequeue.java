package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha_Dequeue {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		livros.add("O pequeno Principe");
		livros.push("Don quixote");
		livros.push("O hobbit"); 
		for(String livro : livros) {
			System.out.println(livro);
		}
		System.out.println("");
		
		// ultimo a entrar é o primeiro a sair
		System.out.println(livros.peek());
		System.out.println(livros.poll());
		
		System.out.println("");
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		//System.out.println(livros.remove());
		
		
	}
}
