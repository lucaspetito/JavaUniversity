package ClasseProduto;

public class Produto {

	String nome;
	double preco;
	double desconto;

	Produto(String nomeInicial, double precoInicial, double descontoInicial) {
		this.nome = nomeInicial;
		this.preco = precoInicial;
		this.desconto = descontoInicial;
	}

	double PrecoComDesconto() {
		return preco * (1 - desconto);
	}

	double PrecoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}

}
