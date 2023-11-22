package ghl_guide;

public class Methods {
    public static void main(String[] args) {

        int num1 = 44;
        int num2 = 0;

        System.out.println(division(num1, num2));

    }


    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b){
        try {
            return a / b;
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль невозможно");
        }
        return a / b;
    }
}

