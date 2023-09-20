import java.util.Scanner;

public class _2_bonusTochki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Integer.parseInt(scanner.nextLine());
        double points = 0;
        if (n < 100) {
            points = 5;
        }
        else if(n>1000)
        {
            points = n*10/100;
        }
        else
        {
            points = n*20/100;
        }

        if(n%2==0)
        {
            points = points+1;
        }
        if(n%10==5)
        {
            points=points+2;
        }
        System.out.println(points);
        System.out.println(points + n);


    }
}
