package practical_work1;

import java.util.Scanner;

public class Task7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] numbers = new int[n][n];
        int c = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                numbers[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int z = 0; z < n; z++){
                    if (numbers[i][z] == numbers[z][j]){
                        c += 1;
                    }

                }
                if (c == n) {
                    System.out.println(i);
                }

                c = 0;

            }

        }
    }
}

