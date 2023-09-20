import java.util.Scanner;

public class _7_sumChisla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broiChisla = Integer.parseInt(scanner.nextLine());
        int sum=0;
        for(int i = 0; i<broiChisla; i++)
        {
            int chislo = Integer.parseInt(scanner.nextLine());
            sum=sum+chislo;
        }
        System.out.println(sum);

    }
}
