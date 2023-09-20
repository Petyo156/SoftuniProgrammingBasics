import java.util.Scanner;

public class _3_sumalihva {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double depozitna_suma = Double.parseDouble(scanner.nextLine());
        int srok_meseci = Integer.parseInt(scanner.nextLine());
        double lihven_procent = Double.parseDouble(scanner.nextLine());

        double ratePerMonth = (depozitna_suma*(lihven_procent/100))/12;
        double result = depozitna_suma + (srok_meseci*ratePerMonth);
        System.out.println(result);

    }
}
