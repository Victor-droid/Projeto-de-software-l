import java.util.Scanner;
public class TesteAtualiza��o {
	private static Scanner entrada;

	public static void main(String[] args) {
		int num;
		entrada = new Scanner(System.in);
		Atualiza��o teste = new Atualiza��o();
		System.out.print("Insira o valor :");
		num = entrada.nextInt();
		teste.Regras(num);
	
	}
}
