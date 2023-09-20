import java.util.Scanner;

public class _7_katerachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broiGrupi = Integer.parseInt(scanner.nextLine());
        int pMusala=0; int pMonblan=0; int pKilimandjaro=0; int pK2 =0; int pEverest = 0;
        int vsichkiHora=0;
        for(int i=0;i<broiGrupi;i++)
        {
            int broiHoraVGrupa = Integer.parseInt(scanner.nextLine());
            vsichkiHora+=broiHoraVGrupa;
            if(broiHoraVGrupa<=5)
            {
                pMusala+=broiHoraVGrupa;
            }
            else if(broiHoraVGrupa<=12)
            {
                pMonblan+=broiHoraVGrupa;
            }
            else if(broiHoraVGrupa<=25)
            {
                pKilimandjaro+=broiHoraVGrupa;
            }
            else if(broiHoraVGrupa<=40)
            {
                pK2+=broiHoraVGrupa;
            }
            else
            {
                pEverest+=broiHoraVGrupa;
            }
        }
        double procent1 = (double) pMusala / vsichkiHora * 100;
        double procent2 = (double) pMonblan / vsichkiHora * 100;
        double procent3 = (double) pKilimandjaro / vsichkiHora * 100;
        double procent4 = (double) pK2 / vsichkiHora * 100;
        double procent5 = (double) pEverest / vsichkiHora * 100;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%",procent1,procent2,procent3,procent4,procent5);
    }
}
