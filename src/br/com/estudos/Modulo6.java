package br.com.estudos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Modulo6 {

	public static void main(String[] args) {
		
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java",
                "Paulo Silveira");

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		Aluno a1 = new Aluno("Paulo", 12345);
		Aluno a2 = new Aluno("Sonia", 45789);
		Aluno a3 = new Aluno("Elena", 34567);
		Aluno a4 = new Aluno("Ellen", 76789);
		
		Set<Aluno> alunos = new HashSet<>();
		
		javaColecoes.matricular(a1);
		javaColecoes.matricular(a2);
		javaColecoes.matricular(a3);
		javaColecoes.matricular(a4);
		
		javaColecoes.getAlunos().forEach(aluno ->{
			System.out.println(aluno);
		});
		
		Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
		
	}

}
