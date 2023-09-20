import java.util.Scanner;

public class _5_payment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int globa = 0;
        for(int i=0;i<n;i++)
        {
            String site = scanner.nextLine();
            if(site.equals("Facebook")){
                globa+=150;
            }
            else if(site.equals("Instagram")){
                globa+=100;
            }
            else if(site.equals("Reddit")){
                globa+=50;
            }
            if(globa>=salary)
            {
                System.out.println("You have lost your salary.");
                return;
            }
        }
        System.out.println(salary-globa);
    }
}
