import java.util.Scanner;

public class _3_gradina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vidCvete = scanner.nextLine();
        int broiCvetq = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double price=0;
        if(vidCvete.equals("Roses"))
        {
            price=broiCvetq*5;
            if(broiCvetq>80)
            {
                price=price-price*0.1;
            }
        }
        if(vidCvete.equals("Dahlias"))
        {
            price=broiCvetq*3.8;
            if(broiCvetq>90)
            {
                price=price-price*0.15;
            }
        }
        if(vidCvete.equals("Tulips"))
        {
            price=broiCvetq*2.8;
            if(broiCvetq>80)
            {
                price=price-price*0.15;
            }
        }
        if(vidCvete.equals("Narcissus"))
        {
            price=broiCvetq*3;
            if(broiCvetq<120)
            {
                price=price+price*0.15;
            }
        }
        if(vidCvete.equals("Gladiolus"))
        {
            price=broiCvetq*2.5;
            if(broiCvetq<80)
            {
                price=price+price*0.2;
            }
        }

        if(budget>=price)
        {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",broiCvetq,vidCvete,budget-price);
        }
        else
        {
            System.out.printf("Not enough money, you need %.2f leva more.",price-budget);
        }

    }
}
