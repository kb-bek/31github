package ghl_guide;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class WorkWithFiles {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("text");
        Scanner scan = new Scanner(file);
        String line = scan.nextLine();

        String[] strNumbers = line.split(" ");
        int[] numbers = new int[5];
        int counter = 0;


        for(String n: strNumbers){
            numbers[counter++] = Integer.parseInt(n);
        }

        System.out.println(Arrays.toString(strNumbers));
        System.out.println(Arrays.toString(numbers));

        scan.close();
    }
}
