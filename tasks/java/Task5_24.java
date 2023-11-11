package practical_work1;

import java.util.Arrays;
import java.util.Scanner;

public class Task5_24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        int n = scan.nextInt();

        int[] numbers = new int[n];
        int[] result = new int[n-2];

        for (int i=0; i<n; i++){
            num = scan.nextInt();
            numbers[i] = num;
        }

        for (int j=0; j<numbers.length-2; j++){
            result[j] = (numbers[j] + numbers[j+2])/2;
        }

        System.out.println(Arrays.toString(result));
    }
}
