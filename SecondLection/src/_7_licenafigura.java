import java.util.Scanner;

public class _7_licenafigura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //square, rectangle, circle или triangle
        String choice = scanner.nextLine();
        double result=0;
        if(choice.equals("square"))
        {
            double a = Double.parseDouble(scanner.nextLine());
            result = a*a;
        }
        else if(choice.equals("rectangle"))
        {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            result = a*b;
        }
        else if(choice.equals("circle"))
        {
            double r = Double.parseDouble(scanner.nextLine());
            result = Math.PI*r*r;
        }
        else if(choice.equals("triangle"))
        {
            double a = Double.parseDouble(scanner.nextLine());
            double h = Double.parseDouble(scanner.nextLine());
            result = (a*h)/2;
        }
        System.out.println(result);
    }
}
