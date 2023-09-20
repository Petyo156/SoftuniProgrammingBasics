import java.util.Scanner;

public class _4_walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int allSteps=0;
        int diff;
        int steps = 0;
        boolean isReached = false;

        String Steps = scanner.nextLine();
        while(!Steps.equals("Going home")) {
            steps = Integer.parseInt(Steps);
            allSteps+=steps;
            if(allSteps>=10000){
                diff = allSteps-10000;
                isReached=true;
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!",diff);
                break;
            }
            Steps = scanner.nextLine();
        }
        if(!isReached) {
            Steps = scanner.nextLine();
            steps = Integer.parseInt(Steps);
            allSteps+=steps;
            diff = allSteps-10000;
            if(allSteps>=10000){
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!",diff);
            }
            else{
                System.out.printf("%d more steps to reach goal.",Math.abs(diff));
            }

        }
    }
}
