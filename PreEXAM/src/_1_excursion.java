import java.util.Scanner;

public class _1_excursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        int transportCards = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());

        double sumPerson = nights*20 + transportCards*1.6 + tickets*6;
        double sumGroup = sumPerson*numOfPeople;

        double allSum = sumGroup + 0.25*sumGroup;

        System.out.printf("%.2f",allSum);
    }
}
