package br.com.estudos;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Modulo8 {

	public static void main(String[] args) {

//		List<String> letras = new LinkedList<>();
//		letras.add("A");
//		letras.add("B");
//		letras.add("C");
//		
//		
//		letras.forEach(letra -> {
//		    System.out.println(letra);
//		});
//	
//		System.out.println("==========Com iterator===============");
//		Iterator<String> it = letras.iterator();
//		
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
		
		Funcionario f1 = new Funcionario("Barney", 12);
        Funcionario f2 = new Funcionario("Jonatan", 9);
        Funcionario f3 = new Funcionario("Guaraciara", 13);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterador = funcionarios.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next().getNome());
        } 
    }

}
