import java.util.Scanner;

public class _5_putuvaniq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String destination;
        destination=scanner.nextLine();
        while(!(destination.equals("End"))){
                double pariDestination = Double.parseDouble(scanner.nextLine());
                double subraniPari = 0;
                while (subraniPari < pariDestination) {
                    double pari = Double.parseDouble(scanner.nextLine());
                    subraniPari += pari;
                }
            System.out.printf("Going to %s!%n", destination);
            destination=scanner.nextLine();
        }
    }
}
