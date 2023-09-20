import java.util.Scanner;

public class _5_godzillakong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int broiStatisti = Integer.parseInt(scanner.nextLine());
        double cenaObleklo = Double.parseDouble(scanner.nextLine());


        double dekor = 0.1*budget;
        if(broiStatisti>150)
        {
            cenaObleklo=cenaObleklo-cenaObleklo*0.1;
        }
        double sumaObleklo = broiStatisti*cenaObleklo;
        double krainaSuma = sumaObleklo+dekor;
        if(budget>=krainaSuma)
        {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.",(budget-krainaSuma));
        }
        else
        {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.",(krainaSuma-budget));
        }
    }
}
