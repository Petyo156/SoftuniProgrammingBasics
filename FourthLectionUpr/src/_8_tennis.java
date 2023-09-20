import java.util.Scanner;

public class _8_tennis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        double startingPoints = Double.parseDouble(scanner.nextLine());
        double Points = 0;
        double WR=0;
        for(int i=0;i<n;i++)
        {
            String etap = scanner.nextLine();
            switch (etap)
            {
                case "W":
                    WR++;
                    Points+=2000;
                    break;
                case "F":
                    Points+=1200;
                    break;
                case "SF":
                    Points+=720;
                    break;
            }
        }
        double AvgPoints = Math.floor(Points/n);
        double Winrate = WR/n*100;
        System.out.printf("Final points: %.0f%nAverage points: %.0f%n%.2f%%",Points+startingPoints,AvgPoints,Winrate);

    }
}
