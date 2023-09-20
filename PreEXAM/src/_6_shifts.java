import java.util.Scanner;

public class _6_shifts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());

        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        int validChangesCount=0;
        for (int firstDigit1 = K; firstDigit1 <= 8; firstDigit1++) {
            if(firstDigit1%2==0) {
                for (int secondDigit1 = 9; secondDigit1 >= L; secondDigit1--) {
                    if (secondDigit1 % 2 != 0){
                        for (int firstDigit2 = M; firstDigit2 <= 8; firstDigit2++){
                            if (firstDigit2 % 2 == 0) {
                                for (int secondDigit2 = 9; secondDigit2 >= N; secondDigit2--){
                                    if (secondDigit2 % 2 != 0) {
                                        if (firstDigit1 != firstDigit2 || secondDigit1 != secondDigit2) {
                                            System.out.printf("%d%d - %d%d%n", firstDigit1, secondDigit1, firstDigit2, secondDigit2);
                                            validChangesCount++;
                                            if (validChangesCount >= 6) {
                                                return;
                                            }
                                        }
                                        else{
                                            System.out.println("Cannot change the same player.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
