package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {

		HashSet conjunto = new HashSet();
		conjunto.add(1.2); // double
		conjunto.add(true); // boolean
		conjunto.add("teste"); // string
		conjunto.add(5); // int
		conjunto.add('x'); // char

		System.out.println(conjunto.size()); // tamanho do set
		System.out.println(conjunto.remove("teste")); // remover do conjunto
		System.out.println(conjunto.size());
		System.out.println(conjunto.contains('x'));

		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);

		System.out.println(nums);
		System.out.println(conjunto);

		conjunto.addAll(nums);

		System.out.println(conjunto);
	}
}
