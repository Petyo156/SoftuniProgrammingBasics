import java.util.Scanner;

public class _3_procentiIgluposti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int p1Broi=0;
        int p2Broi=0;
        int p3Broi=0;
        int p4Broi=0;
        int p5Broi=0;
        for(int i=0;i<n;i++)
        {
            int newNum = Integer.parseInt(scanner.nextLine());
            if(newNum<200){
                p1Broi++;
            }
            else if(newNum<400){
                p2Broi++;
            }
            else if(newNum<600){
                p3Broi++;
            }
            else if(newNum<800){
                p4Broi++;
            }
            else
            {
                p5Broi++;
            }
        }
        double p1 = (double) p1Broi/n*100;
        double p2 = (double)p2Broi/n*100;
        double p3 = (double)p3Broi/n*100;
        double p4 = (double)p4Broi/n*100;
        double p5 = (double)p5Broi/n*100;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%",p1,p2,p3,p4,p5);

    }
}
