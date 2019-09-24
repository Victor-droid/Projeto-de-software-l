

 /*Retangulo no seguinte formato
  * D--------C
  * |		 |
  * |	     |
  * A--------B
  *RetanguloSot(Ax, Bx, Cx, Dx, Ay, By, Cy, Dy);
  *
  *
  *
  */
public class RetanguloTeste {
	public static void main(String[] args) {
		RetanguloSofisticado r = new RetanguloSofisticado(1, 3, 3, 1, 2, 2, 5, 5);
		System.out.println("Area : " + r.area());
		System.out.println("Perimetro :" + r.perimetro());
		System.out.println("Largura :" + r.largura());
		System.out.println("Comprimento :" + r.comprimento());
	}
}
