import java.util.Scanner;

public class _3_chislaINachalnoChislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = 0;
        int sum = 0;
        while(sum<a)
        {
            b = Integer.parseInt(scanner.nextLine());
            sum+=b;
        }
        System.out.println(sum);
    }
}
