package br.com.estudos;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Modulo4 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
		javaColecoes.adicionar(new Aula("POO", 22));
		javaColecoes.adicionar(new Aula("CSS", 42));
		javaColecoes.adicionar(new Aula("HTML", 12));
		javaColecoes.adicionar(new Aula("JAVA 11", 80));
		javaColecoes.adicionar(new Aula("AWS", 54));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		
		System.out.println("========== Ordenada ==============\n");
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println("\n========== Total de tempo dos cursos ==============\n");
		System.out.println("Tempo total das aulas: "+javaColecoes.getTempoTotal());
		
		System.out.println("\n========== Ajeitando toString ==============\n");
		System.out.println(javaColecoes.toString());
		
		System.out.println("\n========== Ivertendo a ordem da lista ==============\n");
		Collections.reverse(aulas);
		System.out.println(aulas);
		
		System.out.println("\n========== misturar a ordem da lista ==============\n");
		Collections.shuffle(aulas);
		System.out.println(aulas);
		
		System.out.println("\n========== devolve uma lista imutável que contêm um único elemento especificado ==============\n");
		Collections.singletonList(aulas);
		System.out.println(aulas);
		
		List<Type> list = new ArrayList<Type>(Collections.nCopies(10, (Type)null));
		System.out.println(list);
	
	}

}
