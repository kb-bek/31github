package practical_work1;

import java.util.Scanner;

public class Task8_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] strArr = str.toCharArray();
        int index = strArr.length;
        for (char s: strArr) {
            if (s == ' ') {
                index += 1;
            }
        }

        char[] resArr = new char[index];
        int j = 0;
        for (int i = 0; i < strArr.length; i++) {
            resArr[j] = strArr[i];
            if (strArr[i] == ' ') {
                resArr[j+1] = ',';
                j++;
            }
            j++;
        }

        str = String.valueOf(resArr);
        System.out.println(str);

    }
}
