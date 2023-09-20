import java.util.Scanner;

public class _4_poznaiparolata {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = "s3cr3t!P@ssw0rd";
        String b = scanner.nextLine();
        if(a.equals(b))
        {
            System.out.println("Welcome");
        }
        else {
            System.out.println("Wrong password!");
        }
    }
}
