import java.util.Scanner;

public class _7_restaurant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ChickenMenus = Integer.parseInt(scanner.nextLine());
        int FishMenus = Integer.parseInt(scanner.nextLine());
        int VeganMenus = Integer.parseInt(scanner.nextLine());

        double chickenPrice = ChickenMenus*10.35;
        double fishPrice = FishMenus*12.4;
        double veganPrice = VeganMenus*8.15;
        double MenusPrice = chickenPrice+fishPrice+veganPrice;
        double dessert_price = MenusPrice*0.2;

        double total = MenusPrice+dessert_price+2.5;
        System.out.println(total);
    }
}
