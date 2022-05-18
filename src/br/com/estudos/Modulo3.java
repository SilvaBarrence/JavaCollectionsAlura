package br.com.estudos;

import java.util.List;

public class Modulo3 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adicionar(new Aula("POO", 22));
		javaColecoes.adicionar(new Aula("CSS", 42));
		javaColecoes.adicionar(new Aula("HTML", 12));
		List<Aula> aulas = javaColecoes.getAulas();
		System.out.println(aulas);
	
	}

}
