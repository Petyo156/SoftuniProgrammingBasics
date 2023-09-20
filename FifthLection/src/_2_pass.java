import java.util.Scanner;

public class _2_pass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String pass = scanner.nextLine();
        String pass1="";
        while(!pass.equals(pass1))
        {
            pass1=scanner.nextLine();
        }
        System.out.printf("Welcome %s!",username);
    }
}
