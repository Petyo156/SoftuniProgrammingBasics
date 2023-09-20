import java.util.Scanner;

public class _8_basketball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int godishnaTaksa = Integer.parseInt(scanner.nextLine());
        double cenaKecove = godishnaTaksa - (0.4*godishnaTaksa);
        double cenaEkip = cenaKecove - (0.2*cenaKecove);
        double cenaTopka = cenaEkip/4;
        double cenaAksesoari = cenaTopka/5;
        double result = godishnaTaksa+cenaAksesoari+cenaEkip+cenaKecove+cenaTopka;
        System.out.println(result);
    }
}
