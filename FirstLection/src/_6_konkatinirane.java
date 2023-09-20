import java.util.Scanner;

public class _6_konkatinirane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ime1 = scanner.nextLine();
        String ime2 = scanner.nextLine();
        int godini = Integer.parseInt(scanner.nextLine());
        String grad = scanner.nextLine();
        System.out.println("You are " + ime1 +" "+ ime2 +", a "+godini+"-years old person from "+ grad +".");
    }
}
