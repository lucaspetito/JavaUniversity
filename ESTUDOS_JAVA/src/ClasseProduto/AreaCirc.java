package ClasseProduto;

public class AreaCirc {
	double raio;
	static double pi = 3.14;

	public AreaCirc(double raioInicial) {
		pi = 3.14;
		raio = raioInicial;
	}

	double Area() {
		return pi * Math.pow(raio, 2);
	}

}
