import java.util.Scanner;

public class _3_Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceTrip = Double.parseDouble(scanner.nextLine());
        double moneyJesse = Double.parseDouble(scanner.nextLine());
        int count = 0;
        int days = 0;
        double sum = 0;
        boolean Money = true;
        String option = scanner.nextLine();
        while(moneyJesse<=priceTrip){
            if(option.equals("spend")) {
                sum = Double.parseDouble(scanner.nextLine());
                moneyJesse-=sum;
                if(moneyJesse<0){
                    moneyJesse=0;
                }
                count++;
                if(count==5) {
                    days++;
                    System.out.printf("You can't save the money.%n%d",days);
                    Money = false;
                    break;
                }
                days++;
                if(moneyJesse>=priceTrip) {
                    break;
                }
                option = scanner.nextLine();
            }
            else if(option.equals("save")){
                sum = Double.parseDouble(scanner.nextLine());
                moneyJesse+=sum;
                count = 0;
                days++;
                if(moneyJesse>=priceTrip) {
                    break;
                }
                option = scanner.nextLine();
            }


        }
        if(Money) {
            System.out.printf("You saved the money for %d days.",days);
        }
    }
}
