import java.util.Scanner;

public class _4_inchtocm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cm = Double.parseDouble(scanner.nextLine());
        double inches = cm*2.54;
        System.out.println(inches);
    }
}
