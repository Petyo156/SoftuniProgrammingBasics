import java.util.Scanner;

public class _8_Lunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int EpMins = Integer.parseInt(scanner.nextLine());
        int Rest = Integer.parseInt(scanner.nextLine());

        double Lunch = Rest/8.0;
        double Otdih = Rest/4.0;

        double OstavashtaPochivka = Rest-Lunch-Otdih;
        double Time = Math.abs(OstavashtaPochivka-EpMins);
        if(OstavashtaPochivka>=EpMins)
        {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", name, Math.ceil(Time));
        }
        else
        {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", name, Math.ceil(Time));
        }
    }
}
