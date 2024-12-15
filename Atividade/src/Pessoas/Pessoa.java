package Pessoas;

public class Pessoa {
	int cpf;
	int rg;
	String nome;
	String sobrenome;
	double altura;
	int anonasc;
	void nomecomp() {
		System.out.println(nome + " " + sobrenome);
	}
	int peso(int peso) {
		return peso;
	}
	int idade() {
		return 2024 - this.anonasc;
	}
}
