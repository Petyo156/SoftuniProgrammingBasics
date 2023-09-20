import java.util.Scanner;

public class _8_redicaChisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broiChisla = Integer.parseInt(scanner.nextLine());
        int naiGolqmo=Integer.MIN_VALUE;
        int naiMalko=Integer.MAX_VALUE;
        for(int i = 0; i<broiChisla; i++)
        {
            int chislo = Integer.parseInt(scanner.nextLine());
            if(chislo>naiGolqmo)
            {
                naiGolqmo=chislo;
            }
            if(chislo<naiMalko)
            {
                naiMalko=chislo;
            }
        }
        System.out.println("Max number: "+naiGolqmo);
        System.out.println("Min number: "+naiMalko);
    }
}
