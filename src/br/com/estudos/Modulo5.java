package br.com.estudos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Modulo5 {

	public static void main(String[] args) {
		
		 Set<String> alunos = new HashSet<>();
	        alunos.add("Paulo");
	        alunos.add("Alberto");
	        alunos.add("Pedro");    
	        alunos.add("Nico"); 
	      Boolean adicionar =  alunos.add("Pedro");  
	        
	        System.out.println(alunos.size());
	        for (String a : alunos) {
	        	System.out.println(a);
			}
	        System.out.println(adicionar);

		 Collection<Integer> numeros = new HashSet<>();

	        long inicio = System.currentTimeMillis();

	        for (int i = 1; i <= 50000; i++) {
	            numeros.add(i);
	        }
	        
	        long fimC = System.currentTimeMillis();

	        long tempoDeExecucaoC = fimC - inicio;

	        System.out.println("Tempo gasto para criar: " + tempoDeExecucaoC);

	        for (Integer numero : numeros) {
	            numeros.contains(numero);
	        }

	        long fimB = System.currentTimeMillis();

	        long tempoDeExecucaoB = fimB - inicio;

	        System.out.println("Tempo gasto para buscar: " + tempoDeExecucaoB);

	}

}
