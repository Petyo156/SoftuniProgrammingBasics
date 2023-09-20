import java.util.Scanner;

public class _3_chasut {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());
        min += 15;
        hour+=min/60;
        min%=60;
        if(hour == 24)
        {
            hour=0;
        }
        if(min<10)
        {
            System.out.println(hour+":0"+(min));
        }
        else
        {
            System.out.println(hour+":"+(min));
        }
        }

    }
