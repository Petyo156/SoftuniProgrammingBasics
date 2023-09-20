import java.util.Scanner;

public class _6_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1=Integer.parseInt(scanner.nextLine());
        int n2=Integer.parseInt(scanner.nextLine());
        double result=0;
        String operation = scanner.nextLine();
        switch (operation)
        {
            case "+":
                result=n1+n2;
                break;
            case "-":
                result=n1-n2;
                break;
            case "*":
                result=n1*n2;
                break;
            case "/":
                if(n2==0){
                    System.out.printf("Cannot divide %d by zero",n1);
                    return;
                }
                result= (double) n1 /n2;
                break;
            case "%":
                if(n2==0){
                    System.out.printf("Cannot divide %d by zero",n1);
                    return;
                }
                result=n1%n2;
                break;
        }

        if(operation.equals("+")||operation.equals("-")||operation.equals("*"))
        {
            String resultStat;
            if(result%2==0){resultStat="even";}
            else{resultStat="odd";}
            System.out.printf("%d %s %d = %.0f - %s",n1,operation,n2,result,resultStat);
        }
        else if(operation.equals("/"))
        {
            System.out.printf("%d / %d = %.2f",n1,n2,result);
        }
        else if(operation.equals("%"))
        {
            System.out.printf("%d %% %d = %.0f",n1,n2,result);
        }
    }
}
