import java.util.Scanner;

public class _6_sumGlasni {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int num=0;
        for (int i = 0; i < name.length(); i++)
        {
            if(name.charAt(i)=='a')
            {
                num+=1;
            }
            else if(name.charAt(i)=='e')
            {
                num+=2;
            }
            else if(name.charAt(i)=='i')
            {
                num+=3;
            }
            else if(name.charAt(i)=='o')
            {
                num+=4;
            }
            else if(name.charAt(i)=='u')
            {
                num+=5;
            }
        }
        System.out.println(num);
    }
}
