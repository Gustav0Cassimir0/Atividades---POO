package Carros;

public class Carro {
	String Marca;
	String Modelo;
	int Ano;
	int CapacidadeDePessoas;
	double CapacidadeCombustivel;
	double ConsumoCombustivel;
	void exibirAutonomia() {
		double autonomia = CapacidadeCombustivel * ConsumoCombustivel;
		System.out.println("A autonomia do veículo é " + autonomia);
	}
		double obterAutonomia() {
		System.out.println("O método obterAutonimia foi chamado");
		return ConsumoCombustivel * ConsumoCombustivel;
		}
		double calcularCombustivel(double km) {
		double qtdCombustivel = km / ConsumoCombustivel;
		return qtdCombustivel;
		}
}