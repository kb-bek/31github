package practical_work1;

import java.util.*;

public class Task6_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        int[] numbers = new int[l];
        int sum = 0;
        List<Integer> sumOfNums = new ArrayList<>();

        for (int i = 0; i < l; i++) {
            int num = scan.nextInt();
            numbers[i] = num;
        }

        for (int i = 0; i < numbers.length - 2; i++){
            for (int j = i; j < i+3; j++){
                sum += numbers[j];

            }
            sumOfNums.add(sum);
            sum = 0;
        }

        System.out.println(Collections.min(sumOfNums));


    }
}

