import java.util.Scanner;

public class SubstitutionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int K = Integer.parseInt(scanner.nextLine());
        int L = Integer.parseInt(scanner.nextLine());
        int M = Integer.parseInt(scanner.nextLine());
        int N = Integer.parseInt(scanner.nextLine());

        int count = 0;

        for (int i = K; i <= 8; i++) {
            for (int j = 9; j <= L; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    count += processCombinations(i, j, M, N, count);
                }
            }
        }

        if (count == 0) {
            System.out.println("Cannot change the same player.");
        }

        scanner.close();
    }

    private static int processCombinations(int i, int j, int M, int N, int count) {
        int validCount = 0;

        for (int k = M; k <= 8; k++) {
            for (int l = 9; l <= N; l++) {
                if (k % 2 == 0 && l % 2 != 0 && (i * 10 + j) != (k * 10 + l)) {
                    System.out.println(i + "" + j + " - " + k + "" + l);
                    validCount++;

                    if (validCount + count >= 6) {
                        return validCount;
                    }
                }
            }
        }

        return validCount;
    }
}