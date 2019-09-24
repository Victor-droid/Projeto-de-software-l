import java.util.Scanner;
public class TesteAtualização {
	private static Scanner entrada;

	public static void main(String[] args) {
		int num;
		entrada = new Scanner(System.in);
		Atualização teste = new Atualização();
		System.out.print("Insira o valor :");
		num = entrada.nextInt();
		teste.Regras(num);
	
	}
}
