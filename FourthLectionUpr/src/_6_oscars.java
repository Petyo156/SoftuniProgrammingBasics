import java.util.Scanner;

public class _6_oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nameActor = scanner.nextLine();
        double pointsAcademy = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double allPoints = pointsAcademy;
        for(int i=0;i<n;i++)
        {
            String nameJury = scanner.nextLine();
            double pointsJury = Double.parseDouble(scanner.nextLine());
            pointsJury= (nameJury.length())*(pointsJury/2);
            allPoints+=pointsJury;
            if(allPoints>1250.5)
            {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", nameActor,allPoints);
                return;
            }
        }
        if (allPoints<1250.5) {
            double diff = Math.abs(allPoints-1250.5);
            System.out.printf("Sorry, %s you need %.1f more!", nameActor,diff);
        }
    }
}
