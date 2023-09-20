import java.util.Scanner;

public class _9_bansko {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dniPrestoi = Integer.parseInt(scanner.nextLine());
        String vidPomeshtenie = scanner.nextLine();
        String ocenka = scanner.nextLine();

        double price=0;
        int noshtuvki=dniPrestoi-1;

        switch (vidPomeshtenie)
        {
            case "room for one person":
                price = 18*noshtuvki;
                break;
            case "apartment":
                price = 25*noshtuvki;
                if(dniPrestoi<=10)
                {
                    price=price-price*0.3;
                }
                else if(dniPrestoi<=15)
                {
                    price=price-price*0.35;
                }
                else {
                    price=price-price*0.5;
                }
                break;
            case "president apartment":
                price = 35*noshtuvki;
                if(dniPrestoi<=10)
                {
                    price=price-price*0.1;
                }
                else if(dniPrestoi<=15)
                {
                    price=price-price*0.15;
                }
                else {
                    price=price-price*0.2;
                }
                break;
        }
        if(ocenka.equals("positive"))
        {
            price = price+price*0.25;
        }
        else {
            price = price-price*0.1;
        }
        System.out.printf("%.2f",price);
    }
}
