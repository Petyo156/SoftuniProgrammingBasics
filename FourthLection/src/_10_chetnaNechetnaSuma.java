import java.util.Scanner;

public class _10_chetnaNechetnaSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int evenOrOdd=1;
        int even=0;
        int odd=0;
        for(int i=0;i<n;i++)
        {
            int chislo = Integer.parseInt(scanner.nextLine());
            if(evenOrOdd%2==0)
            {
                even=even+chislo;
            }
            else
            {
                odd=odd+chislo;
            }
            evenOrOdd++;
        }
        if(odd==even)
        {
            System.out.printf("Yes%nSum = "+odd);
        }
        else
        {
            int diff = Math.abs(odd-even);
            System.out.printf("No%nDiff = "+diff);
        }
    }
}
