package ghl_guide;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String adminUsername = "apalon667";
        String adminPassword = "0988300223";

        System.out.print("Enter Username > ");
        String username = scanner.nextLine();
        System.out.print("Enter password > ");
        String password = scanner.nextLine();

        if (username.equals(adminUsername) && password.equals(adminPassword)) {
            System.out.println("Welcome, admin " + adminUsername);
        }else {
            System.out.println("Username or password is incorrect");
        }


    }

}
