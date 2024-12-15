package Alunos;

public class Aluno {
	int matrícula;
	String curso;
	int período;
	String nome;
	String sobrenome;
	void SalaDoAluno() {
		System.out.println("o aluno faz o p" + período + " de " + curso);
	}
	String NomeCompleto() {
		return (nome + " " + sobrenome);
	}
	String idade(String idade) {
		return ("o(a) aluno(a) tem " + idade + " anos.");
	}
}