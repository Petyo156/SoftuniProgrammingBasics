import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        /*int count = 5;
        System.out.println(count);
        double number = 5.1;
        System.out.println(number);
        String name = "Ivan";
        System.out.printf(name);
        char c = '@';
        System.out.println(c);*/

        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int area = a*a;
        System.out.println(area);

    }
}
