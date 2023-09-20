import java.util.Scanner;

public class _2_elRavenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum=0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            int number = Integer.parseInt(scanner.nextLine());
            sum+=number;
            if(number>max)
            {
                max=number;
            }
        }
        sum=sum-max;
        if(sum==max)
        {
            System.out.printf("Yes%nSum = "+sum);
        }
        else {
            int diff = Math.abs(sum-max);
            System.out.printf("No%nDiff = "+diff);
        }
    }
}
