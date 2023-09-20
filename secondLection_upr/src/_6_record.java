import java.util.Scanner;

public class _6_record {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double TimeForMeter = Double.parseDouble(scanner.nextLine());

        double TimeSwimmer = meters*TimeForMeter;
        double Techenie = Math.floor(meters/15)*12.5;

        double Time = Techenie+TimeSwimmer;
        if(Time>=record)
        {
            System.out.printf("No, he failed! He was %.2f seconds slower.", Time-record);
        }
        else
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", Time);
        }
    }
}
