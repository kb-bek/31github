//Дано число N. Найти количество таких чисел в диапазоне [1;N], десятичная запись которых
// совпадает с последними цифрами записи их квадрата.

import java.util.Scanner;

public class Task4_14 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;

        for (int i=1; i<n+1; i++){
            int square = i * i;
            String original = Integer.toString(i);
            String squared = Integer.toString(square);

            if (squared.endsWith(original)) {
                System.out.println(i);
                count++;
            }

        }
        System.out.println(count);
    }
}