// Дано число N. Найти сумму его простых сомножителей.

import java.util.Scanner;

public class Task4_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int divisor = 2, sum = 0;
        while (n > 1){
                while (n % divisor == 0){
                    sum += divisor;
                    n /= divisor;
                }
            divisor += 1;
        }

        System.out.println(sum);
    }
}