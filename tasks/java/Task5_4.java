package practical_work1;

import java.util.Arrays;
import java.util.Scanner;

public class Task5_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        int maxNum = numbers[0];

        for (int i=0; i<n; i++) {
            int num = scan.nextInt();
            numbers[i] = num;
            if (numbers[i] > maxNum)
                maxNum = numbers[i];
        }

        for (int j=0; j<numbers.length; j++){
            if (numbers[j] == maxNum){
                for (int z=j+1; z<numbers.length; z++){
                    numbers[z] = maxNum;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));

    }
}


