import java.util.Scanner;

public class _4_umnaLili {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int LiliAge=Integer.parseInt(scanner.nextLine());
        double cenaPeralnq=Double.parseDouble(scanner.nextLine());
        int cenaIgrachka = Integer.parseInt(scanner.nextLine());
        int BirthdayMoney=0;
        int igrachki=0;
        int money;
        int moneyFromToys=0;
        int kradeniPari=0;
        int help=1;
        for(int i=1;i<=LiliAge;i++)
        {
            if(i%2==0)
            {

                BirthdayMoney+=10*help;
                help++;
                kradeniPari++;
            }
            else{
                igrachki++;
            }
        }
        moneyFromToys=igrachki*cenaIgrachka;
        money=moneyFromToys+BirthdayMoney-kradeniPari;
        if(money>=cenaPeralnq)
        {
            System.out.printf("Yes! %.2f",(money-cenaPeralnq));
        }
        else {
            System.out.printf("No! %.2f",(cenaPeralnq-money));
        }

    }
}
