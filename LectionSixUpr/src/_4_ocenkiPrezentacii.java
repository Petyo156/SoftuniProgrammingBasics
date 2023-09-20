import java.util.Scanner;

public class _4_ocenkiPrezentacii {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numJudges = Integer.parseInt(scanner.nextLine());
        double grades = 0;
        int presentations = 0;

        String presentation = scanner.nextLine();
        while(!presentation.equals("Finish"))
        {
            ++presentations;
            double gradesSum=0;
            for(int i=1;i<=numJudges;i++)
            {
                double ocenka = Double.parseDouble(scanner.nextLine());
                gradesSum += ocenka;


            }
            grades+=gradesSum;
            System.out.printf("%s - %.2f.%n",presentation, gradesSum/numJudges);
            presentation = scanner.nextLine();
        }
        System.out.printf("Student's final assessment is %.2f.",grades/ ( presentations * numJudges ));
    }
}
