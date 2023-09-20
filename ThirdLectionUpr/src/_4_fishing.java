import java.util.Scanner;

public class _4_fishing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int numOfFishermen = Integer.parseInt(scanner.nextLine());
        double price=0;
        switch(season)
        {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }
        if(numOfFishermen<=6)
        {
            price = price - price*0.1;
        }
        else if(numOfFishermen<=11)
        {
            price = price - price*0.15;
        }
        else
        {
            price = price - price*0.25;
        }
        if(!season.equals("Autumn"))
        {
            if(numOfFishermen%2==0)
            {
                price=price-price*0.05;
            }
        }
        if(budget>=price)
        {
            System.out.printf("Yes! You have %.2f leva left.", budget-price);
        }
        else
        {
            System.out.printf("Not enough money! You need %.2f leva.", price-budget);
        }
    }
}
