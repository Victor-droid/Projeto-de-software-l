public class Passaros {
	private String especie;
	private double preco;
	private int numGai, Temp;


	public Passaros(String especi, double prec, int numGa, int Tem) {
		setEspecie(especi);
		setPreco(prec);
		setNumGai(numGa);
		setTemp(Tem);
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getNumGai() {
		return numGai;
	}

	public void setNumGai(int numGai) {
		this.numGai = numGai;
	}

	public int getTemp() {
		return Temp;
	}

	public void setTemp(int temp) {
		Temp = temp;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
}