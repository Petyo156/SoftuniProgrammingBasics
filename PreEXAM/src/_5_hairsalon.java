import java.util.Scanner;

public class _5_hairsalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dailyIncome = Integer.parseInt(scanner.nextLine());
        int profit =0;
        String clientPreference = scanner.nextLine();
        boolean success = false;
        while(!clientPreference.equals("closed"))
        {
            if (clientPreference.equals("haircut")) {
                String person = scanner.nextLine();
                if (person.equals("mens")) {
                    profit += 15;
                    if (profit >= dailyIncome) {success = true; break;}
                } else if (person.equals("ladies")) {
                    profit += 20;
                    if (profit >= dailyIncome) {success = true; break;}
                } else if (person.equals("kids")) {
                    profit += 10;
                    if (profit >= dailyIncome) {success = true; break;}
                }
            } else if (clientPreference.equals("color")) {
                String typeColor = scanner.nextLine();
                if (typeColor.equals("touch up")) {
                    profit += 20;
                    if (profit >= dailyIncome) {success = true; break;}
                } else if (typeColor.equals("full color")) {
                    profit += 30;
                    if (profit >= dailyIncome) {success = true; break;}
                }
            }
            clientPreference = scanner.nextLine();
        }
        if(success)
        {
            System.out.printf("You have reached your target for the day!%n");
            System.out.printf("Earned money: %dlv.",profit);
        }
        else {
            System.out.printf("Target not reached! You need %dlv. more.%n",dailyIncome-profit);
            System.out.printf("Earned money: %dlv.",profit);
        }
    }
}
