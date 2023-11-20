package ghl_guide;

public class Arrays {

    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 67;
        numbers[1] = 23;
        numbers[2] = 89;
        numbers[3] = 7;
        numbers[4] = 33;

        for (int n : numbers){
            if (n % 3 == 0)
                System.out.print(n + " ");
        }
    }

}
