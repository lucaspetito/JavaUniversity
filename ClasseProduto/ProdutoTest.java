package ClasseProduto;

public class ProdutoTest {
	public static void main(String[] args) {
		Produto p1 = new Produto("caneta", 10, 0.10);
		Produto p2 = new Produto("macarrao", 20, 0.16);

		double precoFinal1 = p1.PrecoComDesconto();
		double precoFinal2 = p2.PrecoComDesconto(0.20);
		var mediaCarrinho = (precoFinal1 + precoFinal2 / 2);

		System.out.println(mediaCarrinho);
		System.out.println(" ");
		System.out.println(p1.desconto);
		System.out.println(p1.preco);
		System.out.println(p1.nome);
		System.out.println(" ");
		System.out.println(p2.nome);
		System.out.println(p2.desconto);
		System.out.println(p2.preco);

	}

}
