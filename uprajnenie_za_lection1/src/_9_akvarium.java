import java.util.Scanner;

public class _9_akvarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int DuljinaCM = Integer.parseInt(scanner.nextLine());
        int ShirochinaCM = Integer.parseInt(scanner.nextLine());
        int VisochinaCM = Integer.parseInt(scanner.nextLine());
        double procent = Double.parseDouble(scanner.nextLine());

        double ObemAkvarium = DuljinaCM*ShirochinaCM*VisochinaCM;
        double ObemVLitri = ObemAkvarium*0.001;
        double zaetoProstranstvo = procent/100;

        double nujniLitri=ObemVLitri*(1-zaetoProstranstvo);
        System.out.println(nujniLitri);

    }
}
