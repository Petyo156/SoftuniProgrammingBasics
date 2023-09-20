import java.util.Scanner;

public class _7_pazaruvane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int p = Integer.parseInt(scanner.nextLine());

        double nPrice = 250*n;
        double mPrice = 0.35*nPrice*m;
        double pPrice = 0.1*nPrice*p;

        double finalPrice = nPrice+mPrice+pPrice;
        if(n>m)
        {
            finalPrice = finalPrice - 0.15*finalPrice;
        }

        if (finalPrice == 0) {
            System.out.printf("You have %.2f leva left!", Math.abs(finalPrice - budget));
        } else if (finalPrice <= budget) {
            System.out.printf("You have %.2f leva left!", Math.abs(finalPrice - budget));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(finalPrice - budget));
        }
    }
}
