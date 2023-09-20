import java.util.Scanner;

public class _3_sumProstiNeprosti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int sumProsti=0;
        int sumNeprosti=0;
        while(!command.equals("stop"))
        {
            int num = Integer.parseInt(command);
            if(num<0){
                System.out.println("Number is negative.");
                command = scanner.nextLine();
                continue;
            }

            boolean isPrimeNum = true;
            for(int i =2;i<num;i++){
                if(num % i == 0){
                    isPrimeNum=false;
                    break;
                }
            }

            if(isPrimeNum) {
                sumProsti+=num;
            }
            else {
                sumNeprosti +=num;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Sum of all prime numbers is: %d%n",sumProsti);
        System.out.printf("Sum of all non prime numbers is: %d",sumNeprosti);
    }
}
