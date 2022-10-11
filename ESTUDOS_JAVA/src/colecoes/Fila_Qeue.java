package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila_Qeue {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();
		//Diferença é quando a fila esta cheia!!!!
		fila.add("Ana"); // trata com uma execpcion
		fila.offer("Bia"); // não trata, mas funciona como add
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		System.out.println(fila.peek());	//retorna null caso a fila esteja vazia
		System.out.println(fila.element()); //retorna uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());	// ira retornar null
		System.out.println(fila.remove()); //retorna uma exceção
		}
}	
