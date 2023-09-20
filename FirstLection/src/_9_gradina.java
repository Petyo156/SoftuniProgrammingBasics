import java.util.Scanner;

public class _9_gradina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sqrMeters = Double.parseDouble(scanner.nextLine());
        double amount = sqrMeters*7.61;
        double discount = amount*0.18;
        double sumafterdiscount=amount-discount;
        System.out.printf("The final price is: %.2f lv.%n",sumafterdiscount);
        System.out.printf("The discount is: %.2f lv.",discount);
    }
}
