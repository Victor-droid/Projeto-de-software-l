
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
            teste.la�ofor(nume[i]);
            System.out.println("-----");
            teste.la�owhile(nume[i]);
            System.out.println("-----");
            teste.la�odowhile(nume[i]);
            System.out.println("-----");
            teste.la�owhilefor(nume[i]);

        }
        System.out.println("-------------------------");
        
    }
}

