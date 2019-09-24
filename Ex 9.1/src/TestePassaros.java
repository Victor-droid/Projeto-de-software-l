import java.util.ArrayList;
import java.util.List;

public class TestePassaros {
	public static void main(String[] args) {
		List<Passaros> Passaros = new ArrayList<Passaros>();
		Passaros P = new Passaros("Piriquito", 5, 1, 6);
		Passaros M = new Passaros("Calopsita", 15, 2, 12);
		Passaros J = new Passaros("Piriquito", 5, 1, 3);
		Passaros L = new Passaros("Piriquito", 5, 1, 1);
		Passaros.add(P);
		Passaros.add(M);
		Passaros.add(J);
		Passaros.add(L);
		System.out.println("Valor no estoque : " + Estoque(Passaros) + "$");
		System.out.println("Quantidade de Passaros no estoque : " + Passaros.size());
		System.out.println("O passaro mais antigo é " + MaisAntigo(Passaros));

	}

	public static double Estoque(List<Passaros> passaros) {
		double total = 0;
		for (int i = 0; i < passaros.size(); i++) {
			total += ((Passaros) passaros.get(i)).getPreco();
		}

		return total;
	}

	public static Object MaisAntigo(List<Passaros> passaros) {
		int tempo = 0;
		Object obj = null;
		for (int i = 0; i < passaros.size(); i++) {
			if (((Passaros) passaros.get(i)).getTemp() > tempo) {
				tempo = ((Passaros) passaros.get(i)).getTemp();
				obj = ((Passaros) passaros.get(i));
			}
		}
		return obj;
	}
}