package RevisaoProva;

public class Produtos {

	String descricao;
	double valor;
	int quantidade;

	void Produto(String Descricao, double Valor, int Quantidade) {
		descricao = Descricao;
		valor = Valor;
		quantidade = Quantidade;
	}

	void EstaNoCarrinho() {
		Produto(descricao, valor, quantidade);
	}
}
