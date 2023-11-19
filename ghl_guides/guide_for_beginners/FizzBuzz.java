package ghl_guide;

import java.util.ArrayList;

public class FizzBuzz {
    public static void main(String[] args) {
        ArrayList<String> answer = new ArrayList<String>();

        int n = 15;

        for (int i = 1; i <= n; i++){
            if (i % 3 == 0 && i % 5 == 0){
                answer.add("FizzBuzz");
            }else if (i % 5 == 0){
                answer.add("Buzz");
            }else if (i % 3 == 0){
                answer.add("Fizz");
            }else{
                answer.add(Integer.toString(i));
            }

        }

        System.out.println(answer);
    }
}
