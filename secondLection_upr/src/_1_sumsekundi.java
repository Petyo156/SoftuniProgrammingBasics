import java.util.Scanner;

public class _1_sumsekundi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum1 = Integer.parseInt(scanner.nextLine());
        int sum2 = Integer.parseInt(scanner.nextLine());
        int sum3 = Integer.parseInt(scanner.nextLine());

        int sumAll = sum1 + sum2 + sum3;

        int minutes = sumAll/60;
        int seconds = sumAll%60;

        if(seconds<10){
            System.out.println(minutes+":0"+seconds);
        }
        else
        {
            System.out.println(minutes+":"+seconds);
        }



    }
}
