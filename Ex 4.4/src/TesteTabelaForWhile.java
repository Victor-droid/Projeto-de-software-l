
public class TesteTabelaForWhile {
    public static void main(String[] args) {
        TabelaForWhile teste = new TabelaForWhile();

        int nume[];
        nume = new int[3];
        nume[0]=4;
        nume[1]=1;
        nume[2]=0;
        for (int i = 0; i <= 2; i++) {
            System.out.println("-------------------------");
            System.out.print("Valor ");
            System.out.print(nume[i]);
            System.out.println(" : ");
            teste.laçofor(nume[i]);
            System.out.println("-----");
            teste.laçowhile(nume[i]);
            System.out.println("-----");
            teste.laçodowhile(nume[i]);
            System.out.println("-----");
            teste.laçowhilefor(nume[i]);

        }
        System.out.println("-------------------------");
        
    }
}

