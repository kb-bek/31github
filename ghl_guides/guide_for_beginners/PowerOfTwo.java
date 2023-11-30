package ghl_guide;

public class PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        boolean isPower = false;
        int power = 1;
        for (int i=0; i<n/2; i++) {
            power *= 2;
            if (n == power){
                isPower = true;
                break;
            }
        }

        System.out.println(isPower);
    }
}
