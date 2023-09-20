import java.util.Scanner;

public class _6_boqdisvane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int predpazenNailon = Integer.parseInt(scanner.nextLine());
        int boq = Integer.parseInt(scanner.nextLine());
        int razreditel = Integer.parseInt(scanner.nextLine());
        int chasoveRabota = Integer.parseInt(scanner.nextLine());
        double cena_nailon = (predpazenNailon+2)*1.5;
        double cena_boq=(boq+boq*0.1)*14.5;
        double razreditel_cena=razreditel*5;
        double torbichki_cena=0.4;

        double razhodiMaterial=cena_boq+cena_nailon+razreditel_cena+torbichki_cena;

        double razhodiMaistoriZaChas=razhodiMaterial*0.3;
        double razhodiMaistori=chasoveRabota*razhodiMaistoriZaChas;

        double result = razhodiMaistori+razhodiMaterial;
        System.out.println(result);

    }
}
