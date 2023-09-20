import java.util.Scanner;

public class _2_svetovno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double shirtPrice = Double.parseDouble(scanner.nextLine());
        double sumForBall = Double.parseDouble(scanner.nextLine());

        double ShortsPrice = shirtPrice*0.75;
        double SocksPrice = ShortsPrice*0.2;
        double Butonki = 2*(shirtPrice+ShortsPrice);

        double sum = shirtPrice+ShortsPrice+SocksPrice+Butonki;
        double sumDiscount = sum-0.15*sum;

        if(sumDiscount>sumForBall)
        {
            System.out.printf("Yes, he will earn the world-cup replica ball!%nHis sum is %.2f lv.",sumDiscount);
        }
        else {
            System.out.printf("No, he will not earn the world-cup replica ball.%nHe needs %.2f lv. more.",sumForBall-sumDiscount);
        }
    }
}
