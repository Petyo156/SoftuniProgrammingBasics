import java.util.Scanner;

public class _4_sumTwoDigits
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int finish = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());

        int combination=0;
        boolean isNotMet=true;
        for (int i=start; i<=finish; i++)
        {
            for (int j=start; j<=finish; j++)
            {
                combination++;
                if(i+j==magicNum)
                {
                    isNotMet=false;
                    System.out.printf("Combination N:%d (%d + %d = %d)",combination,i,j,magicNum);
                    break;
                }
            }
            if(!isNotMet)
            {
                break;
            }
        }
        if(isNotMet)
        {
            System.out.printf("%d combinations - neither equals %d",combination,magicNum);
        }

    }
}
