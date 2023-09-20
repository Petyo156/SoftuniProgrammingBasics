import java.util.Scanner;

public class _7_Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int jilishte = w*l*y;
        int svobodnoMqsto=0;
        String input = scanner.nextLine();
        while(!input.equals("Done")){
            int boxes = Integer.parseInt(input);
            svobodnoMqsto+=boxes;
            if(svobodnoMqsto>=jilishte)
            {
                System.out.printf("No more free space! You need %d Cubic meters more.",svobodnoMqsto-jilishte);
                break;
            }
            input = scanner.nextLine();
        }
        if(svobodnoMqsto<=jilishte){
            System.out.printf("%d Cubic meters left.",jilishte-svobodnoMqsto);
        }
    }
}
