package poos3_semana12_ex_junior.entities;

public class Curso {
	
	private String nome;
	private double duracao;
	private CursoArqEnum cursos;
	

	public Curso( String nome, double duracao, CursoArqEnum cursos) {
		this.nome = nome;
		if(duracao > 0) {
			this.duracao = duracao;
		}
		else {
			throw new DurationException("Duração Inválida");
		}
		this.cursos = cursos;
		
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	
	public CursoArqEnum getCursos() {
		return cursos;
	}

	public void setCursos(CursoArqEnum cursos) {
		this.cursos = cursos;
	}
	

}
