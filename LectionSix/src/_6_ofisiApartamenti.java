import java.util.Scanner;

public class _6_ofisiApartamenti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int etaji = Integer.parseInt(scanner.nextLine());
        int stai = Integer.parseInt(scanner.nextLine());
        for(int i=etaji; i>0; i--)
        {
            for (int j=0; j<stai; j++)
            {
                if(i==etaji)
                {
                    System.out.printf("L%d%d ",i,j);
                }
                else if(i%2==0) {
                    System.out.printf("O%d%d ",i,j);
                }
                else{
                    System.out.printf("A%d%d ",i,j);
                }
            }
            System.out.printf("%n");
        }
    }
}
