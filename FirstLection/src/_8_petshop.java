import java.util.Scanner;

public class _8_petshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hranakuchetaop = Integer.parseInt(scanner.nextLine());
        int hranakotkiop = Integer.parseInt(scanner.nextLine());
        double result = hranakotkiop*4+hranakuchetaop*2.5;
        System.out.println(result);
    }
}
