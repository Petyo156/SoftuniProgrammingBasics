import java.util.Scanner;

public class _1_oldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String favBook = scanner.nextLine();
        String nextBook = scanner.nextLine();
        int nextBookCount=0;
        boolean NotFound=false;
        while (!nextBook.equals(favBook))
        {
            nextBook = scanner.nextLine();
            if(nextBook.equals("No More Books")){
                NotFound=true;
                System.out.println("The book you search is not here!");
                break;
            }
            nextBookCount++;

        }
        if(NotFound)
        {
            System.out.printf("You checked %d books.",nextBookCount+1);
        }
        else {
            System.out.printf("You checked %d books and found it.", nextBookCount);
        }
    }
}
