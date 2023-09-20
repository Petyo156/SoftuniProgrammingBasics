import java.util.Scanner;

public class _9_lqvaDqsnaSuma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1=Integer.parseInt(scanner.nextLine());
        int num1; int num2;
        int result1=0;
        int result2=0;
        for(int i=0;i<n1;i++ )
        {
            num1=Integer.parseInt(scanner.nextLine());
            result1=result1+num1;
        }
        for(int i=0;i<n1;i++ )
        {
            num2=Integer.parseInt(scanner.nextLine());
            result2=result2+num2;
        }
        if(result1==result2)
        {
            System.out.println("Yes, sum = " + result1);
        }
        else
        {
            int diff = Math.abs(result1-result2);
            System.out.println("No, diff = " + diff);
        }
    }
}
