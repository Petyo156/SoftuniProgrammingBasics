import java.util.Scanner;

public class _5_bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum=0;
        String payment=scanner.nextLine();
        while(!payment.equals("NoMoreMoney"))
        {
            if(Double.parseDouble(payment)<0)
            {
                System.out.println("Invalid operation!");
                break;
            }
            System.out.printf("Increase: %.2f%n",Double.parseDouble(payment));
            sum += Double.parseDouble(payment);
            payment = scanner.nextLine();
        }

        System.out.printf("Total: %.2f",sum);
    }
}
