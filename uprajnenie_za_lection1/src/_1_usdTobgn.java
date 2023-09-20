import java.util.Scanner;

public class _1_usdTobgn {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double usd = Double.parseDouble(scanner.nextLine());
        double bgn = 1.7954*usd;
        System.out.println(bgn);


    }
}
