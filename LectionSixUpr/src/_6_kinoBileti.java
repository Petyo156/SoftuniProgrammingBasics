import java.util.Scanner;

public class _6_kinoBileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int kids=0;
        int students=0;
        int standarts=0;

        int seat=0;
        while(!name.equals("Finish"))
        {
            int freeSeats = Integer.parseInt(scanner.nextLine());
            for(int i = 0; i<freeSeats; i++)
            {
                String command = scanner.nextLine();

                while(!command.equals("End"))
                {
                    if(command.equals("student"))
                    {
                        students++;
                    }
                    else if(command.equals("standard"))
                    {
                        standarts++;
                    }
                    else if(command.equals("kid"))
                    {
                        kids++;
                    }

                    if(!command.equals("End"))
                    seat++;

                    command = scanner.nextLine();
                }
            }
            System.out.printf("%s - %.2f% full.",name,(double)seat/freeSeats*100);
        }
        int allTickets = kids + standarts + students;

        if(allTickets!=0)
        System.out.printf("Total tickets: %d%n%.2f%% student tickets.%n%.2f%% standard tickets.%n%.2f%% kids tickets",allTickets,students/allTickets*100,standarts/allTickets*100,kids/allTickets*100);

    }
}
