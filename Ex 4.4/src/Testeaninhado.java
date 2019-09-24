import java.util.Scanner;
public class Testeaninhado {
	private static Scanner entrada;

	public static void main(String[] args) {
        int num;
        entrada = new Scanner(System.in);
        Laçosaninhados teste = new Laçosaninhados();
        System.out.print("Insira o valor : ");
        num = entrada.nextInt();
        teste.laçofor(num);

    }
}

