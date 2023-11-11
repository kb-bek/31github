package practical_work1;

import com.sun.security.auth.UnixNumericGroupPrincipal;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task6_14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int l = scan.nextInt();
        Set<Integer> setNums = new HashSet<>();
        for (int i = 0; i < l; i++) {
            setNums.add(scan.nextInt());
        }

        System.out.println(setNums.size());



    }
}
