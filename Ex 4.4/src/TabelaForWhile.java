
public class TabelaForWhile {

	    int la�ofor(int n) {
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i * j);
	                System.out.print(" ");
	            }
	            System.out.println();
	        }
	        return 0;
	    }

	    int la�owhile(int n) {
	        int i = 1, j;
	        while (i <= n) {
	            j = 1;
	            while (j <= i) {
	                System.out.print(i * j);
	                System.out.print(" ");
	                j++;
	            }
	            System.out.println();
	            i++;
	        }
	        return 0;
	    }

	    int la�odowhile(int n) {
	        int i = 1, j;
	        if (n != 0) {
	            do {
	                j = 1;
	                do {
	                    System.out.print(i * j);
	                    System.out.print(" ");
	                    j++;
	                } while (j <= i);
	                System.out.println();
	                i++;
	            } while (i <= n);
	        }
	        return 0;
	    }

	    int la�owhilefor(int n) {
	        int j;
	        for (int i = 1; i <= n; i++) {
	            j = 1;
	            do {
	                System.out.print(i * j);
	                System.out.print(" ");
	                j++;
	            } while (j <= i);
	            System.out.println();
	        }
	        return 0;
	    }
	}
