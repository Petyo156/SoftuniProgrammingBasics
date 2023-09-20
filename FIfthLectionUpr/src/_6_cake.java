import java.util.Scanner;

public class _6_cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shirochina = Integer.parseInt(scanner.nextLine());
        int duljina = Integer.parseInt(scanner.nextLine());
        int broiParcheta = shirochina*duljina;
        String broiParchetaZaGosti = scanner.nextLine();
        int numOfPieces=0;
        int allPieces=0;
        boolean yes = true;
        while(!broiParchetaZaGosti.equals("STOP")){
            numOfPieces = Integer.parseInt(broiParchetaZaGosti);
            allPieces+=numOfPieces;
            if(broiParcheta<allPieces)
            {
                System.out.printf("No more cake left! You need %d pieces more.",allPieces-broiParcheta);
                yes = false;
                break;
            }
            broiParchetaZaGosti = scanner.nextLine();
        }
        if(yes) {
            System.out.printf("%d pieces are left.", broiParcheta - allPieces);
        }
    }
}
