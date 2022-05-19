package br.com.estudos;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
	
	private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<Aula>();
    private Set<Aluno> alunos = new HashSet<>();
	
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

		public void adiciona(Aula aulas) {
			this.aulas.add(aulas);
		}

		@Override
		public String toString() {
			return "[Curso: " + this.nome +", tempo total= "+this.getTempoTotal()+ ", instrutor=" + this.instrutor + ", aulas[" + this.aulas + "]";
		}
		
		public void matricular(Aluno aluno){
		    this.alunos.add(aluno);
		}
		
		public Set<Aluno> getAlunos() {
		    return Collections.unmodifiableSet(alunos);
		}

}
