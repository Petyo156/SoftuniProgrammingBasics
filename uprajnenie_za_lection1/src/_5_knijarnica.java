import java.util.Scanner;

public class _5_knijarnica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int broiHimikali=Integer.parseInt(scanner.nextLine());
        int broiMarkeri=Integer.parseInt(scanner.nextLine());
        int litriPreparat=Integer.parseInt(scanner.nextLine());
        int procentNamalenie=Integer.parseInt(scanner.nextLine());
        double pensPrice=5.8*broiHimikali;
        double markersPrice = 7.2*broiMarkeri;
        double preparatPrice = 1.2*litriPreparat;

        double sum = pensPrice+markersPrice+preparatPrice;
        double result = sum-(sum*procentNamalenie/100);
        System.out.println(result);
    }
}
