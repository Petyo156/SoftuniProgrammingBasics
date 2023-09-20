import java.util.Scanner;

public class _2_ednakvaSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        for(int i=n;i<=m;i++)
        {
            String currentNum= String.valueOf(i);
            int evenSum=0;
            int oddSum=0;
            for(int j = 0; j<currentNum.length(); j++)
            {
                int digit = Integer.parseInt(String.valueOf(currentNum.charAt(j)));
                if(j % 2 == 0)
                {
                    evenSum += digit;
                }
                else
                {
                    oddSum +=digit;
                }
            }
            if(evenSum==oddSum)
            {
                System.out.print(currentNum+" ");
            }

        }
    }
}
