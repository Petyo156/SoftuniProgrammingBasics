import java.util.Scanner;

public class _2_examPrep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nezOcenki=Integer.parseInt(scanner.nextLine());
        String ImeZad=scanner.nextLine();
        int sum=0;
        double allOce=0;
        int count=0;
        String poslednaZad="";
        boolean rest = true;
        while(!ImeZad.equals("Enough"))
        {
            int Ocenka = Integer.parseInt(scanner.nextLine());
            if(Ocenka<=4){
                count++;
                if(count==nezOcenki)
                {
                    System.out.printf("You need a break, %d poor grades.",count);
                    rest = false;
                    break;
                }
            }
            allOce+=Ocenka;
            sum++;
            poslednaZad = ImeZad;
            ImeZad=scanner.nextLine();


        }
        if(rest) {
            double avgScore = allOce / sum;
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", avgScore, sum, poslednaZad);
        }
    }
}
