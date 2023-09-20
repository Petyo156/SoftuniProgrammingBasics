import java.util.Scanner;

public class _8_chaszaizpit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hourExam=Integer.parseInt(scanner.nextLine());
        int minExam=Integer.parseInt(scanner.nextLine());

        int hourArrival=Integer.parseInt(scanner.nextLine());
        int minArrival=Integer.parseInt(scanner.nextLine());

        int examTimeMinutes = hourExam*60+minExam;
        int arrivalTimeMinutes = hourArrival*60+minArrival;

        int diffMins = examTimeMinutes-arrivalTimeMinutes;
        String output;

        if(diffMins>=0&&diffMins<=30)
        {
            output = "On time";
        }
        else if(diffMins>30)
        {
            output="Early";
        }
        else
        {
            output="Late";
        }
        System.out.println(output);
        String arrivalPeriod;
        if(diffMins>0)
        {
            arrivalPeriod="before";
        }
        else
        {
            arrivalPeriod="after";
        }

        diffMins=Math.abs(diffMins);
        if(diffMins<60)
        {
            System.out.printf("%d minutes %s the start", diffMins, arrivalPeriod);
        }
        else
        {
            System.out.printf("%d:%02d hours %s the start", diffMins/60,diffMins%60,arrivalPeriod);
        }
    }
}
