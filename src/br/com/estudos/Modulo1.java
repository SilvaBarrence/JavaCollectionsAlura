package br.com.estudos;

import java.util.ArrayList;
import java.util.Collections;

public class Modulo1 {

	public static void main(String[] args) {

		String curso1 = "Java 11: Tire proveito dos novos recursos da linguagem";
		String curso2 = "Apache Camel";
		String curso3 = "Certificacao Java SE 8 Programmer I";

		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);

		//======Ordenando a lista=======
		Collections.sort(cursos);

		System.out.println("======Adicionando=======");
		System.out.println(cursos);

		System.out.println("=======Removendo======");
		cursos.remove(1);
		System.out.println(cursos);

		System.out.println("======Procurando=======");
		System.out.println("O primeiro curso ?: " + cursos.get(0));

	}

}
