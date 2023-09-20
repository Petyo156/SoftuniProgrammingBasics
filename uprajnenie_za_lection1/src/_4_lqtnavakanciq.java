import java.util.Scanner;

public class _4_lqtnavakanciq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broi_str = Integer.parseInt(scanner.nextLine());
        int stranici_za_chas = Integer.parseInt(scanner.nextLine());
        int dni = Integer.parseInt(scanner.nextLine());

        int broi_chasove= broi_str/stranici_za_chas;
        int broi_chasove_na_den=broi_chasove/dni;
        System.out.println(broi_chasove_na_den);

    }
}
