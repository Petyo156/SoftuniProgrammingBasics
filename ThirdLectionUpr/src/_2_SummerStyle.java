import java.util.Scanner;

public class _2_SummerStyle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String vreme = scanner.nextLine();
        String Outfit="a";
        String Shoes="a";
        if(10 <= degrees&&degrees <= 18)
        {
            switch(vreme)
            {
                case "Morning":
                    Outfit = "Sweatshirt";
                    Shoes = "Sneakers";
                    break;
                case "Afternoon":
                case "Evening":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    break;
            }
        }
        else if(18 < degrees&&degrees <= 24)
        {
            switch(vreme)
            {
                case "Morning":
                case "Evening":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                            break;
                case "Afternoon":
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                    break;
            }
        }
        else
        {
            switch(vreme)
            {
                case "Morning":
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                    break;
                case "Afternoon":
                    Outfit = "Swim Suit";
                    Shoes = "Barefoot";
                    break;
                case "Evening":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    break;
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",degrees,Outfit,Shoes);
    }
}
