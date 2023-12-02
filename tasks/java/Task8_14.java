package practical_work1;

import java.util.Scanner;

public class Task8_14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String subStr = scanner.nextLine();
        StringBuffer strB = new StringBuffer(str);
        int n = scanner.nextInt();
        int index = subStr.length();
        int count = 0;

        try {
            for (int i=0; i < str.length()-subStr.length(); i++) {
                if (strB.substring(i, index).equals(subStr)) {
                    strB.delete(i, index);
                    count += 1;
                }
                index += 1;
                if (count == n) break;
            }
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println();
        }

        System.out.println(strB);






    }

//    public static String removeNOccurrences(String mainString, String substring, int n) {
//        StringBuilder result = new StringBuilder();
//        int occurrences = 0;
//        int lastIndex = 0;
//
//        while (occurrences < n) {
//            int index = mainString.indexOf(substring, lastIndex);
//
//            if (index == -1) {
//                break;  // Подстрока больше не найдена
//            }
//
//            result.append(mainString, lastIndex, index);
//            lastIndex = index + substring.length();
//            occurrences++;
//        }
//
//        result.append(mainString.substring(lastIndex));
//
//        return result.toString();
//    }
//
//    public static void main(String[] args) {
//        String mainString = "Denis Ten; Tenis Den";
//        String substring = "en";
//        int n = 2;
//
//        String result = removeNOccurrences(mainString, substring, n);
//
//        System.out.println("Исходная строка: " + mainString);
//        System.out.println("Подстрока для удаления: " + substring);
//        System.out.println("Результат: " + result);
//    }
}
