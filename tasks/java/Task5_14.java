package practical_work1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task5_14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] numbers = new int[n];
        List<Integer> result = new ArrayList<>();

        long num1 = 0, num2 = 1, next_num = num2;
        int count = 1;
        int maxNum = numbers[0];

        for (int i=0; i<numbers.length; i++){
            int num = scan.nextInt();
            numbers[i] = num;
            if (numbers[i] > maxNum){
                maxNum = numbers[i];
            }

        }
        List<Long> fibNumbers = new ArrayList<Long>();

        while (count <= maxNum/2){
            fibNumbers.add(next_num);
            count++;
            num1 = num2;
            num2 = next_num;
            next_num = num1 + num2;
        }

        for (int i=0; i<numbers.length; i++){
            for (int j=0; j < fibNumbers.size(); j++){
                if (numbers[i] == fibNumbers.get(j)){
                    result.add(numbers[i]);
                }
            }
        }

        System.out.println(result);




    }
}
