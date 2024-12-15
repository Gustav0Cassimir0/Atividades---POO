package Lâmpadas;

public class Lâmpada {
	double ConsumoEnergia;
	String cor;
	String formato;
	double preço;
	int lux;
	void indilumin(int area) {
		int ilumi = lux * area;
		System.out.println("o indice de iluminação de seu cômodo é de: " + ilumi);
	}
	int lx() {
		return lux;
	}
	void reais() {
		System.out.println("o preço de sua lâmpada é de; " + preço);
	}
}
