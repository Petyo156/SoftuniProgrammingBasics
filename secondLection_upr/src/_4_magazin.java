import java.util.Scanner;

public class _4_magazin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double EkskurziqCena = Double.parseDouble(scanner.nextLine());

        int Puzzle = Integer.parseInt(scanner.nextLine());
        double PuzzlePrice = Puzzle*2.6;
        int Kukla = Integer.parseInt(scanner.nextLine());
        double KuklaPrice = Kukla*3;
        int Meche = Integer.parseInt(scanner.nextLine());
        double MechePrice = Meche*4.1;
        int Minyon = Integer.parseInt(scanner.nextLine());
        double MinyonPrice = Minyon*8.2;
        int Kamionche = Integer.parseInt(scanner.nextLine());
        double KamionchePrice = Kamionche*2;

        double ObshtaCena = PuzzlePrice+KuklaPrice+MechePrice+MinyonPrice+KamionchePrice;

        if(Puzzle+Kukla+Meche+Minyon+Kamionche>=50)
        {
            ObshtaCena = ObshtaCena - ObshtaCena*0.25;
        }

        double naem = ObshtaCena*0.1;
        double krainaSuma = ObshtaCena - naem;
        if(krainaSuma>=EkskurziqCena)
        {
            System.out.printf("Yes! %.2f lv left.",(krainaSuma-EkskurziqCena));
        }
        else
        {
            System.out.printf("Not enough money! %.2f lv needed.",(EkskurziqCena-krainaSuma));
        }


    }
}
