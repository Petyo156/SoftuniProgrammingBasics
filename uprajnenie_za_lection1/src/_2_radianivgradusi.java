import java.util.Scanner;

public class _2_radianivgradusi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radiani = Double.parseDouble(scanner.nextLine());
        double gradusi = radiani*(180/Math.PI);
        System.out.println(gradusi);
    }
}
