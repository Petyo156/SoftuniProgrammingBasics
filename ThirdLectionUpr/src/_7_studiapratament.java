import java.util.Scanner;

public class _7_studiapratament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int broiNoshtuvki = Integer.parseInt(scanner.nextLine());
        double cenaStudio=0;
        double cenaApartament=0;
        switch(month)
        {
            case "May":
            case "October":
                cenaStudio=50*broiNoshtuvki;
                cenaApartament=65*broiNoshtuvki;
                if(broiNoshtuvki>7&&broiNoshtuvki<=14)
                {
                    cenaStudio=cenaStudio-cenaStudio*0.05;
                }
                else if(broiNoshtuvki>14)
                {
                    cenaStudio=cenaStudio-cenaStudio*0.3;
                }
                break;
            case "June":
            case "September":
                cenaStudio=75.2*broiNoshtuvki;
                cenaApartament=68.70*broiNoshtuvki;
                if(broiNoshtuvki>14)
                {
                    cenaStudio=cenaStudio-cenaStudio*0.2;
                }
                break;
            case "July":
            case "August":
                cenaStudio=76*broiNoshtuvki;
                cenaApartament=77*broiNoshtuvki;
                break;
        }
        if(broiNoshtuvki>14)
        {
            cenaApartament=cenaApartament-cenaApartament*0.1;
        }
        System.out.printf("Apartment: %.2f lv.",cenaApartament);
        System.out.printf("%nStudio: %.2f lv.",cenaStudio);

    }
}
