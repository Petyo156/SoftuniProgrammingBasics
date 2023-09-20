import java.util.Scanner;

public class _1_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String projectionType = scanner.nextLine();
        int numRedove = Integer.parseInt(scanner.nextLine());
        int numKoloni = Integer.parseInt(scanner.nextLine());
        double result = 0;

        if(projectionType.equals("Premiere"))
        {
            result = 12.00*numRedove*numKoloni;
        }
        else if(projectionType.equals("Normal"))
        {
            result = 7.50 *numRedove*numKoloni;
        }
        else if(projectionType.equals("Discount"))
        {
            result = 5.00 *numRedove*numKoloni;
        }
        System.out.printf("%.2f",result);


    }
}
