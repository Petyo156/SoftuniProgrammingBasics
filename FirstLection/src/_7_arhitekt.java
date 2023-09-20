import java.util.Scanner;

public class _7_arhitekt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ime = scanner.nextLine();
        int proekti = Integer.parseInt(scanner.nextLine());
        int chasove = proekti*3;
        System.out.printf("The architect "+ime+" will need "+chasove+" hours to complete "+proekti+" project/s.");
    }
}
