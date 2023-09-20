import java.util.Scanner;

public class _5_coins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rest = scanner.nextInt();

        int count10 = 0; // Брой монети от 10 стотинки
        int count5 = 0; // Брой монети от 5 стотинки
        int count2 = 0; // Брой монети от 2 стотинки
        int count1 = 0; // Брой монети от 1 стотинка

        while (rest > 0) {
            if (rest >= 10) {
                count10++;
                rest -= 10;
            } else if (rest >= 5) {
                count5++;
                rest -= 5;
            } else if (rest >= 2) {
                count2++;
                rest -= 2;
            } else {
                count1++;
                rest -= 1;
            }
        }
        if (count10 > 0) {
            System.out.println(count10);
        }
        if (count5 > 0) {
            System.out.println(count5);
        }
        if (count2 > 0) {
            System.out.println(count2);
        }
        if (count1 > 0) {
            System.out.println(count1);
        }
    }
}