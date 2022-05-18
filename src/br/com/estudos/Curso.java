package br.com.estudos;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
	
	private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
	
	 public Curso(String nome, String instrutor) {
	        this.nome = nome;
	        this.instrutor = instrutor;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int getTempoTotal(){
	        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	    }

		public String getInstrutor() {
	        return instrutor;
	    }

	    public List<Aula> getAulas() {
	        return Collections.unmodifiableList(this.aulas);
	    }

		public void adicionar(Aula aulas) {
			this.aulas.add(aulas);
			
		}

		@Override
		public String toString() {
			return "[Curso: " + this.nome +", tempo total= "+this.getTempoTotal()+ ", instrutor=" + this.instrutor + ", aulas[" + this.aulas + "]";
		}
		
		

}
