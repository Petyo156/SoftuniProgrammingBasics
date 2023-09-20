import java.util.Scanner;

public class _3_excursionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        double price=0;

        switch (season){
            case "spring":
                if(numOfPeople<=5)
                {
                    price=numOfPeople*50;
                }
                else {
                    price=numOfPeople*48;
                }
                break;
            case "autumn":
                if(numOfPeople<=5)
                {
                    price = numOfPeople*60;
                }
                else
                {
                    price = numOfPeople*49.5;
                }
                break;
            case "summer":
                if(numOfPeople<=5)
                {
                    price = numOfPeople*48.5;
                }
                else
                {
                    price = numOfPeople*45;
                }
                price -= price*0.15;
                break;
            case "winter":
                if(numOfPeople<=5)
                {
                    price = numOfPeople*86;
                }
                else
                {
                    price = numOfPeople*85;
                }
                price += price*0.08;
                break;
        }
        System.out.printf("%.2f leva.",price);
    }
}
