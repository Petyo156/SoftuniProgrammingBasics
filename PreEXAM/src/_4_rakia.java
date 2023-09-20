import java.util.Scanner;

public class _4_rakia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double liter=0;
        double degrees=0;
        double sbor_gradusi=0;
        double sbor_gradusi_liter = 0;
        double sbor_liters=0;
        for(int i=0;i<days;i++)
        {
            liter = Double.parseDouble(scanner.nextLine());
            degrees = Double.parseDouble(scanner.nextLine());
            sbor_gradusi=degrees*liter;
            sbor_gradusi_liter+=sbor_gradusi;
            sbor_liters+=liter;
        }
        double avgDegrees = sbor_gradusi_liter/sbor_liters;

        System.out.printf("Liter: %.2f%nDegrees: %.2f%n",sbor_liters,avgDegrees);
        if(avgDegrees<38){
            System.out.println("Not good, you should baking!");
        }
        else if(avgDegrees<=42){
            System.out.println("Super!");
        }
        else{
            System.out.println("Dilution with distilled water!");
        }
    }
}
