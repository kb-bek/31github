package practical_work1;

import java.util.Scanner;

public class Task7_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int n2 = scanner.nextInt();
        int[][] numbers = new int[n][n2];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        for (int i = 1; i < n-1; i++) {
            for (int j = 0; j < n; j++) {
                if (numbers[i][j] > numbers[i-1][j] && numbers[i][j] < numbers[i+1][j]){
                    count += 1;
                }
//                System.out.println(numbers[i-1][j] + " " + numbers[i][j] + " " + numbers[i+1][j]);
            }
        }

        System.out.println(count);
    }
}
