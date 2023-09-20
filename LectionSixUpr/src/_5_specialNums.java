import java.util.Scanner;

public class _5_specialNums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for(int i=1111;i<=9999;i++)
        {
            String i_parsed = String.valueOf(i);
            for(int j=0;j<4;j++) {
                int digit = Integer.parseInt(String.valueOf(i_parsed.charAt(j)));
                if(digit==0)
                {
                    break;
                }
                if (n % digit==0)
                {
                    if(j==3)
                    {
                        System.out.printf("%d ",i);
                    }
                }
                else {
                    break;
                }
            }
        }
    }
}
