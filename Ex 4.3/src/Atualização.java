public class Atualização {

    public int x;

    public int Regras(int x) {
        while (x > 1) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                x = 2 * x / 3 + 1;
            }
            System.out.println(x);
            if (x == 3) {
                System.out.println("1");
                x = 1;
            }
        }

        return 0;

    }
}