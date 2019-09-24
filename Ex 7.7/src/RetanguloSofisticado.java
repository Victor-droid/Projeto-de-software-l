public class RetanguloSofisticado {
	private int x1, x2, x3, x4;
	private int y1, y2, y3, y4;

	public RetanguloSofisticado(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
		setXY(x1, x2, x3, x4, y1, y2, y3, y4);
	}

	public String setXY(int x1, int x2, int x3, int x4, int y1, int y2, int y3, int y4) {
		this.x1 = x1;
		this.x2 = x2;
		this.x3 = x3;
		this.x4 = x4;
		this.y1 = y1;
		this.y2 = y2;
		this.y3 = y3;
		this.y4 = y4;
		if (Retang()==1) {
			return "Retangulo";
		}
		if (Retang()==2) {
			return "Quadrado";
		}
		if (Retang()==0) {
			return "Nao eh Retangulo nem Quadrado";
		}
		return "Erro";
	}

	public int Retang() {
		if ((distancia(this.x1, this.y1, this.x2, this.y2) == distancia(this.x3, this.y3, this.x4, this.y4))
				&& (distancia(this.x2, this.y2, this.x3, this.y3) == distancia(this.x1, this.y1, this.x4, this.y4))
				&& (distancia(this.x1, this.y1, this.x2, this.y2) != distancia(this.x1, this.y1, this.x4, this.y4))) {
			return 1;
		}
		if ((distancia(this.x1, this.y1, this.x2, this.y2) == distancia(this.x3, this.y3, this.x4, this.y4))
				&& (distancia(this.x2, this.y2, this.x3, this.y3) == distancia(this.x1, this.y1, this.x4, this.y4))
				&& (distancia(this.x1, this.y1, this.x2, this.y2) != distancia(this.x1, this.y1, this.x4, this.y4))) {
			return 2;
		}
		return 0;
	}

	public float distancia(int x1, int y1, int x2, int y2) {
		return (float) Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
	}

	public float comprimento() {
		return distancia(this.x1, this.y1, this.x2, this.y2);
	}

	public float largura() {
		return distancia(this.x2, this.y2, this.x3, this.y3);
	}

	public float perimetro() {
		return 2 * comprimento() + 2 * largura();
	}

	public float area() {
		return comprimento() * largura();
	}

}
