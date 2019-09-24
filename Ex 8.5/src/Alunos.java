public class Alunos {
	private int nota1, nota2, nota3, nota4;
	private String curso;

	public Alunos(int a, int b, int c, int d, String curso) {
		setnota(a, b, c, d);
		setcurso(curso);

	}

	private void setnota(int a, int b, int c, int d) {
		this.nota1 = a;
		this.nota2 = b;
		this.nota3 = c;
		this.nota4 = d;
	}

	private void setcurso(String curso) {
		this.curso = curso;
	}
	
	public String getCurso() {		
		return this.curso;
	}

	public String Aprovado() {
		if ((this.nota1 + this.nota2 + this.nota3 + this.nota4) / 4 >= 7) {
			return "Aprovado";
		}
		return "Reprovado";
	}
}
