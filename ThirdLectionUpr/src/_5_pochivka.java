import java.util.Scanner;

public class _5_pochivka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String restPlace;
        String restCountry;
        if(season.equals("summer"))
        {
            restPlace="Camp";
        }
        else
        {
            restPlace="Hotel";
        }

        if(budget<=100)
        {
            switch (season) {
                case "summer":
                    budget=budget*0.3;
                    break;
                case "winter":
                    budget=budget*0.7;
                    break;
            }
            restCountry="Bulgaria";
        }
        else if(budget<=1000)
        {
            switch (season) {
                case "summer":
                    budget=budget*0.4;
                    break;
                case "winter":
                    budget=budget*0.8;
                    break;
            }
            restCountry="Balkans";
        }
        else
        {
            restPlace="Hotel";
            budget=budget*0.9;
            restCountry="Europe";
        }
        System.out.printf("Somewhere in %s",restCountry);
        System.out.printf("%n%s - %.2f",restPlace,budget);
    }
}
