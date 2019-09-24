public class TesteAlunos {
	public static void main(String[] args) {
		Alunos a1 = new Alunos(8, 7, 6, 5, "Computacao");
		System.out.println(a1.Aprovado() + " em " + a1.getCurso());
	}

}