package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<Usuario> lista =  new ArrayList<Usuario>(); // criacao lista usuario
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		lista.add(new Usuario("Marcos")); // ciação de novo usuario
		lista.add(new Usuario("Marcelo")); // ciação de novo usuario
		lista.add(new Usuario("Mathias")); // ciação de novo usuario
		
		
		System.out.println(lista.get(3).nome); // retorna um elemnto dentro de lista.
		
		lista.remove(0);
		
		for (Usuario u : lista) { //imprimir cada usuario dentro de lista
			System.out.println(u);
		}
	}

}
